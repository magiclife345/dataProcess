package main.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import main.models.SalesCampaign;
import main.util.DBUtil;

/**
 * @author magic
 *
 */
public class SalesCompaignDAO {

	private final String SELECT_SALES_COMPAIGN_SQL = "SELECT id, campaign_id, campaign_batch, campaign_name, product_id,start_date,end_date,start_orders,end_orders,retail_price,remarks,platform FROM sales_campaign";

	public ArrayList<SalesCampaign> selectSalesCampaignList() throws SQLException {
		ArrayList<SalesCampaign> rtnResult = new ArrayList<SalesCampaign>();

		Connection conn = DBUtil.openConnection();
		PreparedStatement ps = DBUtil.Prepare(conn, SELECT_SALES_COMPAIGN_SQL);
		ResultSet rs = ps.executeQuery();
		
		SalesCampaign sc;
		
		while (rs.next()) {
			sc = this.getSalesCampaign(rs);
			rtnResult.add(sc);
		}
		
		return rtnResult;
	}
	
	private SalesCampaign getSalesCampaign(ResultSet rs) throws SQLException {
		SalesCampaign sc = new SalesCampaign();

		if (rs == null) {
			return sc;
		}
		
		sc.setId(rs.getInt("id"));
		sc.setCampaignId(rs.getString("campaign_id"));
		sc.setCampaignBatch(rs.getString("campaign_batch"));
		sc.setCampaignName(rs.getString("campaign_name"));
		sc.setProductId(rs.getString("product_id"));
		sc.setStartDate(rs.getDate("start_date"));
		sc.setEndDate(rs.getDate("end_date"));
		sc.setStartOrders(rs.getInt("start_orders"));
		sc.setEndOrders(rs.getInt("end_orders"));
		sc.setRetailPrice(rs.getDouble("retail_price"));
		sc.setRemark(rs.getString("remarks"));
		sc.setPlatform(rs.getString("platform"));
		
		return sc;
	}
	
}
