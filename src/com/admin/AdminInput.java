package com.admin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.product.inventory.ConnectionsProvider;

public class AdminInput {
	
	Connection con;
	
	public void addAdminDetails(String username, String password) {
		
		ConnectionsProvider connectionsProvider= new ConnectionsProvider();
		
		try {
			con= connectionsProvider.getConnections();
			
			String adminin= "insert into admin (username, password) values (?,?)";
			
			PreparedStatement pst = con.prepareStatement(adminin);
			
			pst.setString(1, username);
			pst.setString(2, password);
			
			
			int a= pst.executeUpdate();
			
			System.out.println("Admin details added Successfully"+ a);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}

}
