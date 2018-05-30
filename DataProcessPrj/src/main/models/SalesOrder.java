package main.models;

import java.sql.Date;

/**
 * @author magic
 *
 */
public class SalesOrder {
	/**
	 * ID
	 */
	private int id;

	/**
	 * 产品ID
	 */
	private String productId;
	

	/**
	 * 平台
	 */
	private String platform;

	/**
	 * 活动ID
	 */
	private String campaignId;

	/**
	 * 活动批次
	 */
	private String campaignBatch;

	/**
	 * 平台销售单号
	 */
	private String salesOrderId;

	/**
	 * 快递公司
	 */
	private String logisticsCompany;

	/**
	 * 快递编号
	 */
	private String logisticsNum;

	/**
	 * sku
	 */
	private String sku;

	/**
	 * 供应商
	 */
	private String merchantCd;

	/**
	 * 客户姓名
	 */
	private String customerName;

	/**
	 * 发送省份
	 */
	private String deliProvince;

	/**
	 * 发送县级/市级
	 */
	private String deliCity;

	/**
	 * 发送地区
	 */
	private String deliArea;

	/**
	 * 发送地址
	 */
	private String deliAddress;

	/**
	 * 联系电话
	 */
	private String contactNumber;

	/**
	 * 活动名称
	 */
	private String salesTitle;

	/**
	 * 销售数量
	 */
	private int quantity;

	/**
	 * 单价
	 */
	private double unitPrice;

	/**
	 * 销售日期
	 */
	private Date salesDate;



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

	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
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

	public String getSalesOrderId() {
		return salesOrderId;
	}

	public void setSalesOrderId(String salesOrderId) {
		this.salesOrderId = salesOrderId;
	}

	public String getLogisticsCompany() {
		return logisticsCompany;
	}

	public void setLogisticsCompany(String logisticsCompany) {
		this.logisticsCompany = logisticsCompany;
	}

	public String getLogisticsNum() {
		return logisticsNum;
	}

	public void setLogisticsNum(String logisticsNum) {
		this.logisticsNum = logisticsNum;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getMerchantCd() {
		return merchantCd;
	}

	public void setMerchantCd(String merchantCd) {
		this.merchantCd = merchantCd;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getDeliProvince() {
		return deliProvince;
	}

	public void setDeliProvince(String deliProvince) {
		this.deliProvince = deliProvince;
	}

	public String getDeliCity() {
		return deliCity;
	}

	public void setDeliCity(String deliCity) {
		this.deliCity = deliCity;
	}

	public String getDeliArea() {
		return deliArea;
	}

	public void setDeliArea(String deliArea) {
		this.deliArea = deliArea;
	}

	public String getDeliAddress() {
		return deliAddress;
	}

	public void setDeliAddress(String deliAddress) {
		this.deliAddress = deliAddress;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getSalesTitle() {
		return salesTitle;
	}

	public void setSalesTitle(String salesTitle) {
		this.salesTitle = salesTitle;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public Date getSalesDate() {
		return salesDate;
	}

	public void setSalesDate(Date salesDate) {
		this.salesDate = salesDate;
	}

}