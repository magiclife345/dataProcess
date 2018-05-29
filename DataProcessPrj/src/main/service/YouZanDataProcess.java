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
		
		// 2 �жϲ�Ʒ�ͻ�Ƿ����
		
		// 2.1 �粻���ڣ��������ռ�������д������һ��excel������
		
		// 2.2����ڼ�������
		
		// 3 ��װDTO���������ݿ������������DTO list
		
		// 4 д�����ݿ�
		
	}
	
	public boolean dataValidation(ArrayList<RetailFood> rfList, ArrayList<SalesCampaign> scList) {
		
		return true;
	}
}
