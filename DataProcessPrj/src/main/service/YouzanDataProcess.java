package main.service;

import java.io.File;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import main.dao.RetailFoodDAO;
import main.dao.SalesCompaignDAO;
import main.dao.SalesOrderDAO;
import main.models.RetailFood;
import main.models.SalesCampaign;
import main.models.SalesOrder;
import main.util.ExcelUtil;

public class YouzanDataProcess {

	private ArrayList<SalesOrder> soList;

	/**
	 * Data process
	 * 
	 * @throws SQLException
	 */
	public void dataProcess(String filePath) throws SQLException {
		soList = new ArrayList<SalesOrder>();

		// 1.���ݶ�ȡ
		// 1.1 ��Ʒ���ȡ
		RetailFoodDAO rfDao = new RetailFoodDAO();
		ArrayList<RetailFood> rfList = rfDao.selectRetailFoodList();
		System.out.println("1. RetailFood data loaded");

		// 1.2 ����ȡ
		SalesCompaignDAO scDao = new SalesCompaignDAO();
		ArrayList<SalesCampaign> scList = scDao.selectSalesCampaignList();
		System.out.println("2. SalesCampaign data loaded");

		// 1.3 Excel�ļ���ȡ
		File file = new File(filePath);
		ArrayList<ArrayList<Object>> excelData = ExcelUtil.readExcel(file);
		transformSalesOrderData(excelData);
		System.out.println("3. Excel data loaded");

		// 2 �жϲ�Ʒ�ͻ�Ƿ����
		Map<String, String> errMap = dataValidation(rfList, scList);

		// 2.1 �粻���ڣ��������ռ�������д������һ��excel������;����ڼ�������
		if (!errMap.isEmpty()) {
			for (Map.Entry<String, String> map : errMap.entrySet()) {
				System.out.println(map.getKey() + ": " + map.getValue());
			}
			System.out.println("4. Error!");
			return;
		}

		// 3 д�����ݿ�
		System.out.println("5. Before insert data");
		SalesOrderDAO soDao = new SalesOrderDAO();
		soDao.insertSalesOrderList(soList);
		System.out.println("6. Done with success");
		
	}

	/**
	 * �ٴη�װ����Դ�����productID��campaignID,campaignBatch��salesDate
	 * ������productID�����ڣ�campaign name�����ڣ����ռ�������Ϣ
	 * 
	 * @param rfList
	 * @param scList
	 * @return error msg
	 */
	public Map<String, String> dataValidation(ArrayList<RetailFood> rfList, ArrayList<SalesCampaign> scList) {

		Map<String, String> errMap = new HashMap<String, String>();

		// campaign name = sales title ==> ȷ��campaign id, campaign batch, product id
		for (Iterator soIter = soList.iterator(); soIter.hasNext();) {
			SalesOrder so = (SalesOrder) soIter.next();

			for (Iterator iter = scList.iterator(); iter.hasNext();) {
				SalesCampaign sc = (SalesCampaign) iter.next();
				if (sc.getCampaignName().equals(so.getSalesTitle())) {
					so.setCampaignBatch(sc.getCampaignBatch());
					so.setCampaignId(sc.getCampaignId());
					so.setProductId(sc.getProductId());
				}
			}

			// ���û�ж�Ӧ�����򱣴����ݲ���
			if (so.getCampaignId() == null || so.getCampaignBatch() == null) {
				errMap.put(so.getSalesOrderId(), so.getSalesTitle());
			}

			String salesOrderId = so.getSalesOrderId();
			String year = salesOrderId.substring(1, 5);
			String month = salesOrderId.substring(5, 7);
			String day = salesOrderId.substring(7, 9);
			so.setSalesDate(Date.valueOf(year + "-" + month + "-" + day));

		}

		return errMap;
	}

	/**
	 * �����޵�Excel����ת����Sales Order�ĸ�ʽ���ݣ����ս��������ݿ�
	 * 
	 * @param excelData
	 * @return
	 */
	public void transformSalesOrderData(ArrayList<ArrayList<Object>> excelData) {
		// ���η�װSalesOrder List����Excel��ȡ
		for (Iterator iter = excelData.iterator(); iter.hasNext();) {
			ArrayList<Object> str = (ArrayList<Object>) iter.next();
			// ���˱�ͷ
			if ("ƽ̨".equals(str.get(0))) {
				continue;
			}
			SalesOrder so = new SalesOrder();
			// ���θ�ֵ
			so.setPlatform((String) str.get(0));
			so.setSalesOrderId((String) str.get(1));
			so.setLogisticsCompany((String) str.get(2));
			so.setLogisticsNum((String) str.get(3));
			so.setSku((String) str.get(4));
			so.setMerchantCd((String) str.get(5));
			so.setCustomerName((String) str.get(6));
			so.setDeliProvince((String) str.get(7));
			so.setDeliCity((String) str.get(8));
			so.setDeliArea((String) str.get(9));
			so.setDeliAddress((String) str.get(10));
			so.setContactNumber((String) str.get(11));
			so.setSalesTitle((String) str.get(12));
			so.setQuantity((int) Math.ceil(Double.parseDouble((String) str.get(13))));
			so.setUnitPrice(Double.parseDouble((String) str.get(14)));

			soList.add(so);
		}
	}
}
