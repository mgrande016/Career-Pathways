package net.codejava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Mess {

	static Scanner allinput = new Scanner(System.in);
	static String databaseURL = "jdbc:ucanaccess://C:/Users/melan/eclipse-workspace/Career Pathways/dbCareerPathways.accdb";
	static Dash dashboard = new Dash();
	static int answer, sec, check = 0;
	public static void welcome()
	{
		System.out.println("You Have Two (2) New Messages.");
		System.out.println("_______________________________\n");
		System.out.println("Would you like to view your messages?");
		answer = allinput.nextInt();
		
		switch(answer)
		{
		case 1:
			System.out.println("OK LOADING...");
			Mess.messages();
			break;
			
		case 2: 
			System.out.println("OK LOADING...");
			dashboard.welcome();
			break;
			
		default:
			System.out.println("INVAILD INPUT");
			check = 1;
			
			while(check == 1)
			{
				System.out.println("Would you like to view your messages?");
				answer = allinput.nextInt();
				
				switch(answer)
				{
				case 1:
					check = 0;
					System.out.println("OK LOADING...");
					Mess.messages();
					break;
					
				case 2: 
					check = 0;
					System.out.println("OK LOADING...");
					dashboard.welcome();
					break;
					
				default:
					System.out.println("INVAILD INPUT");
					check = 1;
					break;
				}
			}
		}
	}
	
	public static void messages()
	{
		
		try {
			Connection connect = DriverManager.getConnection(databaseURL);
			System.out.println("Which message/s would you like to view?\n"
					+ "1 - CTE Experience Enrollment Confirmation\n"
					+ "2 - (TASK) E - sign Your Training Plan");
			answer = allinput.nextInt();
			
			if (answer == 1)
			{
				System.out.println("OK, LOADING...");
				
				String sql = "SELECT * FROM messages_tab";
				System.out.println(sql);
				System.out.println("________________________");
				System.out.println("Would you like to view your other message?");
				sec = allinput.nextInt();
				
				switch(sec)
				{
				case 0:
					System.out.println("OK LOADING...");
					Mess.tasks();
					break;
					
				case 1: 
					System.out.println("OK, TO DASHBOARD");
					dashboard.welcome();
					break;
					
				default:
					System.out.println("INVAILD INPUT");
					check = 1;
					
					while(check == 1)
					{
						System.out.println("Would you like to view your messages?");
						answer = allinput.nextInt();
						
						switch(sec)
						{
						case 0:
							check = 0;
							System.out.println("OK LOADING...");
							Mess.tasks();
							break;
							
						case 1: 
							check = 0;
							System.out.println("OK LOADING...");
							dashboard.welcome();
							break;
							
						default:
							System.out.println("INVAILD INPUT");
							check = 1;
							break;
						}
					}
				}
				
			}else if (answer == 2)
			{
				System.out.println("OK LOADING...");
				Mess.tasks();
			}else
			{
				System.out.println("INVAILD INPUT");
				check = 1;
				
				while (check == 1)
				{
					System.out.println("Which message/s would you like to view?\n"
							+ "1 - CTE Experience Enrollment Confirmation\n"
							+ "2 - (TASK) E - sign Your Training Plan");
					answer = allinput.nextInt();
					
					if (answer == 1)
					{
						check = 0;
						System.out.println("OK, LOADING...");
						
						String sql = "SELECT * FROM messages_tab";
						System.out.println(sql);
						System.out.println("________________________");
						System.out.println("Would you like to view your other message?");
						sec = allinput.nextInt();
						
						switch(sec)
						{
						case 0:
							System.out.println("OK LOADING...");
							Mess.tasks();
							break;
							
						case 1: 
							System.out.println("OK, TO DASHBOARD");
							dashboard.welcome();
							break;
							
						default:
							System.out.println("INVAILD INPUT");
							check = 1;
							
							while(check == 1)
							{
								System.out.println("Would you like to view your messages?");
								answer = allinput.nextInt();
								
								switch(sec)
								{
								case 0:
									check = 0;
									System.out.println("OK LOADING...");
									Mess.tasks();
									break;
									
								case 1: 
									check = 0;
									System.out.println("OK LOADING...");
									dashboard.welcome();
									break;
									
								default:
									System.out.println("INVAILD INPUT");
									check = 1;
									break;
								}
							}
						}
						
					}else if (answer == 2)
					{
						check = 0;
						System.out.println("OK LOADING...");
						Mess.tasks();
					}else
					{
						System.out.println("INVAILD INPUT");
						check = 1;
						
					}
				}
				
			}
			connect.close();
			dashboard.welcome();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}

	public static void tasks()
	{
		try {
			Connection connect = DriverManager.getConnection(databaseURL);
			String name, sign, date;
			System.out.println("You have one task:\n"
					+ "E - sign Your Training Plan");
			
			System.out.println("TASK: Your NYCCP Training Plan is ready for E-Signature.\r\n"
					+ "\r\n"
					+ "To E-sign Your NYCCP Training Plan you will need to:\r\n"
					+ "\r\n"
					+ "    1. Return to the NYCCP Participant Portal and log in at https://participants.careerpathways.nyc\r\n"
					+ "    2. Click on Training Plan\r\n"
					+ "    3. Choose the unsigned Experience Training Plan\r\n"
					+ "    4. Choose \"Sign\" \r\n"
					+ "    5. Complete the form, then choose \"Save Signature\"\r\n"
					+ "\r\n"
					+ "If you have any questions or run into any issues with the E-Signature, please reach out to the Work-Based Learning Coordinator at your school.\r\n"
					+ "\r\n"
					+ "Student Internship Management Services\r\n"
					+ "New York City Department of Education\r\n"
					+ "(718) 935-5820\r\n"
					+ "wblbox@schools.nyc.gov");
			System.out.println("___________________________________________________________");
			
			System.out.println("Print Name: ");
			name = allinput.nextLine();
			System.out.println("Sign Name:");
			sign = allinput.nextLine();
			System.out.println("Date: ");
			date = allinput.nextLine();
			
			String sql = "INSERT INTO tasks_tab (Name, sign, datetab) Values(?,?,?)";
			PreparedStatement statement = connect.prepareStatement(sql);
			
			statement.setString(1, name);
			statement.setString(2, sign);
			statement.setString(3, date);
			
			int rows = statement.executeUpdate();
			
			if (rows> 0)
			{
				System.out.println("OK, the information has been inserted!");
				
			}
		
			System.out.println("________________________________________\n");
			
			System.out.println("Would you like to return to messages?");
			answer = allinput.nextInt();
			
			if (answer == 0)
			{
				System.out.println("OK,LOADING");
				dashboard.welcome();
			}else if (answer == 1)
			{
				System.out.println("OK, LOADING...");
				Mess.messages();
			}else 
			{
				System.out.println("INVAILD INPUT");
				check = 1; 
				
				while (check == 1)
				{
					System.out.println("Would you like to return to messages?");
					answer = allinput.nextInt();
					
					if (answer == 0)
					{
						check = 0;
						System.out.println("OK,LOADING");
						dashboard.welcome();
					}
					else if (answer == 1)
					{
						check = 0;
						System.out.println("OK, LOADING...");
						Mess.messages();
					}else 
					{
						System.out.println("INVAILD INPUT");
						check = 1;
					}
				}
			}
			connect.close();
			dashboard.welcome();
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		
		
	}
}
