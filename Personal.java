package net.codejava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Personal {
		static Scanner allinput = new Scanner(System.in);
		static Additional moreinfo = new Additional();

		public void information()
		{
			String database1 = "jdbc:ucanaccess://C:/Users/melan/eclipse-workspace/Career Pathways/dbCareerPathways.accdb";
			
			try {
				Connection connect = DriverManager.getConnection(database1);
				
				String race, gender, month, disability,lang2, ell, allgie, lang, yes = "Y", no = "N";
				int grade,year, check = 0;
				
				System.out.println("Personal Information:\n");
				System.out.println("Race:");
				race = allinput.nextLine();
				System.out.println("Gender:");
				gender = allinput.nextLine();
				System.out.println("Expected Grad Month:");
				month = allinput.nextLine();
				System.out.println("Grade:");
				grade = allinput.nextInt();
				if (grade > 12 || grade<9)
				{
					System.out.println("INVAILD GRADE!");
					check = 1;
					
					while(check == 1)
					{
						System.out.println("Please enter VAILD Grade Level:");
						grade = allinput.nextInt();
						
						if(grade > 12 || grade<9)
						{
							System.out.println("INVAILD GRADE!");
							check = 1;
						}else
						{
							check = 0;
						}
					}
				}
				
				System.out.println("Expected Grad Year:");
				year = allinput.nextInt();
				if (year > 2040 || year<0)
				{
					System.out.println("INVAILD YEAR!");
					check = 1;
					
					while(check == 1)
					{
						System.out.println("Please enter VAILD Year:");
						grade = allinput.nextInt();
						
						if(year > 2040 || year <0)
						{
							System.out.println("INVAILD YEAR!");
							check = 1;
						}else
						{
							check = 0;
						}
					}
				}
				System.out.println("_________________");
				System.out.println("Do you speak any other languages other than English? (Y/N)");
				lang2 = allinput.nextLine();
				lang = lang2.toUpperCase();
				if (lang.equals(yes))
				{
					System.out.println("Ok, Please state the/those languages:");
					lang = allinput.nextLine();
				}
				else if (lang.equals(no))
				{
					lang = "No, just English";
				}else 
				{
					System.out.println("INVAILD INPUT!");
					check = 1;
				
				while (check == 1)   
				{
					System.out.println("Do you speak any other languages other than English?(Y/N)");
					lang2 = allinput.nextLine();
					lang = lang2.toUpperCase();
					if(lang.equals(yes))
					{
						System.out.println("Ok, Please state the/those languages:");
						lang = allinput.nextLine();
						check = 0;
					}else if (lang.equals(no))
					{
						lang = "No, just English";
						check = 0;
					
					}else
					{
						System.out.println("INVAILD INPUT!");
						check = 1;
					}
				} 
				}
 				System.out.println("Are you an ELL Student?");
				ell = allinput.nextLine();
				
				System.out.println("Do you have a disability?");
				disability = allinput.nextLine();
				
				System.out.println("Do you have any allergies?(Y/N)");
				String allgie2 = allinput.nextLine();
				allgie = allgie2.toUpperCase();
				if (allgie.equals(yes))
				{
					System.out.println("Ok, Please state the/those allergies:");
					allgie = allinput.nextLine();
				}else if (allgie.equals(no))
				{
					allgie = "No Allergies";
				}else
				{
					System.out.println("INVAILD INPUT!");
					check = 1;
					
					while (check == 1)
					{
						if (allgie.equals(yes))
						{
							check = 0;
							System.out.println("Ok, Please state the/those allergies:");
							allgie = allinput.nextLine();
						}else if (allgie.equals(no))
						{
							check = 0;
							allgie = "No Allergies";
						}else
						{
							System.out.println("INVAILD INPUT!");
							check = 1;
						}
					}
				
				}
				String sql = "INSERT INTO Personal_info (Race, Gender, Grade, Month, Year, Disability, ELL, Allergies) Values (?,?,?,?,?,?,?,?)";
				
				PreparedStatement statement = connect.prepareStatement(sql);
				statement.setString(1, race);
				statement.setString(2, gender);
				statement.setInt(3, grade);
				statement.setString(4, month);
				statement.setInt(5, year);
				statement.setString(6, disability);
				statement.setString(7, ell);
				statement.setString(8,  allgie);
				
				int rows = statement.executeUpdate();
				
				if (rows> 0)
				{
					System.out.println("OK, the information has been inserted!");
					
				}
			
				System.out.println("________________________________________\n");
				connect.close();
			    moreinfo.additionalinfo();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
}
