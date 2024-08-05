package com.aurionpro.strutural.adapter.test;

import java.util.ArrayList;
import java.util.List;

import com.aurionpro.structural.adapter.model.Biscuit;
import com.aurionpro.structural.adapter.model.Choclate;
import com.aurionpro.structural.adapter.model.Hat;
import com.aurionpro.structural.adapter.model.HatAdapter;
import com.aurionpro.structural.adapter.model.IItems;
import com.aurionpro.structural.adapter.model.ShoppingCart;

public class IItemsTest {
	
	
	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();
		cart.addItemToCart(new Biscuit("Biscuit", 10));
		cart.addItemToCart(new Choclate("choclate", 12));
		Hat hat = new Hat("hat", "hatLong", 20, 10);
		cart.addItemToCart(new HatAdapter(hat));
		
		
		System.out.println("Displaying cart");
		
		cart.displayCart();
		
		System.out.println("Total Cart Price: "+cart.getCartPrice());
		
	}

}
