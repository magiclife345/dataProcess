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

		// 1.数据读取
		// 1.1 产品表读取
		RetailFoodDAO rfDao = new RetailFoodDAO();
		ArrayList<RetailFood> rfList = rfDao.selectRetailFoodList();
		System.out.println("1. RetailFood data loaded");

		// 1.2 活动表读取
		SalesCompaignDAO scDao = new SalesCompaignDAO();
		ArrayList<SalesCampaign> scList = scDao.selectSalesCampaignList();
		System.out.println("2. SalesCampaign data loaded");

		// 1.3 Excel文件读取
		File file = new File(filePath);
		ArrayList<ArrayList<Object>> excelData = ExcelUtil.readExcel(file);
		transformSalesOrderData(excelData);
		System.out.println("3. Excel data loaded");

		// 2 判断产品和活动是否存在
		Map<String, String> errMap = dataValidation(rfList, scList);

		// 2.1 如不存在，将数据收集，后续写入另外一个excel待处理;如存在继续处理
		if (!errMap.isEmpty()) {
			for (Map.Entry<String, String> map : errMap.entrySet()) {
				System.out.println(map.getKey() + ": " + map.getValue());
			}
			System.out.println("4. Error!");
			return;
		}

		// 3 写入数据库
		System.out.println("5. Before insert data");
		SalesOrderDAO soDao = new SalesOrderDAO();
		soDao.insertSalesOrderList(soList);
		System.out.println("6. Done with success");
		
	}

	/**
	 * 再次封装数据源，填充productID，campaignID,campaignBatch，salesDate
	 * 如遇到productID不存在，campaign name不存在，则收集错误信息
	 * 
	 * @param rfList
	 * @param scList
	 * @return error msg
	 */
	public Map<String, String> dataValidation(ArrayList<RetailFood> rfList, ArrayList<SalesCampaign> scList) {

		Map<String, String> errMap = new HashMap<String, String>();

		// campaign name = sales title ==> 确定campaign id, campaign batch, product id
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

			// 如果没有对应到，则保存数据测试
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
	 * 将有赞的Excel数据转换成Sales Order的格式数据，最终将导入数据库
	 * 
	 * @param excelData
	 * @return
	 */
	public void transformSalesOrderData(ArrayList<ArrayList<Object>> excelData) {
		// 初次封装SalesOrder List，从Excel获取
		for (Iterator iter = excelData.iterator(); iter.hasNext();) {
			ArrayList<Object> str = (ArrayList<Object>) iter.next();
			// 过滤表头
			if ("平台".equals(str.get(0))) {
				continue;
			}
			SalesOrder so = new SalesOrder();
			// 初次赋值
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
