package com.product.inventory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InventoryInput {
	
	 static Connection con;
	 public static String productid;
	 public static String discription;
	 public static String price;
	 public static String name;
	 public static String quantity;
	 
	    public static Scanner sc= new Scanner(System.in);
	    public  void addInventory(String productid, String discription, String price, String name, String quantity) throws SQLException {
		ConnectionsProvider connectionsProvider= new ConnectionsProvider();
		
		try{con=connectionsProvider.getConnections();
		
		String sql= "Insert into product(Productid, Discription, Price, Name, Quantity) values (?, ?, ?, ?,?)";
		PreparedStatement pst = con.prepareStatement(sql);
		
		pst.setString(1, productid);
		pst.setString(2, discription);
		pst.setString(3, price);
		pst.setString(4, name);
		pst.setString(5, quantity);
		
		int update= pst.executeUpdate();
		
		System.out.println("Record Inserted"+ update);
		pst.close();
		con.close();
		
		
		
		} catch( Exception e){
			
			e.printStackTrace();
			
			
		}}
		public static void main(String[] args) throws SQLException {
			
			
			
			for (int i =0; i<10; i++) {
				
				System.out.println("Enter the Productid");
				 productid= sc.next();
				
				System.out.println("Enter the Product Discription");
				 discription= sc.next();
				
				System.out.println("Enter the Product Price");
				 price= sc.next();
				
				System.out.println("Enter the Product Name");
				 name= sc.next();
				
				System.out.println("Enter the Quantity of Products");
				 quantity = sc.next();
				
				InventoryInput inventoryInput= new InventoryInput();
				inventoryInput.addInventory(productid, discription, price, name, quantity);
			}
			
			sc.close();
			System.out.println("Inventory added Successfully ");
		}

		
	}


