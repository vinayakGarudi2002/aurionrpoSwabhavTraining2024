package com.aurionpro.structural.adapter.model;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	
  private  List<IItems> cart;

public ShoppingCart() {
	super();
	this.cart = new ArrayList<IItems>();
}

public List<IItems> getCart() {
	return cart;
}

public void setCart(List<IItems> cart) {
	this.cart = cart;
}
  
  
public void addItemToCart(IItems item) {
	cart.add(item);
}

public List<IItems> getCartItems() {
	return cart;
}

public double getCartPrice() {
//	double total=0;
//	for(IItems item:cart) {
//		total=total+item.getItemPrice();
//	}
	
	
	return cart.stream().map((item)->item.getItemPrice()).reduce(0.0, (item1,item2)->item1+item2);
}

public void displayCart() {
	System.out.println("name "+" price");
	cart.stream().forEach((item)->System.out.println(""+item.getItemName()+" "+" "+item.getItemPrice()));
}



  

}
