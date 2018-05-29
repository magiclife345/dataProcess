package main.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import main.models.RetailFood;
import main.util.DBUtil;

public class RetailFoodDAO {

	private final String SELECT_RETAIL_FOOD_SQL = "SELECT id,product_id,supplier,brand,product_name,origin,grade,unit,exp,warranted,wholesale_price,regulation_price,recom_retail_price,delivery_scope,remarks,normal_price FROM mydb.retail_food;";

	public ArrayList<RetailFood> selectRetailFoodList() throws SQLException {
		ArrayList<RetailFood> rtnResult = new ArrayList<RetailFood>();

		Connection conn = DBUtil.openConnection();
		PreparedStatement ps = DBUtil.Prepare(conn, SELECT_RETAIL_FOOD_SQL);
		ResultSet rs = ps.executeQuery();
		
		RetailFood rf;
		
		while (rs.next()) {
			rf = this.getRetailFood(rs);
			rtnResult.add(rf);
		}
		
		return rtnResult;
	}
	
	private RetailFood getRetailFood(ResultSet rs) throws SQLException {
		RetailFood sc = new RetailFood();

		if (rs == null) {
			return sc;
		}
		
		sc.setId(rs.getInt("id"));
		sc.setProductId(rs.getString("product_id"));
		sc.setSupplier(rs.getString("supplier"));
		sc.setBrand(rs.getString("brand"));
		sc.setProductName(rs.getString("product_name"));
		sc.setOrigin(rs.getString("origin"));
		sc.setGrade(rs.getString("grade"));
		sc.setUnit(rs.getInt("unit"));
		sc.setExp(rs.getInt("exp"));
		sc.setWarranted(rs.getString("warranted"));
		sc.setWholesalePrice(rs.getDouble("wholesale_price"));
		sc.setRegulationPrice(rs.getDouble("regulation_price"));
		sc.setRecomRetailPrice(rs.getDouble("recom_retail_price"));
		sc.setDeliScope(rs.getString("delivery_scope"));
		sc.setRemarks(rs.getString("remarks"));
		sc.setNormalPrice(rs.getDouble("normal_price"));
		
		return sc;
	}
}
