package net.codejava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Additional {
	
		static Scanner allinput = new Scanner(System.in);
		static Contactsinfo contactinformation = new Contactsinfo();
		static Count countdig = new Count();

		public void additionalinfo()
		{
			String answer, yes = "Y", no = "N";
			int check = 0;
			
			System.out.println("Emergency Contact Information:\n");
			System.out.println("Do you wish to add an emergency contact?");
			answer = allinput.nextLine();
			
			if(answer.equals(no))
			{
				System.out.println("Ok then, you are all done *WITH THIS part!");
				contactinformation.numberinfo();
			}else if(answer.equals(yes))
			{
				Additional.second();
			}else 
			{
				System.out.println("INVAILD");
				check = 1;
				
				while (check == 1)
				{
					System.out.println("Emergency Contact Information:\n");
					System.out.println("Do you wish to add an emergency contact?");
					answer = allinput.nextLine();
					
					if(answer.equals(no))
					{
						System.out.println("Ok then, you are all done!");
						check = 0;
		
					}else if (answer.equals(yes))
					{
						Additional.second();
						check = 0;
					}else 
					{
						System.out.println("Invaild!");
						check = 1;
					}
					
				}
			}
		}
		
		public static void second()
		{
			String database4 = "jdbc:ucanaccess://C:/Users/melan/eclipse-workspace/Career Pathways/dbCareerPathways.accdb";
			
			try {
				Connection connection = DriverManager.getConnection(database4);
				
				String bank,direct, environment, internet, management, device, fullname,email;
				int phone, check = 0;
				System.out.println("Contact Name:");
				fullname = allinput.nextLine();
				System.out.println("Email:");
				email = allinput.nextLine();
				System.out.println("Phone:");
				phone = allinput.nextInt();
				
				if (countdig.Countdig(phone)> 10 || countdig.Countdig(phone) < 10)
				 {
					 System.out.println("INVAILD PHONE NUMBER!");
					 check = 1;
					 
					 while(check == 1)
					 {
						 System.out.println("Please enter in VAILD Phone Number:");
						 phone = allinput.nextInt();
						 
						 if(countdig.Countdig(phone) > 10 || countdig.Countdig(phone) < 10)
						 {
							 System.out.println("INVAILD PHONE NUMBER!");
							 check = 1;
						 }else
						 {
							 check = 0;
						 }
						 
					 }
				 }
				System.out.println("Do you have a bank account?");
				bank = allinput.nextLine();
				System.out.println("Do you wish to have payment deposited through direct?");
				direct = allinput.nextLine();
				System.out.println("Have you completed the Career and Financial Management Course in your school?");
				management = allinput.nextLine();
				System.out.println("Do you have access to an electronic device with internet accessibility?");
				device = allinput.nextLine();
				System.out.println("Do you have access to the internet?");
				internet = allinput.nextLine();
				System.out.println("What internship environment are you looking for?");
				environment = allinput.nextLine();
				
				String sql = "INSERT INTO question_tab (Bank, Direct, Management, Device, Internet, Environment, FullName, Email, PhoneNum) Values (?,?,?,?,?,?.?,?,?)";
				
				PreparedStatement statement = connection.prepareStatement(sql);
				statement.setString(1, bank);
				statement.setString(2, direct);
				statement.setString(3, management);
				statement.setString(4, device);
				statement.setString(5, internet);
				statement.setString(6, environment);
				statement.setString(7, fullname);
				statement.setString(8, email);
				statement.setInt(8, phone);
				
				int rows = statement.executeUpdate();
				
				if (rows> 0)
				{
					System.out.println("OK, the information has been inserted!");
					
				}
			
				System.out.println("________________________________________\n");
				connection.close();
				contactinformation.numberinfo();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
}
