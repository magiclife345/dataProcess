package test;

import static org.junit.Assert.assertEquals;

import java.sql.SQLException;

import org.junit.Test;

import main.service.YouzanDataProcess;

public class YouzanDataProcessTest {
	
	@Test
	public void dataProcessTest() throws SQLException {
		YouzanDataProcess dp = new YouzanDataProcess();
		
		dp.dataProcess("D:\\����\\����ţţ\\����ţţ0529.xlsx");
	}
}
