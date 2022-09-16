package com.bill;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.cart.AddToCart;
import com.product.inventory.ConnectionsProvider;

public class Logindemo {
	
	
	public static int update;
	Connection con;
	public static int  indicator= 0;
	public void log() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Username");
		String un = sc.next();
		
		System.out.println("Enter password");
		String pw = sc.next();
		ConnectionsProvider ConnectionsProvider= new ConnectionsProvider();
		
		try {
			con= ConnectionsProvider.getConnections();
			
			String usrin = "Select * from user ";
			PreparedStatement pst = con.prepareStatement(usrin);
			ResultSet res = pst.executeQuery();
			
			
			
			while(res.next()) {
				
				//System.out.println(res.getString("username"));
				
				if( un.equals(res.getString("username")) && pw.equals(res.getString("password"))){
					
					indicator=1;
					
					Billing.menu();
					Billing.order();
					
					break; }  }
			
			
			if (indicator==1) { System.out.println("Logged in successfully");}
			
			else { System.out.println("Please register to login"); }
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
	}
public static void main(String[] args) {
	Logindemo Logindemo= new Logindemo();
	Logindemo.log();
}
}
