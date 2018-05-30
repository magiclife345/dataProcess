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
	 * ��ƷID
	 */
	private String productId;
	

	/**
	 * ƽ̨
	 */
	private String platform;

	/**
	 * �ID
	 */
	private String campaignId;

	/**
	 * �����
	 */
	private String campaignBatch;

	/**
	 * ƽ̨���۵���
	 */
	private String salesOrderId;

	/**
	 * ��ݹ�˾
	 */
	private String logisticsCompany;

	/**
	 * ��ݱ��
	 */
	private String logisticsNum;

	/**
	 * sku
	 */
	private String sku;

	/**
	 * ��Ӧ��
	 */
	private String merchantCd;

	/**
	 * �ͻ�����
	 */
	private String customerName;

	/**
	 * ����ʡ��
	 */
	private String deliProvince;

	/**
	 * �����ؼ�/�м�
	 */
	private String deliCity;

	/**
	 * ���͵���
	 */
	private String deliArea;

	/**
	 * ���͵�ַ
	 */
	private String deliAddress;

	/**
	 * ��ϵ�绰
	 */
	private String contactNumber;

	/**
	 * �����
	 */
	private String salesTitle;

	/**
	 * ��������
	 */
	private int quantity;

	/**
	 * ����
	 */
	private double unitPrice;

	/**
	 * ��������
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