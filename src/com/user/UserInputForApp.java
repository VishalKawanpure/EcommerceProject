package com.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.product.inventory.ConnectionsProvider;

public class UserInputForApp  {
	
	public static String username;
	public static String password;
	
	public void addUserDetails() {
		
	try {	
	Scanner sc= new Scanner (System.in);
	System.out.println("Enter username ");
	username= sc.next();
	System.out.println("Enter Password ");
	password= sc.next();
	
	Connection con;
	ConnectionsProvider connectionsProvider=new ConnectionsProvider();
	
	UserInputForApp userInputForApp = new UserInputForApp();
	userInputForApp.addUserdata( username, password);
			
	
		con=connectionsProvider.getConnections();
		String userin= "Insert into user (username, password) values (?,?)";
		PreparedStatement pst = con.prepareStatement(userin);
		
		pst.setString(1, username);
		pst.setString(2, password);
		
		int a= pst.executeUpdate();
		
		System.out.println("User added successfully"+ a);
		
		pst.close();
		con.close();
		
		
	} catch (SQLException e) {
		
		e.printStackTrace();
	} }
	
	
	
private void addUserdata(String username2, String password2) {
		
		
	}



public static void main(String[] args) {
	UserInputForApp userInputForApp1= new UserInputForApp();
	userInputForApp1.addUserDetails();
	
}	
	
	
	

}
