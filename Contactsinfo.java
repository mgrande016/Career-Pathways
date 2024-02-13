package net.codejava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Contactsinfo {

	static Scanner allinput = new Scanner(System.in);
	static Rate rateyourself = new Rate();
	static Count countdig = new Count();
	
	public void numberinfo ()
	{
		String databaseURL2 = "jdbc:ucanaccess://C:/Users/melan/eclipse-workspace/Career Pathways/dbCareerPathways.accdb";
		
		try {
			Connection connection = DriverManager.getConnection(databaseURL2);
			String schoolemail, email, city, state, parentemail, address, fullname, relationship;
			int cell, homephone, check = 0;
			int phone;
			int zip;
			
			System.out.println("Personal Information:\n");
			System.out.println("School Based Email:");
			schoolemail = allinput.nextLine();
			System.out.println("Phone Number:");
			phone = allinput.nextInt();
			System.out.println("OK CHECKING...." + countdig.Countdig2(phone));
			if(countdig.Countdig2(phone)> 9 || countdig.Countdig2(phone) < 9)
			{
				 System.out.println("INVAILD PHONE NUMBER!");
				 check = 1;
				 
				 while(check == 1)
				 {
					 System.out.println("Please enter in VAILD Phone Number:");
					 phone = allinput.nextInt();
					 
					 if(countdig.Countdig2(phone) > 9 || countdig.Countdig2(phone) < 9)
					 {
						 System.out.println("INVAILD PHONE NUMBER!");
						 check = 1;
					 }else
					 {
						 check = 0;
					 }
					 
				 }
			 }
			System.out.println("Email:");
			email = allinput.nextLine();
			System.out.println("Address:");
			address = allinput.nextLine();
			System.out.println("City:");
			city = allinput.nextLine();
			System.out.println("State:");
			state = allinput.nextLine();
			System.out.println("Zip Code: ");
			zip = allinput.nextInt();
			if (countdig.Countdig3(zip)> 4 || countdig.Countdig3(zip) < 4)
			 {
				 System.out.println("INVAILD Zip Code!");
				 check = 1;
				 
				 while(check == 1)
				 {
					 System.out.println("Please enter in VAILD Zip Code:");
					 zip = allinput.nextInt();
					 
					 if(countdig.Countdig3(zip) > 5 || countdig.Countdig3(zip) < 5)
					 {
						 System.out.println("INVAILD Zip Code!");
						 check = 1;
					 }else
					 {
						 check = 0;
					 }
					 
				 }
			 }
			
			System.out.println("You're information has been taken to store!");
			
			System.out.println("Parent/Guardian Section\n");
			System.out.println("Full Name:");
			fullname = allinput.nextLine();
			System.out.println("Email:");
			parentemail = allinput.nextLine();
			System.out.println("Phone:");
			cell = allinput.nextInt();
			if (countdig.Countdig(cell)> 9 || countdig.Countdig(cell) < 9)
			 {
				 System.out.println("INVAILD PHONE NUMBER!");
				 check = 1;
				 
				 while(check == 1)
				 {
					 System.out.println("Please enter in VAILD Phone Number:");
					 cell = allinput.nextInt();
					 
					 if(countdig.Countdig(cell) > 9 || countdig.Countdig(cell) < 9)
					 {
						 System.out.println("INVAILD PHONE NUMBER!");
						 check = 1;
					 }else
					 {
						 check = 0;
					 }
					 
				 }
			 }
			System.out.println("Relationship: ");
			relationship = allinput.nextLine();
			System.out.println("________________");
			System.out.println("Home Phone:");
			homephone = allinput.nextInt();
			if (countdig.Countdig(homephone)> 9 || countdig.Countdig(homephone) < 9)
			 {
				 System.out.println("INVAILD PHONE NUMBER!");
				 check = 1;
				 
				 while(check == 1)
				 {
					 System.out.println("Please enter in VAILD Phone Number:");
					 homephone = allinput.nextInt();
					 
					 if(countdig.Countdig(homephone) > 9 || countdig.Countdig(homephone) < 9)
					 {
						 System.out.println("INVAILD PHONE NUMBER!");
						 check = 1;
					 }else
					 {
						 check = 0;
					 }
					 
				 }
			 }
			 System.out.println("Ok, Great!");
			 String sql4 = "INSERT INTO Contact_tab (School_Email, AddEmail, Phone, Address, City, State, Zip, FullName, "
			 		+ "Relation, Home, ParentEmail, Cell) "
			 		+ "Values (?,?,?,?,?,?,?,?,?,?,?,?)";
				
				PreparedStatement statement = connection.prepareStatement(sql4);
				
				statement.setString(1, schoolemail);
				statement.setString(2, email);
				statement.setInt(3, phone);
				statement.setString(4, address);
				statement.setString(5, city);
				statement.setString(6, state);
				statement.setInt(7, zip);
				statement.setString(8, fullname);
				statement.setString(9, relationship);
				statement.setInt(10, homephone);
				statement.setInt(11, cell);
				statement.setString(12, parentemail);
				
				int rows = statement.executeUpdate();
				
				if (rows> 0)
				{
					System.out.println("OK, the information has been inserted!");
					
				}
			
				System.out.println("________________________________________\n");
				
				connection.close();
				rateyourself.employ();
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
	}
}
