package com.dynamic.foodcart01;

// Pojo Class= the Class which can be interact with different variables
public class Food {

	private int fId;
	private String fItem;
	private Float fprice;
	
	public Food(int fId, String fItem, Float fprice) {
		super();
		this.fId = fId;
		this.fItem = fItem;
		this.fprice = fprice;
	}

	public int getfId() {
		return fId;
	}

	public void setfId(int fId) {
		this.fId = fId;
	}

	public String getfItem() {
		return fItem;
	}

	public void setfItem(String fItem) {
		this.fItem = fItem;
	}

	public Float getFprice() {
		return fprice;
	}

	public void setFprice(Float fprice) {
		this.fprice = fprice;
	}
	
	

}
