package test;

import java.io.File;
import java.util.ArrayList;

import main.util.ExcelUtil;

public class ExcelReadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("D:\\其他\\西域牛牛\\西域牛牛0528.xlsx");
		ArrayList<ArrayList<Object>> result = ExcelUtil.readExcel(file);
		for (int i = 0; i < result.size(); i++) {
			for (int j = 0; j < result.get(i).size(); j++) {
				System.out.println(i + "行 " + j + "列  " + result.get(i).get(j).toString());
			}
		}
		// ExcelUtil.writeExcel(result,"D:\\其他\\西域牛牛\\西域牛牛0528.xlsx");
	}

	
}
