package com.product.inventory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionsProvider {
	Connection con;
	public Connection getConnections() throws SQLException {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con= DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce", "root", "root");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		return con;
		
		
	}

}
