package com.cart;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.product.inventory.ConnectionsProvider;

public class AddToCart {
	static Connection con;
	public static String product_id;
	public static String name;
	public static int update;
	
	
    
	
	public void addProductToTheCart(String product_id, String name) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the product id");
		product_id= sc.next();
		System.out.println("Enter the product Name");
		name= sc.next();
		
		
		ConnectionsProvider connectionsProvider= new ConnectionsProvider();
		
		try {
			con= connectionsProvider.getConnections();
			
			String cartin= "Insert into cart (Product_id, Name) values(?,?)";
			
			PreparedStatement pst = con.prepareStatement(cartin);
			
			pst.setString(1, product_id);
			pst.setString(2, name);
			
			int a = pst.executeUpdate();
			
			
			
			System.out.println("Product Added to the Cart"+ a);
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		
		AddToCart addToCart= new AddToCart();
		addToCart.addProductToTheCart(product_id, name);
		
	}	
		
	}