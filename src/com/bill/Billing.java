package com.bill;

import java.util.Scanner;

import com.product.inventory.DisplayProductsToUsers;

public class Billing {
	
	public static int choice,quantity;
	public static int total=0;
	public static String again;
	
	public static Scanner sc= new Scanner (System.in);
	
	public static void menu() {
		
DisplayProductsToUsers displayProductsToUsers = new DisplayProductsToUsers();
		
		displayProductsToUsers.displayToUsers(); }
	
	
		public static  void order () {
			
			
			
			System.out.println(" 1 to Umbrella || 2 to Tiffin || 3 to Schoolbag || 4 to Table || 5 to Chair");
			System.out.println(" 6  to MobileCase  ||  7 to WaterHeater || 8 to Curtons || 9 to Bedsheet || 10 to Thermas");
			System.out.println("Press 11 to exit");
			
			System.out.println("Press you want to order...");
			
			 choice = sc.nextInt();
			
			if (choice==1) {
				System.out.println("You have choosed Umbrella");
				
				System.out.println("How many Umbrellas you want");
				
				 quantity = sc.nextInt();
				 total = total+ (quantity*150);
				 
				 System.out.println("do you want to buy again");
				 System.out.println("Press Y for yess and N for no");
				 
				  again= sc.next();
				 if(again.equalsIgnoreCase("Y") ) {
				 order(); }
				 
				 else { System.out.println("your total is ..."+ total);
				        System.out.println("Thanks for visiting");
				        System.exit(0);} }
				 
				 else if (choice==2) {
						System.out.println("You have choosed Tiffin");
						
						System.out.println("How many Tiffin you want");
						
						 quantity = sc.nextInt();
						 total = total+ (quantity*120);
						 
						 System.out.println("do you want to buy again");
						 System.out.println("Press Y for yess and N for no");
						 
						  again= sc.next();
						 if(again.equalsIgnoreCase("Y") ) {
						 order(); }
						 
						 else { System.out.println("your total is ..."+ total);
						 System.out.println("Thanks for visiting");
						 System.exit(0);
						 } }
				 else if (choice==3) {
						System.out.println("You have choosed Schoolbag");
						
						System.out.println("How many Schoolbag you want");
						
						 quantity = sc.nextInt();
						 total = total+ (quantity*600);
						 
						 System.out.println("do you want to buy again");
						 System.out.println("Press Y for yess and N for no");
						 
						  again= sc.next();
						 if(again.equalsIgnoreCase("Y") ) {
						 order(); }
						 
						 else { System.out.println("your total is ..."+ total);
						 System.out.println("Thanks for visiting");
						 System.exit(0);} }
			
				 else if (choice==4) {
						System.out.println("You have choosed Table");
						
						System.out.println("How many Table you want");
						
						 quantity = sc.nextInt();
						 total = total+ (quantity*1500);
						 
						 System.out.println("do you want to buy again");
						 System.out.println("Press Y for yess and N for no");
						 
						  again= sc.next();
						 if(again.equalsIgnoreCase("Y") ) {
						 order(); }
						 
						 else { System.out.println("your total is ..."+ total);
						 System.out.println("Thanks for visiting");
						 System.exit(0);} }
			
				 else if (choice==5) {
						System.out.println("You have choosed Chair");
						
						System.out.println("How many Chair you want");
						
						 quantity = sc.nextInt();
						 total = total+ (quantity*600);
						 
						 System.out.println("do you want to buy again");
						 System.out.println("Press Y for yess and N for no");
						 
						  again= sc.next();
						 if(again.equalsIgnoreCase("Y") ) {
						 order(); }
						 
						 else { System.out.println("your total is ..."+ total);
						 System.out.println("Thanks for visiting");
						 System.exit(0);} }
			
				 else if (choice==6) {
						System.out.println("You have choosed MobileCase");
						
						System.out.println("How many MobileCase you want");
						
						 quantity = sc.nextInt();
						 total = total+ (quantity*150);
						 
						 System.out.println("do you want to buy again");
						 System.out.println("Press Y for yess and N for no");
						 
						  again= sc.next();
						 if(again.equalsIgnoreCase("Y") ) {
						 order(); }
						 
						 else { System.out.println("your total is ..."+ total);
						 System.out.println("Thanks for visiting");
						 System.exit(0);} }
			
				 else if (choice==7) {
						System.out.println("You have choosed WaterHeater");
						
						System.out.println("How many WaterHeater you want");
						
						 quantity = sc.nextInt();
						 total = total+ (quantity*300);
						 
						 System.out.println("do you want to buy again");
						 System.out.println("Press Y for yess and N for no");
						 
						  again= sc.next();
						 if(again.equalsIgnoreCase("Y") ) {
						 order(); }
						 
						 else { System.out.println("your total is ..."+ total);
						 System.out.println("Thanks for visiting");
						 System.exit(0);} }
			
				 else if (choice==8) {
						System.out.println("You have choosed Curtons");
						
						System.out.println("How many Curtons you want");
						
						 quantity = sc.nextInt();
						 total = total+ (quantity*200);
						 
						 System.out.println("do you want to buy again");
						 System.out.println("Press Y for yess and N for no");
						 
						  again= sc.next();
						 if(again.equalsIgnoreCase("Y") ) {
						 order(); }
						 
						 else { System.out.println("your total is ..."+ total);
						 
						 System.out.println("Thanks for visiting");
						 System.exit(0);} }
			
				 else if (choice==9) {
						System.out.println("You have choosed Bedsheet");
						
						System.out.println("How many Bedsheet you want");
						
						 quantity = sc.nextInt();
						 total = total+ (quantity*300);
						 
						 System.out.println("do you want to buy again");
						 System.out.println("Press Y for yess and N for no");
						 
						  again= sc.next();
						 if(again.equalsIgnoreCase("Y") ) {
						 order(); }
						 
						 else { System.out.println("your total is ..."+ total);
						 
						 System.out.println("Thanks for visiting");
						 System.exit(0);} }
			
				 else if (choice==10) {
						System.out.println("You have choosed Thermas");
						
						System.out.println("How many Thermas you want");
						
						 quantity = sc.nextInt();
						 total = total+ (quantity*450);
						 
						 System.out.println("do you want to buy again");
						 System.out.println("Press Y for yess and N for no");
						 
						  again= sc.next();
						 if(again.equalsIgnoreCase("Y") ) {
						 order(); }
						 
						 else { System.out.println("your total is ..."+ total);
						 System.out.println("Thanks for visiting");
						 System.exit(0);} }
			
				 else if (choice==11) {
					 System.out.println("Thank you for visiting our app");
					 System.exit(0);
					 }
					 
				 
					 else  { System.out.println("Please press only from given option");
						
					 order(); }  }
		
		
		
	public static void main(String[] args) {
		
		menu();
		order();
		
		
		
		
		
	}

}
