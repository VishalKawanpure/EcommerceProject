package com.cart;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.product.inventory.ConnectionsProvider;

public class DeleteFromCart {

	static Connection con;
    public static int id;

    
    
	public void deleteFromcart(int id) {
		
        Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the id to delete from cart");
		
		 id = sc.nextInt();
		
		ConnectionsProvider connectionsProvider= new ConnectionsProvider();
		
		try {
			con= connectionsProvider.getConnections();
			
			String del= "delete from cart where id=?";
			
			PreparedStatement pst = con.prepareStatement(del);
			
			pst.setInt(1, id);
			
			int ex= pst.executeUpdate();
			
			
			 System.out.println("Item Deleted From Cart"+ ex);
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
	}
	
	
	public static void main(String[] args) {
		
		
		
		DeleteFromCart deleteFromCart= new DeleteFromCart();
		deleteFromCart.deleteFromcart(id);
		
		
	
	
		
		
		
		
	
	
}}
	