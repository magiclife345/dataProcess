package main.service;

import java.io.File;
import java.sql.SQLException;
import java.util.ArrayList;

import main.dao.RetailFoodDAO;
import main.dao.SalesCompaignDAO;
import main.models.RetailFood;
import main.models.SalesCampaign;
import main.util.ExcelUtil;

public class YouZanDataProcess {

	private final String EXCEL_FILE_PATH = "";
	
	/**
	 * Data process
	 * @throws SQLException 
	 */
	public void dataProcess() throws SQLException {
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
		
		// 2 判断产品和活动是否存在
		
		// 2.1 如不存在，将数据收集，后续写入另外一个excel待处理
		
		// 2.2如存在继续处理
		
		// 3 封装DTO，按照数据库现有情况生成DTO list
		
		// 4 写入数据库
		
	}
	
	public boolean dataValidation(ArrayList<RetailFood> rfList, ArrayList<SalesCampaign> scList) {
		
		return true;
	}
}
