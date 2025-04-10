package com.cdac.acts;

public class Item {
	
	private int itemCode;
	private String itemName;
	private double price;
	private int qty;
	
	public Item() {
		 
		this.itemCode = 0;
		this.itemName = "";
		this.price = 0.00;
		this.qty = 0;
	}
	
	public Item(int itemCode, String istemName, double price, int qty) {
		 
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.price = price;
		this.qty = qty;
	}

	@Override
	public String toString() {
		return "Item [itemCode=" + itemCode + ", itemName=" + itemName + ", price=" + price + ", qty=" + qty + "]";
	}
	
	public int getItemCode() {
		return itemCode;
	}
	
	public String getItemName() {
		return itemName;
	}
	public int getQuantity() {
		return qty;
	}
	public double getPrice() {
		return price;
	}
	
	public void setQuantity(int qty) {
		this.qty = qty;
	}
	
}
