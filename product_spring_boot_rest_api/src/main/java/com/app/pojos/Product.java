package com.app.pojos;

import javax.persistence.*;

@Entity
@Table(name = "product")
public class Product extends BaseEntity{
	
	@Column(length = 20, unique = true)
	private String pName;
	@Column(length = 20)
	private String description;
	private int qty;
	private double pricae;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(String pName, String description, int qty, double pricae) {
		super();
		this.pName = pName;
		this.description = description;
		this.qty = qty;
		this.pricae = pricae;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public double getPricae() {
		return pricae;
	}

	public void setPricae(double pricae) {
		this.pricae = pricae;
	}
	
	
	
}
