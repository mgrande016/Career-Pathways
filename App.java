package net.codejava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class App {
	
	static Scanner allinput = new Scanner(System.in);
	static String answer, yes = "YES", no = "NO";
	static Dash dashboard = new Dash();
	static int check = 0;

	public static void welcome()
	{
		System.out.println("Would you like to apply for the Spring 2024 Industry Intership?");
		answer = allinput.nextLine();
		answer = answer.toUpperCase();
		
		if(answer.equals(yes))
		{
			App.yes();
		}else if (answer.equals(no))
		{
			dashboard.welcome();
		}else
		{
			System.out.println("INVAILD INPUT");
			check = 1;
			
			while(check == 1)
			{
				System.out.println("Would you like to apply for the Spring 2024 Industry Intership?");
				answer = allinput.nextLine();
				answer = answer.toUpperCase();
				
				if(answer.equals(yes))
				{
					check = 0;
					System.out.println("OK LOADING...");
					App.yes();
				}else if (answer.equals(no))
				{
					check = 0;
					System.out.println("OK LOADING...");
					dashboard.welcome();
				}else
				{
					System.out.println("INVAILD INPUT");
					check = 1;
				}
			}
		}
	}
	
	public static void yes()
	{
		String database = "jdbc:ucanaccess://C:/Users/melan/eclipse-workspace/Career Pathways/dbCareerPathways.accdb";
		
		try {
			Connection connection = DriverManager.getConnection(database);
			System.out.println("Ok, Great...");
			String auto, barber, culinary, construction, film, health, plant, answer2 ="x", answer3, sign, psign, sprint, pprint;
			
			System.out.println("Students in the following sectors may be matched with an in-person internship. If matched, some employers may require COVID\r\n"
					+ "-19 vaccination or weekly testing, and require student interns to provide proof of COVID-19 vaccination status and weekly\r\n"
					+ "testing. Please confirm by placing an “X” in the relevant lines if you are interested in such in-person internship opportunities\r\n"
					+ "");
			
			System.out.println("INPUT X IF YOU ARE INTERESTED TO GO IN-PERSON:");
			System.out.println("Automotive and transportation:");
			auto = allinput.nextLine();
			auto = auto.toLowerCase();
			if (auto.equals(answer2))
			{
				auto = answer2;
			}else
			{
				System.out.println("INVAILD INPUT");
				check = 1; 
				
				while(check ==1)
				{
					System.out.println("Automotive and transportation:");
					auto = allinput.nextLine();
					auto = auto.toLowerCase();
					if (auto.equals(answer2))
					{
						check = 0;
						auto = answer2;
					}else
					{
						System.out.println("INVAILD INPUT");
						check = 1; 
					}
				}
			}
			
			System.out.println("Barbering and cosmetology:");
			barber = allinput.nextLine();
			barber = barber.toLowerCase();
			if (barber.equals(answer2))
			{
				barber = answer2;
			}else
			{
				System.out.println("INVAILD INPUT");
				check = 1; 
				
				while(check ==1)
				{
					System.out.println("Barbering and cosmetology:");
					barber = allinput.nextLine();
					barber = barber.toLowerCase();
					
					if (barber.equals(answer2))
					{
						check = 0;
						barber = answer2;
					}else
					{
						System.out.println("INVAILD INPUT");
						check = 1; 
					}
				}
			}
			
			System.out.println("Culinary arts:");
			culinary = allinput.nextLine();
			culinary =  culinary.toLowerCase();
			if (culinary.equals(answer2))
			{
				culinary = answer2;
			}else
			{
				System.out.println("INVAILD INPUT");
				check = 1; 
				
				while(check ==1)
				{
					System.out.println("Culinary arts:");
					culinary = allinput.nextLine();
					culinary = culinary.toLowerCase();
					
					if (culinary.equals(answer2))
					{
						check = 0;
						culinary = answer2;
					}else
					{
						System.out.println("INVAILD INPUT");
						check = 1; 
					}
				}
			}
			
			System.out.println("Construction/pre-engineering/architecture:");
			construction = allinput.nextLine();
			construction = construction.toLowerCase();
			if (construction.equals(answer2))
			{
				construction = answer2;
			}else
			{
				System.out.println("INVAILD INPUT");
				check = 1; 
				
				while(check ==1)
				{
					System.out.println("Construction/pre-engineering/architecture:");
					construction = allinput.nextLine();
					construction = construction.toLowerCase();
					
					if (construction.equals(answer2))
					{
						check = 0;
						construction = answer2;
					}else
					{
						System.out.println("INVAILD INPUT");
						check = 1; 
					}
				}
			}
			
			System.out.println("Film and Television:");
			film = allinput.nextLine();
			film = film.toLowerCase();
			if (film.equals(answer2))
			{
				film = answer2;
			}else
			{
				System.out.println("INVAILD INPUT");
				check = 1; 
				
				while(check ==1)
				{
					System.out.println("Film and Television:");
					film = allinput.nextLine();
					film = film.toLowerCase();
					
					if (film.equals(answer2))
					{
						check = 0;
						film = answer2;
					}else
					{
						System.out.println("INVAILD INPUT");
						check = 1; 
					}
				}
			}
			
			System.out.println("Healthcare:");
			health = allinput.nextLine();
			health = health.toLowerCase();
			if (health.equals(answer2))
			{
				health = answer2;
			}else
			{
				System.out.println("INVAILD INPUT");
				check = 1; 
				
				while(check ==1)
				{
					System.out.println("Healthcare:");
					health = allinput.nextLine();
					health = health.toLowerCase();
					
					if (health.equals(answer2))
					{
						check = 0;
						health = answer2;
					}else
					{
						System.out.println("INVAILD INPUT");
						check = 1; 
					}
				}
			}
			
			System.out.println("Plant and animal science:");
			plant = allinput.nextLine();
			plant = plant.toLowerCase();
			if (plant.equals(answer2))
			{
				plant = answer2;
			}else
			{
				System.out.println("INVAILD INPUT");
				check = 1; 
				
				while(check ==1)
				{
					System.out.println("Plant and animal science:");
					plant = allinput.nextLine();
					plant = plant.toLowerCase();
					
					if (plant.equals(answer2))
					{
						check = 0;
						plant = answer2;
					}else
					{
						System.out.println("INVAILD INPUT");
						check = 1; 
					}
				}
			}
			
			System.out.println("Why are you interestead in an internship?");
			answer3 = allinput.nextLine();
			System.out.println("Print Name: ");
			sprint = allinput.nextLine();
			System.out.println("Sign your name:");
			sign = allinput.nextLine();
			System.out.println("Parent/Guardian Print Name: ");
			pprint = allinput.nextLine();
			System.out.println("Parent/Guardian Sign Name:");
			psign = allinput.nextLine();
			
			String sql = "SELECT * FROM Student_Info_Tab WHERE "
					+ "ID = 5 ";
			System.out.println(sql + "application info\n"
					+ auto + "\n"
					+ barber + "\n"
					+ culinary + "\n"
					+ construction + "\n"
					+ film + "\n"
					+ health + "\n"
					+ plant + "\n"
					+ answer3 + "\n"
					+ sign + "\n"
					+ psign + "\n");
			
			System.out.println("________________________________________");
			
			String sql4 = "INSERT INTO Application_tab (auto, bar, culi, constr, film, healthcare, plantsci, question, sign, parentsign) "
					+ "Values (?,?,?,?,?,?,?,?,?,?)";
			
			PreparedStatement statement = connection.prepareStatement(sql4);
			
			statement.setString(1, auto);
			statement.setString(2, barber);
			statement.setString(3, culinary);
			statement.setString(4, construction);
			statement.setString(5, film);
			statement.setString(6, health);
			statement.setString(7, plant);
			statement.setString(8, answer3);
			statement.setString(9, sign);
			statement.setString(10, psign);
			
			int rows = statement.executeUpdate();
			
			if (rows> 0)
			{
				System.out.println("OK, the information has been inserted and submitted!");
				
			}
		
			System.out.println("________________________________________\n");
			
			connection.close();
			dashboard.welcome();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
}
