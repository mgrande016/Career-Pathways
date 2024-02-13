package net.codejava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Employment {
		static int collaboration, personal, dependable, problem, attitude, social, techno, time, error = 0;
		static Dash dashboard = new Dash();
		static Scanner allinput = new Scanner(System.in);
		
		public static void employskills()
		{
			String database5 = "jdbc:ucanaccess://C:/Users/melan/eclipse-workspace/Career Pathways/dbCareerPathways.accdb";
			
			try {
				Connection connect = DriverManager.getConnection(database5);
				System.out.println("Ok, Great!\n");
				
				System.out.println("Collaboration: ");
				collaboration = allinput.nextInt();
				if ( collaboration > 4 || collaboration < 0)
				{
					System.out.println("INCORRECT INPUT! TRY AGAIN");
					error = 1;
					while(error == 1)
					{

						System.out.println("Collaboration: ");
						collaboration = allinput.nextInt();
						
						if (collaboration < 0)
						{
							System.out.println("INCORRECT INPUT! TRY AGAIN");
							error = 1;
						}
						else
						{
							error = 0;
						}
					}
				}
				System.out.println("Dependable: ");
				dependable = allinput.nextInt();
				if (dependable > 4 || dependable < 0)
				{
					System.out.println("INCORRECT INPUT! TRY AGAIN");
					error = 1;
					while(error == 1)
					{

						System.out.println("Dependable: ");
						dependable = allinput.nextInt();
						
						if (dependable > 4 || dependable < 0)
						{
							System.out.println("INCORRECT INPUT! TRY AGAIN");
							error = 1;
						}
						else
						{
							error = 0;
						}
					}
				}
				System.out.println("Personal Mindset: ");
				personal = allinput.nextInt();
				if (personal > 4 || personal < 0)
				{
					System.out.println("INCORRECT INPUT! TRY AGAIN");
					error = 1;
					while(error == 1)
					{

						System.out.println("Personal Mindset ");
						personal = allinput.nextInt();
						
						if (personal > 4 || personal < 0)
						{
							System.out.println("INCORRECT INPUT! TRY AGAIN");
							error = 1;
						}
						else
						{
							error = 0;
						}
					}
				}
				System.out.println("Problem Solving: ");
				problem = allinput.nextInt();
				if (problem > 4 || problem < 0)
				{
					System.out.println("INCORRECT INPUT! TRY AGAIN");
					error = 1;
					while(error == 1)
					{

						System.out.println("Problem Solving ");
						problem = allinput.nextInt();
						
						if (problem > 4 || problem < 0)
						{
							System.out.println("INCORRECT INPUT! TRY AGAIN");
							error = 1;
						}
						else
						{
							error = 0;
						}
					}
				}
				System.out.println("Professional Attutide: ");
				attitude = allinput.nextInt();  
				if (attitude > 4 || attitude < 0)
				{
					System.out.println("INCORRECT INPUT! TRY AGAIN");
					error = 1;
					while(error == 1)
					{

						System.out.println("Professional Attutide: ");
						attitude = allinput.nextInt();
						
						if (attitude > 4 || attitude < 0)
						{
							System.out.println("INCORRECT INPUT! TRY AGAIN");
							error = 1;
						}
						else
						{
							error = 0;
						}
					}
				}
				System.out.println("Social Awareness:");
				social = allinput.nextInt();
				if (attitude > 4 || attitude < 0)
				{
					System.out.println("INCORRECT INPUT! TRY AGAIN");
					error = 1;
					while(error == 1)
					{

						System.out.println("Professional Attutide: ");
						attitude = allinput.nextInt();
						
						if (attitude > 4 || attitude < 0)
						{
							System.out.println("INCORRECT INPUT! TRY AGAIN");
							error = 1;
						}
						else
						{
							error = 0;
						}
					}
				}   
				System.out.println("Technology: ");
				techno = allinput.nextInt();
				if (techno > 4 || techno < 0)
				{
					System.out.println("INCORRECT INPUT! TRY AGAIN");
					error = 1;
					while(error == 1)
					{

						System.out.println("Technology: ");
						techno= allinput.nextInt();
						
						if (techno > 4 || techno < 0)
						{
							System.out.println("INCORRECT INPUT! TRY AGAIN");
							error = 1;
						}
						else
						{
							error = 0;
						}
					}
				}
				System.out.println("Time and Attendence:");
				time = allinput.nextInt();
				if (time > 4 || time < 0)
				{
					System.out.println("INCORRECT INPUT! TRY AGAIN");
					error = 1;
					while(error == 1)
					{

						System.out.println("Time and Attendence: ");
						time = allinput.nextInt();
						
						if (time > 4 || time < 0)
						{
							System.out.println("INCORRECT INPUT! TRY AGAIN");
							error = 1;
						}
						else
						{
							error = 0;
						}
					}
				}
				
				String sql = "INSERT INTO intro1_employment (Collab, Depend, Personal, Problem, Professional, Social, Technology, Time) Values (?,?,?,?,?,?,?,?)";
				
				PreparedStatement statement = connect.prepareStatement(sql);
				
				statement.setInt(1, collaboration);
				statement.setInt(2, dependable);
				statement.setInt(3, personal);
				statement.setInt(4, problem);
				statement.setInt(5, attitude);
				statement.setInt(6, social);
				statement.setInt(7, techno);
				statement.setInt(8, time);
				
				int rows = statement.executeUpdate();
				
				if (rows> 0)
				{
					System.out.println("OK, the information has been inserted!");
					
				}
			
				System.out.println("________________________________________\n");
				System.out.println("Do you wish to see your teacher's rating towards you? (1 - yes, 2 - no");
				int answer = allinput.nextInt();
				
				if (answer == 1)
				{
					String sql2 = "SELECT * FROM teacher_rating ";
					System.out.println(sql2);				
				}else{
					System.out.println("Ok!");
				}
				connect.close();
				dashboard.welcome();
			
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
		
		public static void intro2employskills()
		{
			String database6 = "jdbc:ucanaccess://C:/Users/melan/eclipse-workspace/Career Pathways/dbCareerPathways.accdb";
			
			try {
				Connection connection = DriverManager.getConnection(database6);

				System.out.println("Collaboration: ");
				collaboration = allinput.nextInt();
				if ( collaboration > 4 || collaboration < 0)
				{
					System.out.println("INCORRECT INPUT! TRY AGAIN");
					error = 1;
					while(error == 1)
					{

						System.out.println("Collaboration: ");
						collaboration = allinput.nextInt();
						
						if (collaboration < 0)
						{
							System.out.println("INCORRECT INPUT! TRY AGAIN");
							error = 1;
						}
						else
						{
							error = 0;
						}
					}
				}
				System.out.println("Dependable: ");
				dependable = allinput.nextInt();
				if (dependable > 4 || dependable < 0)
				{
					System.out.println("INCORRECT INPUT! TRY AGAIN");
					error = 1;
					while(error == 1)
					{

						System.out.println("Dependable: ");
						dependable = allinput.nextInt();
						
						if (dependable > 4 || dependable < 0)
						{
							System.out.println("INCORRECT INPUT! TRY AGAIN");
							error = 1;
						}
						else
						{
							error = 0;
						}
					}
				}
				System.out.println("Personal Mindset: ");
				personal = allinput.nextInt();
				if (personal > 4 || personal < 0)
				{
					System.out.println("INCORRECT INPUT! TRY AGAIN");
					error = 1;
					while(error == 1)
					{

						System.out.println("Personal Mindset ");
						personal = allinput.nextInt();
						
						if (personal > 4 || personal < 0)
						{
							System.out.println("INCORRECT INPUT! TRY AGAIN");
							error = 1;
						}
						else
						{
							error = 0;
						}
					}
				}
				System.out.println("Problem Solving: ");
				problem = allinput.nextInt();
				if (problem > 4 || problem < 0)
				{
					System.out.println("INCORRECT INPUT! TRY AGAIN");
					error = 1;
					while(error == 1)
					{

						System.out.println("Problem Solving ");
						problem = allinput.nextInt();
						
						if (problem > 4 || problem < 0)
						{
							System.out.println("INCORRECT INPUT! TRY AGAIN");
							error = 1;
						}
						else
						{
							error = 0;
						}
					}
				}
				System.out.println("Professional Attutide: ");
				attitude = allinput.nextInt();  
				if (attitude > 4 || attitude < 0)
				{
					System.out.println("INCORRECT INPUT! TRY AGAIN");
					error = 1;
					while(error == 1)
					{

						System.out.println("Professional Attutide: ");
						attitude = allinput.nextInt();
						
						if (attitude > 4 || attitude < 0)
						{
							System.out.println("INCORRECT INPUT! TRY AGAIN");
							error = 1;
						}
						else
						{
							error = 0;
						}
					}
				}
				System.out.println("Social Awareness:");
				social = allinput.nextInt();
				if (attitude > 4 || attitude < 0)
				{
					System.out.println("INCORRECT INPUT! TRY AGAIN");
					error = 1;
					while(error == 1)
					{

						System.out.println("Professional Attutide: ");
						attitude = allinput.nextInt();
						
						if (attitude > 4 || attitude < 0)
						{
							System.out.println("INCORRECT INPUT! TRY AGAIN");
							error = 1;
						}
						else
						{
							error = 0;
						}
					}
				}   
				System.out.println("Technology: ");
				techno = allinput.nextInt();
				if (techno > 4 || techno < 0)
				{
					System.out.println("INCORRECT INPUT! TRY AGAIN");
					error = 1;
					while(error == 1)
					{

						System.out.println("Technology: ");
						techno= allinput.nextInt();
						
						if (techno > 4 || techno < 0)
						{
							System.out.println("INCORRECT INPUT! TRY AGAIN");
							error = 1;
						}
						else
						{
							error = 0;
						}
					}
				}
				System.out.println("Time and Attendence:");
				time = allinput.nextInt();
				if (time > 4 || time < 0)
				{
					System.out.println("INCORRECT INPUT! TRY AGAIN");
					error = 1;
					while(error == 1)
					{

						System.out.println("Time and Attendence: ");
						time = allinput.nextInt();
						
						if (time > 4 || time < 0)
						{
							System.out.println("INCORRECT INPUT! TRY AGAIN");
							error = 1;
						}
						else
						{
							error = 0;
						}
					}
				}
				
				String sql = "INSERT INTO intro2_employment (Collab, Depend, Personal, Problem, Professional, Social, Technology, Time) Values (?,?,?,?,?,?,?,?)";
				
				PreparedStatement statement = connection.prepareStatement(sql);
				
				statement.setInt(1, collaboration);
				statement.setInt(2, dependable);
				statement.setInt(3, personal);
				statement.setInt(4, problem);
				statement.setInt(5, attitude);
				statement.setInt(6, social);
				statement.setInt(7, techno);
				statement.setInt(8, time);
				
				int rows = statement.executeUpdate();
				
				if (rows> 0)
				{
					System.out.println("OK, the information has been inserted!");
					
				}
			
				System.out.println("________________________________________\n");
				System.out.println("Do you wish to see your teacher's rating towards you? (1 - yes, 2 - no");
				int answer = allinput.nextInt();
				
				if (answer == 1)
				{
					String sql2 = "SELECT * FROM teacher_rating ";
					System.out.println(sql2);				
				}else{
					System.out.println("Ok!");
				}
				connection.close();
				dashboard.welcome();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
		
		public static void web1skills()
		{
			String database7 = "jdbc:ucanaccess://C:/Users/melan/eclipse-workspace/Career Pathways/dbCareerPathways.accdb";
			
			try {
				Connection connect = DriverManager.getConnection(database7);
				System.out.println("Collaboration: ");
				collaboration = allinput.nextInt();
				if ( collaboration > 4 || collaboration < 0)
				{
					System.out.println("INCORRECT INPUT! TRY AGAIN");
					error = 1;
					while(error == 1)
					{

						System.out.println("Collaboration: ");
						collaboration = allinput.nextInt();
						
						if (collaboration < 0)
						{
							System.out.println("INCORRECT INPUT! TRY AGAIN");
							error = 1;
						}
						else
						{
							error = 0;
						}
					}
				}
				System.out.println("Dependable: ");
				dependable = allinput.nextInt();
				if (dependable > 4 || dependable < 0)
				{
					System.out.println("INCORRECT INPUT! TRY AGAIN");
					error = 1;
					while(error == 1)
					{

						System.out.println("Dependable: ");
						dependable = allinput.nextInt();
						
						if (dependable > 4 || dependable < 0)
						{
							System.out.println("INCORRECT INPUT! TRY AGAIN");
							error = 1;
						}
						else
						{
							error = 0;
						}
					}
				}
				System.out.println("Personal Mindset: ");
				personal = allinput.nextInt();
				if (personal > 4 || personal < 0)
				{
					System.out.println("INCORRECT INPUT! TRY AGAIN");
					error = 1;
					while(error == 1)
					{

						System.out.println("Personal Mindset ");
						personal = allinput.nextInt();
						
						if (personal > 4 || personal < 0)
						{
							System.out.println("INCORRECT INPUT! TRY AGAIN");
							error = 1;
						}
						else
						{
							error = 0;
						}
					}
				}
				System.out.println("Problem Solving: ");
				problem = allinput.nextInt();
				if (problem > 4 || problem < 0)
				{
					System.out.println("INCORRECT INPUT! TRY AGAIN");
					error = 1;
					while(error == 1)
					{

						System.out.println("Problem Solving ");
						problem = allinput.nextInt();
						
						if (problem > 4 || problem < 0)
						{
							System.out.println("INCORRECT INPUT! TRY AGAIN");
							error = 1;
						}
						else
						{
							error = 0;
						}
					}
				}
				System.out.println("Professional Attutide: ");
				attitude = allinput.nextInt();  
				if (attitude > 4 || attitude < 0)
				{
					System.out.println("INCORRECT INPUT! TRY AGAIN");
					error = 1;
					while(error == 1)
					{

						System.out.println("Professional Attutide: ");
						attitude = allinput.nextInt();
						
						if (attitude > 4 || attitude < 0)
						{
							System.out.println("INCORRECT INPUT! TRY AGAIN");
							error = 1;
						}
						else
						{
							error = 0;
						}
					}
				}
				System.out.println("Social Awareness:");
				social = allinput.nextInt();
				if (attitude > 4 || attitude < 0)
				{
					System.out.println("INCORRECT INPUT! TRY AGAIN");
					error = 1;
					while(error == 1)
					{

						System.out.println("Professional Attutide: ");
						attitude = allinput.nextInt();
						
						if (attitude > 4 || attitude < 0)
						{
							System.out.println("INCORRECT INPUT! TRY AGAIN");
							error = 1;
						}
						else
						{
							error = 0;
						}
					}
				}   
				System.out.println("Technology: ");
				techno = allinput.nextInt();
				if (techno > 4 || techno < 0)
				{
					System.out.println("INCORRECT INPUT! TRY AGAIN");
					error = 1;
					while(error == 1)
					{

						System.out.println("Technology: ");
						techno= allinput.nextInt();
						
						if (techno > 4 || techno < 0)
						{
							System.out.println("INCORRECT INPUT! TRY AGAIN");
							error = 1;
						}
						else
						{
							error = 0;
						}
					}
				}
				System.out.println("Time and Attendence:");
				time = allinput.nextInt();
				if (time > 4 || time < 0)
				{
					System.out.println("INCORRECT INPUT! TRY AGAIN");
					error = 1;
					while(error == 1)
					{

						System.out.println("Time and Attendence: ");
						time = allinput.nextInt();
						
						if (time > 4 || time < 0)
						{
							System.out.println("INCORRECT INPUT! TRY AGAIN");
							error = 1;
						}
						else
						{
							error = 0;
						}
					}
				}
				
				String sql = "INSERT INTO web1_employment (Collab, Depend, Personal, Problem, Professional, Social, Technology, Time) Values (?,?,?,?,?,?,?,?)";
				
				PreparedStatement statement = connect.prepareStatement(sql);
				
				statement.setInt(1, collaboration);
				statement.setInt(2, dependable);
				statement.setInt(3, personal);
				statement.setInt(4, problem);
				statement.setInt(5, attitude);
				statement.setInt(6, social);
				statement.setInt(7, techno);
				statement.setInt(8, time);
				
				int rows = statement.executeUpdate();
				
				if (rows> 0)
				{
					System.out.println("OK, the information has been inserted!");
					
				}
			
				System.out.println("________________________________________\n");
				System.out.println("Do you wish to see your teacher's rating towards you? (1 - yes, 2 - no");
				int answer = allinput.nextInt();
				
				if (answer == 1)
				{
					String sql2 = "SELECT * FROM teacher_rating ";
					System.out.println(sql2);				
				}else{
					System.out.println("Ok!");
				}
				connect.close();
				dashboard.welcome();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
		
		public static void web2skills()
		{
			String database8 = "jdbc:ucanaccess://C:/Users/melan/eclipse-workspace/Career Pathways/dbCareerPathways.accdb";
			
			try {
				Connection connection = DriverManager.getConnection(database8);
				System.out.println("Collaboration: ");
				collaboration = allinput.nextInt();
				if ( collaboration > 4 || collaboration < 0)
				{
					System.out.println("INCORRECT INPUT! TRY AGAIN");
					error = 1;
					while(error == 1)
					{

						System.out.println("Collaboration: ");
						collaboration = allinput.nextInt();
						
						if (collaboration < 0)
						{
							System.out.println("INCORRECT INPUT! TRY AGAIN");
							error = 1;
						}
						else
						{
							error = 0;
						}
					}
				}
				System.out.println("Dependable: ");
				dependable = allinput.nextInt();
				if (dependable > 4 || dependable < 0)
				{
					System.out.println("INCORRECT INPUT! TRY AGAIN");
					error = 1;
					while(error == 1)
					{

						System.out.println("Dependable: ");
						dependable = allinput.nextInt();
						
						if (dependable > 4 || dependable < 0)
						{
							System.out.println("INCORRECT INPUT! TRY AGAIN");
							error = 1;
						}
						else
						{
							error = 0;
						}
					}
				}
				System.out.println("Personal Mindset: ");
				personal = allinput.nextInt();
				if (personal > 4 || personal < 0)
				{
					System.out.println("INCORRECT INPUT! TRY AGAIN");
					error = 1;
					while(error == 1)
					{

						System.out.println("Personal Mindset ");
						personal = allinput.nextInt();
						
						if (personal > 4 || personal < 0)
						{
							System.out.println("INCORRECT INPUT! TRY AGAIN");
							error = 1;
						}
						else
						{
							error = 0;
						}
					}
				}
				System.out.println("Problem Solving: ");
				problem = allinput.nextInt();
				if (problem > 4 || problem < 0)
				{
					System.out.println("INCORRECT INPUT! TRY AGAIN");
					error = 1;
					while(error == 1)
					{

						System.out.println("Problem Solving ");
						problem = allinput.nextInt();
						
						if (problem > 4 || problem < 0)
						{
							System.out.println("INCORRECT INPUT! TRY AGAIN");
							error = 1;
						}
						else
						{
							error = 0;
						}
					}
				}
				System.out.println("Professional Attutide: ");
				attitude = allinput.nextInt();  
				if (attitude > 4 || attitude < 0)
				{
					System.out.println("INCORRECT INPUT! TRY AGAIN");
					error = 1;
					while(error == 1)
					{

						System.out.println("Professional Attutide: ");
						attitude = allinput.nextInt();
						
						if (attitude > 4 || attitude < 0)
						{
							System.out.println("INCORRECT INPUT! TRY AGAIN");
							error = 1;
						}
						else
						{
							error = 0;
						}
					}
				}
				System.out.println("Social Awareness:");
				social = allinput.nextInt();
				if (attitude > 4 || attitude < 0)
				{
					System.out.println("INCORRECT INPUT! TRY AGAIN");
					error = 1;
					while(error == 1)
					{

						System.out.println("Professional Attutide: ");
						attitude = allinput.nextInt();
						
						if (attitude > 4 || attitude < 0)
						{
							System.out.println("INCORRECT INPUT! TRY AGAIN");
							error = 1;
						}
						else
						{
							error = 0;
						}
					}
				}   
				System.out.println("Technology: ");
				techno = allinput.nextInt();
				if (techno > 4 || techno < 0)
				{
					System.out.println("INCORRECT INPUT! TRY AGAIN");
					error = 1;
					while(error == 1)
					{

						System.out.println("Technology: ");
						techno= allinput.nextInt();
						
						if (techno > 4 || techno < 0)
						{
							System.out.println("INCORRECT INPUT! TRY AGAIN");
							error = 1;
						}
						else
						{
							error = 0;
						}
					}
				}
				System.out.println("Time and Attendence:");
				time = allinput.nextInt();
				if (time > 4 || time < 0)
				{
					System.out.println("INCORRECT INPUT! TRY AGAIN");
					error = 1;
					while(error == 1)
					{

						System.out.println("Time and Attendence: ");
						time = allinput.nextInt();
						
						if (time > 4 || time < 0)
						{
							System.out.println("INCORRECT INPUT! TRY AGAIN");
							error = 1;
						}
						else
						{
							error = 0;
						}
					}
				}
				
				String sql = "INSERT INTO web2_employment (Collab, Depend, Personal, Problem, Professional, Social, Technology, Time) Values (?,?,?,?,?,?,?,?)";
				
				PreparedStatement statement = connection.prepareStatement(sql);
				
				statement.setInt(1, collaboration);
				statement.setInt(2, dependable);
				statement.setInt(3, personal);
				statement.setInt(4, problem);
				statement.setInt(5, attitude);
				statement.setInt(6, social);
				statement.setInt(7, techno);
				statement.setInt(8, time);
				
				int rows = statement.executeUpdate();
				
				if (rows> 0)
				{
					System.out.println("OK, the information has been inserted!");
					
				}
			
				System.out.println("________________________________________\n");
				System.out.println("Do you wish to see your teacher's rating towards you? (1 - yes, 2 - no");
				int answer = allinput.nextInt();
				
				if (answer == 1)
				{
					String sql2 = "SELECT * FROM teacher_rating ";
					System.out.println(sql2);				
				}else{
					System.out.println("Ok!");
				}
				connection.close();
				dashboard.welcome();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
		
		public static void javaskills()
		{
			String database9 = "jdbc:ucanaccess://C:/Users/melan/eclipse-workspace/Career Pathways/dbCareerPathways.accdb";
			
			try {
				Connection connection = DriverManager.getConnection(database9);
				System.out.println("Collaboration: ");
				collaboration = allinput.nextInt();
				if ( collaboration > 4 || collaboration < 0)
				{
					System.out.println("INCORRECT INPUT! TRY AGAIN");
					error = 1;
					while(error == 1)
					{

						System.out.println("Collaboration: ");
						collaboration = allinput.nextInt();
						
						if (collaboration < 0)
						{
							System.out.println("INCORRECT INPUT! TRY AGAIN");
							error = 1;
						}
						else
						{
							error = 0;
						}
					}
				}
				System.out.println("Dependable: ");
				dependable = allinput.nextInt();
				if (dependable > 4 || dependable < 0)
				{
					System.out.println("INCORRECT INPUT! TRY AGAIN");
					error = 1;
					while(error == 1)
					{

						System.out.println("Dependable: ");
						dependable = allinput.nextInt();
						
						if (dependable > 4 || dependable < 0)
						{
							System.out.println("INCORRECT INPUT! TRY AGAIN");
							error = 1;
						}
						else
						{
							error = 0;
						}
					}
				}
				System.out.println("Personal Mindset: ");
				personal = allinput.nextInt();
				if (personal > 4 || personal < 0)
				{
					System.out.println("INCORRECT INPUT! TRY AGAIN");
					error = 1;
					while(error == 1)
					{

						System.out.println("Personal Mindset ");
						personal = allinput.nextInt();
						
						if (personal > 4 || personal < 0)
						{
							System.out.println("INCORRECT INPUT! TRY AGAIN");
							error = 1;
						}
						else
						{
							error = 0;
						}
					}
				}
				System.out.println("Problem Solving: ");
				problem = allinput.nextInt();
				if (problem > 4 || problem < 0)
				{
					System.out.println("INCORRECT INPUT! TRY AGAIN");
					error = 1;
					while(error == 1)
					{

						System.out.println("Problem Solving ");
						problem = allinput.nextInt();
						
						if (problem > 4 || problem < 0)
						{
							System.out.println("INCORRECT INPUT! TRY AGAIN");
							error = 1;
						}
						else
						{
							error = 0;
						}
					}
				}
				System.out.println("Professional Attutide: ");
				attitude = allinput.nextInt();  
				if (attitude > 4 || attitude < 0)
				{
					System.out.println("INCORRECT INPUT! TRY AGAIN");
					error = 1;
					while(error == 1)
					{

						System.out.println("Professional Attutide: ");
						attitude = allinput.nextInt();
						
						if (attitude > 4 || attitude < 0)
						{
							System.out.println("INCORRECT INPUT! TRY AGAIN");
							error = 1;
						}
						else
						{
							error = 0;
						}
					}
				}
				System.out.println("Social Awareness:");
				social = allinput.nextInt();
				if (attitude > 4 || attitude < 0)
				{
					System.out.println("INCORRECT INPUT! TRY AGAIN");
					error = 1;
					while(error == 1)
					{

						System.out.println("Professional Attutide: ");
						attitude = allinput.nextInt();
						
						if (attitude > 4 || attitude < 0)
						{
							System.out.println("INCORRECT INPUT! TRY AGAIN");
							error = 1;
						}
						else
						{
							error = 0;
						}
					}
				}   
				System.out.println("Technology: ");
				techno = allinput.nextInt();
				if (techno > 4 || techno < 0)
				{
					System.out.println("INCORRECT INPUT! TRY AGAIN");
					error = 1;
					while(error == 1)
					{

						System.out.println("Technology: ");
						techno= allinput.nextInt();
						
						if (techno > 4 || techno < 0)
						{
							System.out.println("INCORRECT INPUT! TRY AGAIN");
							error = 1;
						}
						else
						{
							error = 0;
						}
					}
				}
				System.out.println("Time and Attendence:");
				time = allinput.nextInt();
				if (time > 4 || time < 0)
				{
					System.out.println("INCORRECT INPUT! TRY AGAIN");
					error = 1;
					while(error == 1)
					{

						System.out.println("Time and Attendence: ");
						time = allinput.nextInt();
						
						if (time > 4 || time < 0)
						{
							System.out.println("INCORRECT INPUT! TRY AGAIN");
							error = 1;
						}
						else
						{
							error = 0;
						}
					}
				}
				
				String sql = "INSERT INTO java_employment (Collab, Depend, Personal, Problem, Professional, Social, Technology, Time) Values (?,?,?,?,?,?,?,?)";
				
				PreparedStatement statement = connection.prepareStatement(sql);
				
				statement.setInt(1, collaboration);
				statement.setInt(2, dependable);
				statement.setInt(3, personal);
				statement.setInt(4, problem);
				statement.setInt(5, attitude);
				statement.setInt(6, social);
				statement.setInt(7, techno);
				statement.setInt(8, time);
				
				int rows = statement.executeUpdate();
				
				if (rows> 0)
				{
					System.out.println("OK, the information has been inserted!");
					
				}
			
				System.out.println("________________________________________\n");
				System.out.println("Do you wish to see your teacher's rating towards you? (1 - yes, 2 - no");
				int answer = allinput.nextInt();
				
				if (answer == 1)
				{
					String sql2 = "SELECT * FROM teacher_rating ";
					System.out.println(sql2);
				}else{
					System.out.println("Ok!");
				}
				connection.close();
				dashboard.welcome();
			} catch (SQLException e) {
			
				e.printStackTrace();
			}
			
		}
}
