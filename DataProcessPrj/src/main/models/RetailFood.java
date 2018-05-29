package main.models;

public class RetailFood {
	/**
	 * ID
	 */
	private int id;

	/**
	 * ��ƷID
	 */
	private String productId;
	
	/**
	 * ������
	 */
	private String supplier;
	
	/**
	 * Ʒ��
	 */
	private String brand;
	
	/**
	 * ��Ʒ����
	 */
	private String productName;
	
	/**
	 * ԭ����
	 */
	private String origin;
	
	/**
	 * Ʒ��
	 */
	private String grade;
	
	/**
	 * ��λ
	 */
	private int unit;
	
	/**
	 * ������
	 */
	private int exp;
	
	/**
	 * Ʒ�ʱ�֤
	 */
	private String warranted;
	
	/**
	 * ������
	 */
	private double wholesalePrice;
	
	/**
	 * ���Ƽ�
	 */
	private double regulationPrice;
	
	/**
	 * �Ƽ����ۼ�
	 */
	private double recomRetailPrice;
	
	/**
	 * ������Χ
	 */
	private String deliScope;
	
	/**
	 * remarks
	 */
	private String remarks;
	
	/**
	 * Լ���۸�
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
