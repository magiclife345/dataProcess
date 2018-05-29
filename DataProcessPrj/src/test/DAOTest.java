package test;

import static org.junit.Assert.assertEquals;

import java.sql.SQLException;
import java.util.ArrayList;

import org.junit.Test;

import main.dao.RetailFoodDAO;
import main.dao.SalesCompaignDAO;
import main.dao.SalesOrderDAO;
import main.models.RetailFood;
import main.models.SalesCampaign;
import main.models.SalesOrder;

public class DAOTest {

	@Test
	public void selectSalesCampaignListTest() throws SQLException {
		SalesCompaignDAO dao = new SalesCompaignDAO();
		ArrayList<SalesCampaign> rtnResult = dao.selectSalesCampaignList();

		assertEquals(rtnResult.size() > 0, true);
	}
	
	@Test
	public void selectSalesOrderListTest() throws SQLException {
		SalesOrderDAO dao = new SalesOrderDAO();
		ArrayList<SalesOrder> rtnResult = dao.selectSalesOrderList();

		assertEquals(rtnResult.size() > 0, true);
	}
	
	@Test
	public void selectRetailFoodListTest() throws SQLException {
		RetailFoodDAO dao = new RetailFoodDAO();
		ArrayList<RetailFood> rtnResult = dao.selectRetailFoodList();

		assertEquals(rtnResult.size() > 0, true);
	}


}
