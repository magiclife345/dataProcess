package test;

import java.io.File;
import java.util.ArrayList;

import main.util.ExcelUtil;

public class ExcelReadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("D:\\����\\����ţţ\\����ţţ0528.xlsx");
		ArrayList<ArrayList<Object>> result = ExcelUtil.readExcel(file);
		for (int i = 0; i < result.size(); i++) {
			for (int j = 0; j < result.get(i).size(); j++) {
				System.out.println(i + "�� " + j + "��  " + result.get(i).get(j).toString());
			}
		}
		// ExcelUtil.writeExcel(result,"D:\\����\\����ţţ\\����ţţ0528.xlsx");
	}

	
}
