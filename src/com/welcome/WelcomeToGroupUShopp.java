package com.welcome;

import java.util.Scanner;

import com.bill.Billing;
import com.bill.Logindemo;
import com.cart.AddToCart;
import com.cart.DeleteFromCart;
import com.login.AdminLogin;
import com.login.LoginException;
import com.user.UserInputForApp;

public class WelcomeToGroupUShopp {
	public static int action;
	public static boolean istrue;
	public static int choice,quantity;
	public static int total=0;
	public static String again;
	
	public static String product_id;
	public static String name;
	public static int update;
	
	public static int id;
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) throws LoginException  {
		
		System.out.println("Welcome to Group U shop.......!");
		System.out.println("\n");
		
		System.out.println("To use this application please register or login");
		System.out.println("\n");
		
		
		while(true) {
			
		System.out.println("For register to our app please press 1");
		
		
		System.out.println("For login to our app and shopping please press 2 ");
		
		System.out.println("For Shopping menu please press 3");
		
		System.out.println("For login as Admin please press 4");
		
		System.out.println("To add the products into the cart press 5");
		
		System.out.println("To delete the products from the cart press 6");
		
		System.out.println("for exit press 7");
		
		action= sc.nextInt();
		
		
		if (action==1) {
			
			UserInputForApp userInputForApp= new UserInputForApp();
			userInputForApp.addUserDetails();
			
			
			 }
		
		
		else if(action==2) {
			
			Logindemo Logindemo =new Logindemo();
			Logindemo.log();
			
			}
		
		else if(action==3) {
			Billing.menu();
			
			} 
		
		else if(action==4) {
			
			AdminLogin adminLogin= new AdminLogin();
			adminLogin.seeAdmin();
		}
		
		 else if (action==5) {
			 
			 AddToCart addToCart= new AddToCart();
			 addToCart.addProductToTheCart(product_id, name);
			 
	    	   
	       }
		
		 else if (action==6) {
	    	   
			 DeleteFromCart DeleteFromCart= new DeleteFromCart();
			 DeleteFromCart.deleteFromcart(id);
			 
	       }
		
		
       else if(action==7) {
			System.out.println("Thank you for using our application");
			System.out.println("Please share feedback on our emai id");
			System.exit(0);
		}
		
      
		
       else {
    	   System.out.println("Please select only from given options");
       }
	}}}
			
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	


