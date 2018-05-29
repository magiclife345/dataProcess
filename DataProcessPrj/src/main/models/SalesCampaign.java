package main.models;

import java.sql.Date;

public class SalesCampaign {

	/**
	 * ID
	 */
	private  int id;

	/**
	 * 产品ID
	 */
	private  String productId;

	/**
	 * 活动ID
	 */
	private  String campaignId;

	/**
	 * 活动序号
	 */
	private  String campaignBatch;

	/**
	 * 活动名称
	 */
	private  String campaignName;

	/**
	 * 开始时间
	 */
	private  Date startDate;

	/**
	 * 结束时间
	 */
	private  Date endDate;

	/**
	 * 活动开始订单数
	 */
	private  int startOrders;

	/**
	 * 活动开结束订单数
	 */
	private  int endOrders;

	/**
	 * 零售价
	 */
	private  double retailPrice;

	/**
	 * remark
	 */
	private  String remark;

	/**
	 * 平台
	 */
	private  String platform;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getCampaignId() {
		return campaignId;
	}

	public void setCampaignId(String campaignId) {
		this.campaignId = campaignId;
	}

	public String getCampaignBatch() {
		return campaignBatch;
	}

	public void setCampaignBatch(String campaignBatch) {
		this.campaignBatch = campaignBatch;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public int getStartOrders() {
		return startOrders;
	}

	public void setStartOrders(int startOrders) {
		this.startOrders = startOrders;
	}

	public int getEndOrders() {
		return endOrders;
	}

	public void setEndOrders(int endOrders) {
		this.endOrders = endOrders;
	}

	public double getRetailPrice() {
		return retailPrice;
	}

	public void setRetailPrice(double retailPrice) {
		this.retailPrice = retailPrice;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

}
