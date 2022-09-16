package com.product.inventory;

public class DisplayProductsToUsers {
	
	public void displayToUsers() {
		
		System.out.println("==============================================================================\r\n" + 
				"Product_id      Description           Price              Name          \r\n" + 
				"\r\n" + 
				"111             Waterproof             150               Umbrella      \r\n" + 
				"222             Metalbody              120               Tiffin        \r\n" + 
				"333             Waterproof             600               Schoolbag     \r\n" + 
				"444             Portable               1500              Table         \r\n" + 
				"555             Wooden                 600               Chair         \r\n" + 
				"666             Siliconbody            150               MobileCase    \r\n" + 
				"777             Fast                   300               WaterHeater   \r\n" + 
				"888             Printed                200               Curtons       \r\n" + 
				"999             printed                300               Bedsheet      \r\n" + 
				"1010            Heatresistant          450               Thermas       \r\n" + 
				"================================================================================\r\n" + 
				"");
		
		
	}
	
	public static void main(String[] args) {
		
		DisplayProductsToUsers displayProductsToUsers = new DisplayProductsToUsers();
		
		displayProductsToUsers.displayToUsers();
	}

}
