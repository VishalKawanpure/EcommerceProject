package com.product.inventory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DisplayProductListToAdmin {
	
	Connection con;
	public  void showProductList() {
		
	
	ConnectionsProvider connectionsProvider =new ConnectionsProvider();
	
	try {
		con= connectionsProvider.getConnections();
		
		String listin= "Select * from product";
		PreparedStatement pst = con.prepareStatement(listin);
		
		ResultSet show = pst.executeQuery();
		//System.out.println("Product_id      Description           Price              Name        Quantity   ");
		while(show.next()) {
			
			//+"             "+ show.getString("Price")+"              "+ show.getString("Name")+"                  "+ show.getString("Quantity"));
			
			//System.out.printf(" %s",   "%s",    "%s",   "%s",  "%s" ,show.getString("Productid")+ show.getString("Discription")+ show.getString("Price")+ show.getString("Name")+ show.getString("Quantity" ));
			System.out.println("\n");
			System.out.println("Productid is......"+   show.getString( "Productid"));
			System.out.println("Discription is......"+ show.getString("Discription"));
			System.out.println("Price is......" + show.getString("Price"));
			System.out.println("Name is......" + show.getString("Name"));
			System.out.println("Quantity is......"+ show.getString("Quantity"));
			
		}
		
		
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
	
	
	}
	public static void main(String[] args) {
		
		
		DisplayProductListToAdmin displayProductList= new DisplayProductListToAdmin();
		
		displayProductList.showProductList();
		
		
		
	}
	
}
