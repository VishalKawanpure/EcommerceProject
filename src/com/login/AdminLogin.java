package com.login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.product.inventory.ConnectionsProvider;
import com.product.inventory.DisplayProductListToAdmin;
import com.product.inventory.InventoryInput;
import com.user.DisplayUsers;

public class AdminLogin {
	public static int action;
	static Connection con;
	public static String productid;
	public static String discription;
	public static String price;
	public static String name;
	public static String quantity;
	 
	public void seeAdmin() {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter admin username");
		String un = sc.next();
		
		System.out.println("Enter admin password");
		String pw = sc.next();
		
		ConnectionsProvider connectionsProvider= new ConnectionsProvider();
		
		
		try {
			con= connectionsProvider.getConnections();
			String adminin= "Select username, password from admin";
			
			PreparedStatement pst = con.prepareStatement(adminin);
			
			ResultSet check = pst.executeQuery();
			
			while(check.next()) {
				
				if (un.equals(check.getString("username"))  &&  pw.equals(check.getString("password"))) {
					
					System.out.println("Logged in successfully...");
					
					System.out.println("What action you want to perform?");
					
					System.out.println("Press 1 to see inventory  ||Press 2 to see userlist || Press 3 to Add Inventory || Press 4 to Exit");
					
					action= sc.nextInt();
					
					if (action==1) {
						
						DisplayProductListToAdmin displayProductListToAdmin = new DisplayProductListToAdmin();
						displayProductListToAdmin.showProductList();
						
						seeAdmin();
						
					}
					
					else if (action==2) {
						
						DisplayUsers displayUsers= new DisplayUsers();
						displayUsers.displayUsersInfo();
						
						seeAdmin();
					}
					
					else if(action ==3) {
						System.out.println("add inventory options");
						Scanner productin= new Scanner(System.in);
						System.out.println("Add Product id");
						productid= productin.next();
						System.out.println("Add Product Discription");
						discription= productin.next();
						System.out.println("Add Product Price");
						price=productin.next();
						System.out.println("Add Product Name");
						name=productin.next();
						System.out.println("Add Product Quantity");
						quantity=productin.next();
						InventoryInput InventoryInput= new InventoryInput();
						InventoryInput.addInventory(productid, discription, price, name, quantity);
						
						
						seeAdmin();
					}
					
					else if (action==4) {
						System.out.println("Thanks for visiting");
						System.exit(0);
					}
					else { System.out.println("You can choose only from griven options");
					seeAdmin();   }
					
					
			}
					
				else { 
					
					throw new LoginException("You cannot login");
				}
			}
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		} catch (LoginException e) {
			
			e.printStackTrace();
		}
		
		
	}
	public static void main(String[] args) {
		AdminLogin adminLogin =new AdminLogin();
		adminLogin.seeAdmin();
		
	}

}
