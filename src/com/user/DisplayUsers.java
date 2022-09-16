package com.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.product.inventory.ConnectionsProvider;

public class DisplayUsers {

	Connection con;
	public void displayUsersInfo() {
		
		ConnectionsProvider connectionsProvider =new ConnectionsProvider();
		
		try {
			con= connectionsProvider.getConnections();
			String usrin = "Select * from user ";
			
			PreparedStatement pst = con.prepareStatement(usrin);
			
		ResultSet ex = pst.executeQuery();
		    System.out.println("=========================");
		    System.out.println("UserName       PassWord" );
		    System.out.println("--------------------------");
		    System.out.println("    ");
		while(ex.next()) {
			
			System.out.println(ex.getString("username")+ "         "+ ex.getString("password"));
		}
		    System.out.println("=========================");	
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
	}
	public static void main(String[] args) {
		
		DisplayUsers displayUsers= new DisplayUsers();
		displayUsers.displayUsersInfo();
		
	}
	
}
