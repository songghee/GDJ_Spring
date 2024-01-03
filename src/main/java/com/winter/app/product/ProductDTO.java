package com.winter.app.product;

public class ProductDTO {
	
	private Long productNum;
	private String productName;
	private String productContents;
	private Double prodcutrate;
	private Double productjumsu;

	public Long getProductNum() {
		return productNum;
	}
	public void setProductNum(Long productNum) {
		this.productNum = productNum;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductContents() {
		return productContents;
	}
	public void setProductContents(String productContents) {
		this.productContents = productContents;
	}
	public Double getProdcutrate() {
		return prodcutrate;
	}
	public void setProdcutrate(Double prodcutrate) {
		this.prodcutrate = prodcutrate;
	}
	public Double getProductjumsu() {
		return productjumsu;
	}
	public void setProductjumsu(Double productjumsu) {
		this.productjumsu = productjumsu;
	}
}
