/**
 * 
 */
package main;

import java.sql.SQLException;

import main.service.YouzanDataProcess;

/**
 * @author magic
 *
 */
public class main {

	private final static String EXCEL_FILE_PATH = "D:\\����\\����ţţ\\����ţţ0530.xlsx";
	
	/**
	 * @param args
	 * @throws SQLException 
	 */
	public static void main(String[] args) throws SQLException {
		YouzanDataProcess yzExcelProcess = new YouzanDataProcess();
		yzExcelProcess.dataProcess(EXCEL_FILE_PATH);

	}

	
}
