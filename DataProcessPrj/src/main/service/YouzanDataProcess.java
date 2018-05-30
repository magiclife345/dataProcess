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
		
		// 1.数据读取
		// 1.1 产品表读取
		RetailFoodDAO rfDao = new RetailFoodDAO();
		ArrayList<RetailFood> rfList = rfDao.selectRetailFoodList();
		
		// 1.2 活动表读取
		SalesCompaignDAO scDao = new SalesCompaignDAO();
		ArrayList<SalesCampaign> scList = scDao.selectSalesCampaignList();
		
		// 1.3 Excel文件读取
		File file = new File(EXCEL_FILE_PATH);
		ArrayList<ArrayList<Object>> excelData = ExcelUtil.readExcel(file);
		transformSalesOrderData(excelData);
		
		// 2 判断产品和活动是否存在
		Map<String,String> errMap = dataValidation(rfList,scList);
		
		// 2.1 如不存在，将数据收集，后续写入另外一个excel待处理;如存在继续处理
		if (!errMap.isEmpty()) {
			for (Map.Entry<String, String> map : errMap.entrySet()) {
				System.out.println(map.getKey() + ": "+ map.getValue());
			}
			return;
		}
		
		// 3  写入数据库
		
	}
	
	/**
	 * 再次封装数据源，填充productID，campaignID,campaignBatch，salesDate
	 * 如遇到productID不存在，campaign name不存在，则收集错误信息
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
	 * 将有赞的Excel数据转换成RetailFood格式的数据，最终将导入数据库
	 * 
	 * @param excelData
	 * @return 
	 */
	public void transformSalesOrderData (ArrayList<ArrayList<Object>> excelData) {
		//初次封装SalesOrder List，从Excel获取
		for (Iterator iter = excelData.iterator(); iter.hasNext();) {
			ArrayList<Object> str = (ArrayList<Object>) iter.next();
			SalesOrder so = new SalesOrder();
			// 初次赋值
			so.setPlatform((String)str.get(0));
			//TODO add all data
			
			soList.add(so);
		}
	}
}
