package main.models;

import java.sql.Date;

public class SalesCampaign {

	/**
	 * ID
	 */
	private  int id;

	/**
	 * ��ƷID
	 */
	private  String productId;

	/**
	 * �ID
	 */
	private  String campaignId;

	/**
	 * ����
	 */
	private  String campaignBatch;

	/**
	 * �����
	 */
	private  String campaignName;

	/**
	 * ��ʼʱ��
	 */
	private  Date startDate;

	/**
	 * ����ʱ��
	 */
	private  Date endDate;

	/**
	 * ���ʼ������
	 */
	private  int startOrders;

	/**
	 * �������������
	 */
	private  int endOrders;

	/**
	 * ���ۼ�
	 */
	private  double retailPrice;

	/**
	 * remark
	 */
	private  String remark;

	/**
	 * ƽ̨
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
