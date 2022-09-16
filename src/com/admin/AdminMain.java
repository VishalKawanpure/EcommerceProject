package com.admin;

import java.util.Scanner;

public class AdminMain {
	public static void main(String[] args) {
		
	
	Scanner sc= new Scanner(System.in);
	
	System.out.println("Enter the adminn username");
	String username = sc.next();
	
	System.out.println("Enter the adminn password");
	String password = sc.next();
	
	AdminInput adminInput= new AdminInput();
	
	adminInput.addAdminDetails(username, password);
	
	sc.close();
	System.out.println("Successfull...");
	
	

}}
