package main.service;

import java.io.File;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import main.dao.RetailFoodDAO;
import main.dao.SalesCompaignDAO;
import main.models.RetailFood;
import main.models.SalesCampaign;
import main.models.SalesOrder;
import main.util.ExcelUtil;

public class YouzanDataProcess {

	private final String EXCEL_FILE_PATH = "";
	
	private ArrayList<SalesOrder> soList;
	
	/**
	 * Data process
	 * @throws SQLException 
	 */
	public void dataProcess() throws SQLException {
		soList = new ArrayList<SalesOrder>();
		
		// 1.���ݶ�ȡ
		// 1.1 ��Ʒ���ȡ
		RetailFoodDAO rfDao = new RetailFoodDAO();
		ArrayList<RetailFood> rfList = rfDao.selectRetailFoodList();
		
		// 1.2 ����ȡ
		SalesCompaignDAO scDao = new SalesCompaignDAO();
		ArrayList<SalesCampaign> scList = scDao.selectSalesCampaignList();
		
		// 1.3 Excel�ļ���ȡ
		File file = new File(EXCEL_FILE_PATH);
		ArrayList<ArrayList<Object>> excelData = ExcelUtil.readExcel(file);
		transformSalesOrderData(excelData);
		
		// 2 �жϲ�Ʒ�ͻ�Ƿ����
		Map<String,String> errMap = dataValidation(rfList,scList);
		
		// 2.1 �粻���ڣ��������ռ�������д������һ��excel������;����ڼ�������
		if (!errMap.isEmpty()) {
			for (Map.Entry<String, String> map : errMap.entrySet()) {
				System.out.println(map.getKey() + ": "+ map.getValue());
			}
			return;
		}
		
		// 3  д�����ݿ�
		
	}
	
	/**
	 * �ٴη�װ����Դ�����productID��campaignID,campaignBatch��salesDate
	 * ������productID�����ڣ�campaign name�����ڣ����ռ�������Ϣ
	 * 
	 * @param rfList
	 * @param scList
	 * @return
	 */
	public Map<String,String> dataValidation(ArrayList<RetailFood> rfList, ArrayList<SalesCampaign> scList) {
		
		Map<String,String> errMap = new HashMap<String,String>();
		
		return errMap;
	}
	
	/**
	 * �����޵�Excel����ת����RetailFood��ʽ�����ݣ����ս��������ݿ�
	 * 
	 * @param excelData
	 * @return 
	 */
	public void transformSalesOrderData (ArrayList<ArrayList<Object>> excelData) {
		//���η�װSalesOrder List����Excel��ȡ
		for (Iterator iter = excelData.iterator(); iter.hasNext();) {
			ArrayList<Object> str = (ArrayList<Object>) iter.next();
			SalesOrder so = new SalesOrder();
			// ���θ�ֵ
			so.setPlatform((String)str.get(0));
			//TODO add all data
			
			soList.add(so);
		}
	}
}
