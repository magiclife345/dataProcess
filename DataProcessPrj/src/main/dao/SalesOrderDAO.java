package main.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;

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

	public void insertSalesOrderList(ArrayList<SalesOrder> soList) throws SQLException {
		if (soList == null || soList.isEmpty()) {
			return;
		}

		for (Iterator<SalesOrder> iter = soList.iterator(); iter.hasNext();) {
			SalesOrder so = iter.next();
			insertSalesOrder(so);
		}
	}

	public void insertSalesOrder(SalesOrder so) throws SQLException {
		Connection conn = DBUtil.openConnection();
		PreparedStatement ps = DBUtil.Prepare(conn, INSERT_SALES_ORDER_SQL);
		ps.setString(1, so.getProductId());
		ps.setString(2, so.getPlatform());
		ps.setString(3, so.getCampaignId());
		ps.setString(4, so.getCampaignBatch());
		ps.setString(5, so.getSalesOrderId());
		ps.setString(6, so.getLogisticsCompany());
		ps.setString(7, so.getLogisticsNum());
		ps.setString(8, so.getSku());
		ps.setString(9, so.getMerchantCd());
		ps.setString(10, so.getCustomerName());
		ps.setString(11, so.getDeliProvince());
		ps.setString(12, so.getDeliCity());
		ps.setString(13, so.getDeliArea());
		ps.setString(14, so.getDeliAddress());
		ps.setString(15, so.getContactNumber());
		ps.setString(16, so.getSalesTitle());
		ps.setInt(17, so.getQuantity());
		ps.setDouble(18, so.getUnitPrice());
		ps.setDate(19, so.getSalesDate());

		ps.execute();
		System.out.println("insert data SalesOrderId: " + so.getSalesOrderId() + " successfully.");
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
