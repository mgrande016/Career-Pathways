package net.codejava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class StudentInfo {
	static Scanner allinput = new Scanner(System.in);
	static Personal personalinfo = new Personal();
	static Count countdig = new Count();
	
	public static void StudentInfo2() {
		String databaseURL = "jdbc:ucanaccess://C:/Users/melan/eclipse-workspace/Career Pathways/dbCareerPathways.accdb";
		
		try {
			Connection connection = DriverManager.getConnection(databaseURL);
			System.out.println("WELCOME TO CAREER PATHWAYS");
			
			String name,school, pathway, answer = "", yes = "Y", no = "N";
			int grade, check = 0;
			int osis;
			System.out.println("Please enter in your name: ");
			name = allinput.nextLine();
			System.out.println("School Name: ");
			school = allinput.nextLine();
			System.out.println("Career Choice:");
			pathway = allinput.nextLine();
			System.out.println("Grade Level:");
			grade = allinput.nextInt();
			if (grade > 12 || grade < 9)
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
			System.out.println("Student ID:");
			osis = allinput.nextInt();	
			System.out.println("OK CHECKING...." + countdig.Countdig(osis));
			
			if (countdig.Countdig(osis)> 9 || countdig.Countdig(osis) < 9)
			 {
				 System.out.println("INVAILD OSIS NUMBER!");
				 check = 1;
				 
				 while(check == 1)
				 {
					 System.out.println("Please enter in VAILD Student ID:");
					 osis = allinput.nextInt();
					 
					 if(countdig.Countdig(osis) > 9 || countdig.Countdig(osis) < 0)
					 {
						 System.out.println("INVAILD OSIS NUMBER!");
						 check = 1;
					 }else
					 {
						 check = 0;
					 }
					 
				 }
			 }
				 System.out.println("Ok, Great!");
				 String sql = "INSERT INTO Student_Info_Tab (Name, School, Grade_level, OSIS, Pathway) Values (?,?,?,?,?)";
					
					PreparedStatement statement = connection.prepareStatement(sql);
					statement.setString(1, name);
					statement.setString(2, school);
					statement.setInt(3, grade);
					statement.setInt(4, osis);
					statement.setString(5, pathway);
					
					int rows = statement.executeUpdate();
					
					if (rows> 0)
					{
						System.out.println("OK, the information has been inserted!");
						
					}
				
					System.out.println("________________________________________\n");
					
					connection.close();
					personalinfo.information();
			 
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

}
