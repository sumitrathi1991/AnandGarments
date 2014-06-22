package com.anand.Items

class Item {
	
	String itemName
	String itemCode
	String itemSize
	String itemColor
	String itemDescription
	String itemBrand
	String ItemType
	float itemPrice
	float discountRate
	int quantity
	int qtyOrdered
	int qtyPending
	boolean isItemDiscountable
	
	static constraints = {
		itemSize nullable:true 
		itemColor nullable:true 
		itemDescription nullable:true 
	}
	
	float getSalePrice(){
		float salePrice = 0.00
		if(isItemDiscountable)
		salePrice = this.itemPrice - (this.itemPrice * (this.discountRate / 100))
		else 
		salePrice = this.itemPrice
		return salePrice
	}
	
	int getAvailableQuantity(){
		return (this.quantity - (this.qtyOrdered + this.qtyPending))
	}
	
	
    
}
