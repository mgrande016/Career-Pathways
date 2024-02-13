package net.codejava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Literacy {
	
	static Scanner allinput = new Scanner(System.in);
	static Dash dashboard = new Dash();
	static String database10 = "jdbc:ucanaccess://C:/Users/melan/eclipse-workspace/Career Pathways/dbCareerPathways.accdb";
	static int civic, creativity, economic, environmental, global, health, scientific, error = 0;
	public static void intro1() 
	{
		try {
			Connection connection = DriverManager.getConnection(database10);
			System.out.println("OK, Great!");
			
			System.out.println("Civic:");
			civic = allinput.nextInt();
			if (civic > 4 || civic < 0)
			{
				System.out.println("INCORRECT INPUT! TRY AGAIN");
				error = 1;
				while(error == 1)
				{

					System.out.println("Civic: ");
					civic = allinput.nextInt();
					
					if (civic > 4 || civic < 0)
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
			System.out.println("Creativity:");
			creativity = allinput.nextInt();
			if (creativity > 4 || creativity < 0)
			{
				System.out.println("INCORRECT INPUT! TRY AGAIN");
				error = 1;
				while(error == 1)
				{

					System.out.println("Creativity: ");
					creativity = allinput.nextInt();
					
					if (creativity > 4 || creativity < 0)
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
			System.out.println("Economic:");
			economic = allinput.nextInt();
			if (economic > 4 || economic < 0)
			{
				System.out.println("INCORRECT INPUT! TRY AGAIN");
				error = 1;
				while(error == 1)
				{

					System.out.println("Economic: ");
					economic = allinput.nextInt();
					
					if (economic > 4 || economic < 0)
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
			System.out.println("Environmental:");
			environmental = allinput.nextInt();
			if (environmental > 4 || environmental < 0)
			{
				System.out.println("INCORRECT INPUT! TRY AGAIN");
				error = 1;
				while(error == 1)
				{

					System.out.println("Environmental: ");
					environmental = allinput.nextInt();
					
					if (environmental > 4 || environmental < 0)
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
			System.out.println("Global Awareness:");
			global = allinput.nextInt();
			if (global > 4 || global < 0)
			{
				System.out.println("INCORRECT INPUT! TRY AGAIN");
				error = 1;
				while(error == 1)
				{

					System.out.println("Global Awareness: ");
					global = allinput.nextInt();
					
					if (global > 4 || global < 0)
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
			System.out.println("Health and Wellness:");
			health = allinput.nextInt();
			if (health > 4 || health < 0)
			{
				System.out.println("INCORRECT INPUT! TRY AGAIN");
				error = 1;
				while(error == 1)
				{

					System.out.println("Health and Awareness: ");
					health = allinput.nextInt();
					
					if (health > 4 || health < 0)
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
			System.out.println("Scientific Literacy:");
			scientific = allinput.nextInt();
			if (scientific > 4 || scientific < 0)
			{
				System.out.println("INCORRECT INPUT! TRY AGAIN");
				error = 1;
				while(error == 1)
				{

					System.out.println("Scientific Literacy:");
					scientific = allinput.nextInt();
					if (scientific > 4 || scientific < 0)
					{
						System.out.println("INCORRECT INPUT! TRY AGAIN");
						error = 1;
						while(error == 1)
						{
							System.out.println("Scientific Literacy: ");
							scientific = allinput.nextInt();
							
							if (scientific > 4 || scientific < 0)
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
				}
			}		
			String sql = "INSERT INTO intro1_literacy (Civic, Creativity, Economic, Environmental, Global, Health, Scientific) Values (?,?,?,?,?,?,?)";
			
			PreparedStatement statement = connection.prepareStatement(sql);
			
			statement.setInt(1, civic);
			statement.setInt(2, creativity);
			statement.setInt(3, economic);
			statement.setInt(4, environmental);
			statement.setInt(5, global);
			statement.setInt(6, health);
			statement.setInt(7, scientific);
			
			
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
	
	public static void intro2()
	{
		try {
			Connection connect = DriverManager.getConnection(database10);
System.out.println("OK, Great!");
			
			System.out.println("Civic:");
			civic = allinput.nextInt();
			if (civic > 4 || civic < 0)
			{
				System.out.println("INCORRECT INPUT! TRY AGAIN");
				error = 1;
				while(error == 1)
				{

					System.out.println("Civic: ");
					civic = allinput.nextInt();
					
					if (civic > 4 || civic < 0)
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
			System.out.println("Creativity:");
			creativity = allinput.nextInt();
			if (creativity > 4 || creativity < 0)
			{
				System.out.println("INCORRECT INPUT! TRY AGAIN");
				error = 1;
				while(error == 1)
				{

					System.out.println("Creativity: ");
					creativity = allinput.nextInt();
					
					if (creativity > 4 || creativity < 0)
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
			System.out.println("Economic:");
			economic = allinput.nextInt();
			if (economic > 4 || economic < 0)
			{
				System.out.println("INCORRECT INPUT! TRY AGAIN");
				error = 1;
				while(error == 1)
				{

					System.out.println("Economic: ");
					economic = allinput.nextInt();
					
					if (economic > 4 || economic < 0)
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
			System.out.println("Environmental:");
			environmental = allinput.nextInt();
			if (environmental > 4 || environmental < 0)
			{
				System.out.println("INCORRECT INPUT! TRY AGAIN");
				error = 1;
				while(error == 1)
				{

					System.out.println("Environmental: ");
					environmental = allinput.nextInt();
					
					if (environmental > 4 || environmental < 0)
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
			System.out.println("Global Awareness:");
			global = allinput.nextInt();
			if (global > 4 || global < 0)
			{
				System.out.println("INCORRECT INPUT! TRY AGAIN");
				error = 1;
				while(error == 1)
				{

					System.out.println("Global Awareness: ");
					global = allinput.nextInt();
					
					if (global > 4 || global < 0)
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
			System.out.println("Health and Wellness:");
			health = allinput.nextInt();
			if (health > 4 || health < 0)
			{
				System.out.println("INCORRECT INPUT! TRY AGAIN");
				error = 1;
				while(error == 1)
				{

					System.out.println("Health and Awareness: ");
					health = allinput.nextInt();
					
					if (health > 4 || health < 0)
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
			System.out.println("Scientific Literacy:");
			scientific = allinput.nextInt();
			if (scientific > 4 || scientific < 0)
			{
				System.out.println("INCORRECT INPUT! TRY AGAIN");
				error = 1;
				while(error == 1)
				{

					System.out.println("Scientific Literacy:");
					scientific = allinput.nextInt();
					if (scientific > 4 || scientific < 0)
					{
						System.out.println("INCORRECT INPUT! TRY AGAIN");
						error = 1;
						while(error == 1)
						{
							System.out.println("Scientific Literacy: ");
							scientific = allinput.nextInt();
							
							if (scientific > 4 || scientific < 0)
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
				}
			}		
			String sql = "INSERT INTO intro2_literacy (Civic, Creativity, Economic, Environmental, Global, Health, Scientific) Values (?,?,?,?,?,?,?)";
			
			PreparedStatement statement = connect.prepareStatement(sql);
			
			statement.setInt(1, civic);
			statement.setInt(2, creativity);
			statement.setInt(3, economic);
			statement.setInt(4, environmental);
			statement.setInt(5, global);
			statement.setInt(6, health);
			statement.setInt(7, scientific);
			
			
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
	
	public static void web1()
	{
		try {
			Connection connection = DriverManager.getConnection(database10);
			System.out.println("OK, Great!");
			
			System.out.println("Civic:");
			civic = allinput.nextInt();
			if (civic > 4 || civic < 0)
			{
				System.out.println("INCORRECT INPUT! TRY AGAIN");
				error = 1;
				while(error == 1)
				{

					System.out.println("Civic: ");
					civic = allinput.nextInt();
					
					if (civic > 4 || civic < 0)
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
			System.out.println("Creativity:");
			creativity = allinput.nextInt();
			if (creativity > 4 || creativity < 0)
			{
				System.out.println("INCORRECT INPUT! TRY AGAIN");
				error = 1;
				while(error == 1)
				{

					System.out.println("Creativity: ");
					creativity = allinput.nextInt();
					
					if (creativity > 4 || creativity < 0)
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
			System.out.println("Economic:");
			economic = allinput.nextInt();
			if (economic > 4 || economic < 0)
			{
				System.out.println("INCORRECT INPUT! TRY AGAIN");
				error = 1;
				while(error == 1)
				{

					System.out.println("Economic: ");
					economic = allinput.nextInt();
					
					if (economic > 4 || economic < 0)
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
			System.out.println("Environmental:");
			environmental = allinput.nextInt();
			if (environmental > 4 || environmental < 0)
			{
				System.out.println("INCORRECT INPUT! TRY AGAIN");
				error = 1;
				while(error == 1)
				{

					System.out.println("Environmental: ");
					environmental = allinput.nextInt();
					
					if (environmental > 4 || environmental < 0)
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
			System.out.println("Global Awareness:");
			global = allinput.nextInt();
			if (global > 4 || global < 0)
			{
				System.out.println("INCORRECT INPUT! TRY AGAIN");
				error = 1;
				while(error == 1)
				{

					System.out.println("Global Awareness: ");
					global = allinput.nextInt();
					
					if (global > 4 || global < 0)
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
			System.out.println("Health and Wellness:");
			health = allinput.nextInt();
			if (health > 4 || health < 0)
			{
				System.out.println("INCORRECT INPUT! TRY AGAIN");
				error = 1;
				while(error == 1)
				{

					System.out.println("Health and Awareness: ");
					health = allinput.nextInt();
					
					if (health > 4 || health < 0)
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
			System.out.println("Scientific Literacy:");
			scientific = allinput.nextInt();
			if (scientific > 4 || scientific < 0)
			{
				System.out.println("INCORRECT INPUT! TRY AGAIN");
				error = 1;
				while(error == 1)
				{

					System.out.println("Scientific Literacy:");
					scientific = allinput.nextInt();
					if (scientific > 4 || scientific < 0)
					{
						System.out.println("INCORRECT INPUT! TRY AGAIN");
						error = 1;
						while(error == 1)
						{
							System.out.println("Scientific Literacy: ");
							scientific = allinput.nextInt();
							
							if (scientific > 4 || scientific < 0)
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
				}
			}		
			String sql = "INSERT INTO web1_literacy (Civic, Creativity, Economic, Environmental, Global, Health, Scientific) Values (?,?,?,?,?,?,?)";
			
			PreparedStatement statement = connection.prepareStatement(sql);
			
			statement.setInt(1, civic);
			statement.setInt(2, creativity);
			statement.setInt(3, economic);
			statement.setInt(4, environmental);
			statement.setInt(5, global);
			statement.setInt(6, health);
			statement.setInt(7, scientific);
			
			
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
	
	public static void web2()
	{
		try {
			Connection connection = DriverManager.getConnection(database10);
System.out.println("OK, Great!");
			
			System.out.println("Civic:");
			civic = allinput.nextInt();
			if (civic > 4 || civic < 0)
			{
				System.out.println("INCORRECT INPUT! TRY AGAIN");
				error = 1;
				while(error == 1)
				{

					System.out.println("Civic: ");
					civic = allinput.nextInt();
					
					if (civic > 4 || civic < 0)
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
			System.out.println("Creativity:");
			creativity = allinput.nextInt();
			if (creativity > 4 || creativity < 0)
			{
				System.out.println("INCORRECT INPUT! TRY AGAIN");
				error = 1;
				while(error == 1)
				{

					System.out.println("Creativity: ");
					creativity = allinput.nextInt();
					
					if (creativity > 4 || creativity < 0)
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
			System.out.println("Economic:");
			economic = allinput.nextInt();
			if (economic > 4 || economic < 0)
			{
				System.out.println("INCORRECT INPUT! TRY AGAIN");
				error = 1;
				while(error == 1)
				{

					System.out.println("Economic: ");
					economic = allinput.nextInt();
					
					if (economic > 4 || economic < 0)
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
			System.out.println("Environmental:");
			environmental = allinput.nextInt();
			if (environmental > 4 || environmental < 0)
			{
				System.out.println("INCORRECT INPUT! TRY AGAIN");
				error = 1;
				while(error == 1)
				{

					System.out.println("Environmental: ");
					environmental = allinput.nextInt();
					
					if (environmental > 4 || environmental < 0)
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
			System.out.println("Global Awareness:");
			global = allinput.nextInt();
			if (global > 4 || global < 0)
			{
				System.out.println("INCORRECT INPUT! TRY AGAIN");
				error = 1;
				while(error == 1)
				{

					System.out.println("Global Awareness: ");
					global = allinput.nextInt();
					
					if (global > 4 || global < 0)
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
			System.out.println("Health and Wellness:");
			health = allinput.nextInt();
			if (health > 4 || health < 0)
			{
				System.out.println("INCORRECT INPUT! TRY AGAIN");
				error = 1;
				while(error == 1)
				{

					System.out.println("Health and Awareness: ");
					health = allinput.nextInt();
					
					if (health > 4 || health < 0)
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
			System.out.println("Scientific Literacy:");
			scientific = allinput.nextInt();
			if (scientific > 4 || scientific < 0)
			{
				System.out.println("INCORRECT INPUT! TRY AGAIN");
				error = 1;
				while(error == 1)
				{

					System.out.println("Scientific Literacy:");
					scientific = allinput.nextInt();
					if (scientific > 4 || scientific < 0)
					{
						System.out.println("INCORRECT INPUT! TRY AGAIN");
						error = 1;
						while(error == 1)
						{
							System.out.println("Scientific Literacy: ");
							scientific = allinput.nextInt();
							
							if (scientific > 4 || scientific < 0)
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
				}
			}		
			String sql = "INSERT INTO web2_literacy (Civic, Creativity, Economic, Environmental, Global, Health, Scientific) Values (?,?,?,?,?,?,?)";
			
			PreparedStatement statement = connection.prepareStatement(sql);
			
			statement.setInt(1, civic);
			statement.setInt(2, creativity);
			statement.setInt(3, economic);
			statement.setInt(4, environmental);
			statement.setInt(5, global);
			statement.setInt(6, health);
			statement.setInt(7, scientific);
			
			
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
	
	public static void java()
	{
		try {
			Connection connect = DriverManager.getConnection(database10);
System.out.println("OK, Great!");
			
			System.out.println("Civic:");
			civic = allinput.nextInt();
			if (civic > 4 || civic < 0)
			{
				System.out.println("INCORRECT INPUT! TRY AGAIN");
				error = 1;
				while(error == 1)
				{

					System.out.println("Civic: ");
					civic = allinput.nextInt();
					
					if (civic > 4 || civic < 0)
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
			System.out.println("Creativity:");
			creativity = allinput.nextInt();
			if (creativity > 4 || creativity < 0)
			{
				System.out.println("INCORRECT INPUT! TRY AGAIN");
				error = 1;
				while(error == 1)
				{

					System.out.println("Creativity: ");
					creativity = allinput.nextInt();
					
					if (creativity > 4 || creativity < 0)
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
			System.out.println("Economic:");
			economic = allinput.nextInt();
			if (economic > 4 || economic < 0)
			{
				System.out.println("INCORRECT INPUT! TRY AGAIN");
				error = 1;
				while(error == 1)
				{

					System.out.println("Economic: ");
					economic = allinput.nextInt();
					
					if (economic > 4 || economic < 0)
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
			System.out.println("Environmental:");
			environmental = allinput.nextInt();
			if (environmental > 4 || environmental < 0)
			{
				System.out.println("INCORRECT INPUT! TRY AGAIN");
				error = 1;
				while(error == 1)
				{

					System.out.println("Environmental: ");
					environmental = allinput.nextInt();
					
					if (environmental > 4 || environmental < 0)
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
			System.out.println("Global Awareness:");
			global = allinput.nextInt();
			if (global > 4 || global < 0)
			{
				System.out.println("INCORRECT INPUT! TRY AGAIN");
				error = 1;
				while(error == 1)
				{

					System.out.println("Global Awareness: ");
					global = allinput.nextInt();
					
					if (global > 4 || global < 0)
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
			System.out.println("Health and Wellness:");
			health = allinput.nextInt();
			if (health > 4 || health < 0)
			{
				System.out.println("INCORRECT INPUT! TRY AGAIN");
				error = 1;
				while(error == 1)
				{

					System.out.println("Health and Awareness: ");
					health = allinput.nextInt();
					
					if (health > 4 || health < 0)
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
			System.out.println("Scientific Literacy:");
			scientific = allinput.nextInt();
			if (scientific > 4 || scientific < 0)
			{
				System.out.println("INCORRECT INPUT! TRY AGAIN");
				error = 1;
				while(error == 1)
				{

					System.out.println("Scientific Literacy:");
					scientific = allinput.nextInt();
					if (scientific > 4 || scientific < 0)
					{
						System.out.println("INCORRECT INPUT! TRY AGAIN");
						error = 1;
						while(error == 1)
						{
							System.out.println("Scientific Literacy: ");
							scientific = allinput.nextInt();
							
							if (scientific > 4 || scientific < 0)
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
				}
			}	
			String sql = "INSERT INTO java_literacy (Civic, Creativity, Economic, Environmental, Global, Health, Scientific) Values (?,?,?,?,?,?,?)";
			
			PreparedStatement statement = connect.prepareStatement(sql);
			
			statement.setInt(1, civic);
			statement.setInt(2, creativity);
			statement.setInt(3, economic);
			statement.setInt(4, environmental);
			statement.setInt(5, global);
			statement.setInt(6, health);
			statement.setInt(7, scientific);
			
			
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
	
}
