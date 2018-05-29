package main.models;

public class RetailFood {
	/**
	 * ID
	 */
	private int id;

	/**
	 * 产品ID
	 */
	private String productId;
	
	/**
	 * 销售商
	 */
	private String supplier;
	
	/**
	 * 品牌
	 */
	private String brand;
	
	/**
	 * 产品名称
	 */
	private String productName;
	
	/**
	 * 原产地
	 */
	private String origin;
	
	/**
	 * 品质
	 */
	private String grade;
	
	/**
	 * 单位
	 */
	private int unit;
	
	/**
	 * 保质期
	 */
	private int exp;
	
	/**
	 * 品质保证
	 */
	private String warranted;
	
	/**
	 * 批发价
	 */
	private double wholesalePrice;
	
	/**
	 * 限制价
	 */
	private double regulationPrice;
	
	/**
	 * 推荐零售价
	 */
	private double recomRetailPrice;
	
	/**
	 * 发货范围
	 */
	private String deliScope;
	
	/**
	 * remarks
	 */
	private String remarks;
	
	/**
	 * 约定价格
	 */
	private double normalPrice;

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

	public String getSuplier() {
		return supplier;
	}

	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public int getUnit() {
		return unit;
	}

	public void setUnit(int unit) {
		this.unit = unit;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public String getWarranted() {
		return warranted;
	}

	public void setWarranted(String warranted) {
		this.warranted = warranted;
	}

	public double getWholesalePrice() {
		return wholesalePrice;
	}

	public void setWholesalePrice(double wholesalePrice) {
		this.wholesalePrice = wholesalePrice;
	}

	public double getRegulationPrice() {
		return regulationPrice;
	}

	public void setRegulationPrice(double regulationPrice) {
		this.regulationPrice = regulationPrice;
	}

	public double getRecomRetailPrice() {
		return recomRetailPrice;
	}

	public void setRecomRetailPrice(double recomRetailPrice) {
		this.recomRetailPrice = recomRetailPrice;
	}

	public String getDeliScope() {
		return deliScope;
	}

	public void setDeliScope(String deliScope) {
		this.deliScope = deliScope;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public double getNormalPrice() {
		return normalPrice;
	}

	public void setNormalPrice(double normalPrice) {
		this.normalPrice = normalPrice;
	}
}
