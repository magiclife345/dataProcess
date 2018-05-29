package main.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import main.models.SalesOrder;
import main.util.DBUtil;

public class SalesOrderDAO {
	
	private final String SELECT_SALES_ORDER_SQL = "SELECT id, product_id, platform, campaign_id, campaign_batch, sales_order_id, logistics_company, logistics_number,sku,merchant_code,customer_name,delivery_province,delivery_city,delivery_area,detail_address,contact_number,sales_title,quantity,unit_price,sales_date FROM sales_orders";
	private final String INSERT_SALES_ORDER_SQL = "INSERT INTO sales_orders (product_id, platform, campaign_id, campaign_batch, sales_order_id, logistics_company, logistics_number, sku, merchant_code, customer_name, delivery_province, delivery_city, delivery_area, detail_address, contact_number, sales_title, quantity, unit_price, sales_date) VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,?, ?, ?, ?, ?, ?, ?);";
	
	public ArrayList<SalesOrder> selectSalesOrderList() throws SQLException {
		ArrayList<SalesOrder> rtnResult = new ArrayList<SalesOrder>();
		
		Connection conn = DBUtil.openConnection();
		PreparedStatement ps = DBUtil.Prepare(conn, SELECT_SALES_ORDER_SQL);
		ResultSet rs = ps.executeQuery();
		
		SalesOrder so;
		
		while (rs.next()) {
			so = this.getSalesOrder(rs);
			rtnResult.add(so);
		}
		
		return rtnResult;
	}
	
	public void insertSalesOrder() {
		Connection conn = DBUtil.openConnection();
		PreparedStatement ps = DBUtil.Prepare(conn, INSERT_SALES_ORDER_SQL);
		
	}
	
	private SalesOrder getSalesOrder(ResultSet rs) throws SQLException {
		SalesOrder so = new SalesOrder();

		if (rs == null) {
			return so;
		}
		
		so.setId(rs.getInt("id"));
		so.setProductId(rs.getString("product_id"));
		so.setPlatform(rs.getString("platform"));
		so.setCampaignId(rs.getString("campaign_id"));
		so.setCampaignBatch(rs.getString("campaign_batch"));
		so.setSalesOrderId(rs.getString("sales_order_id"));
		so.setLogisticsCompany(rs.getString("logistics_company"));
		so.setLogisticsNum(rs.getString("logistics_number"));
		so.setSku(rs.getString("sku"));
		so.setMerchantCd(rs.getString("merchant_code"));
		so.setCustomerName(rs.getString("customer_name"));
		so.setDeliProvince(rs.getString("delivery_province"));
		so.setDeliCity(rs.getString("delivery_city"));
		so.setDeliArea(rs.getString("delivery_area"));
		so.setDeliAddress(rs.getString("detail_address"));
		so.setContactNumber(rs.getString("contact_number"));
		so.setSalesTitle(rs.getString("sales_title"));
		so.setQuantity(rs.getInt("quantity"));
		so.setUnitPrice(rs.getDouble("unit_price"));
		so.setSalesDate(rs.getDate("sales_date"));
		
		return so;
	}
}
