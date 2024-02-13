package net.codejava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Technial {

	static Scanner allinput = new Scanner(System.in);
	static Dash dashboard = new Dash();
	static String database11 = "jdbc:ucanaccess://C:/Users/melan/eclipse-workspace/Career Pathways/dbCareerPathways.accdb";
	static int answer, answer2, answer3, answer4, answer5, answer6, answer7, answer8, answer9, answer10, answer11, error = 0;
	
	public static void intro1() 
	{
		try {
			Connection connect = DriverManager.getConnection(database11);
			
			System.out.println("Ok, Great!");
			
			System.out.println("ST 1 - 1. Apply the skills and abilities in "
					+ "requirements analysis and configuration control while working plans processes and projects as assigned.");
			answer = allinput.nextInt();
			if (answer > 4 || answer < 0)
			{
				System.out.println("INCORRECT INPUT! TRY AGAIN");
				error = 1;
				while(error == 1)
				{

					System.out.println("ST 1 - 1. Apply the skills and abilities in "
							+ "requirements analysis and configuration control while working plans processes and projects as assigned.");
					answer = allinput.nextInt();
					
					if (answer > 4 || answer < 0)
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
			System.out.println("ST 1 - 2. Use the skills required in project management "
					+ "to track and assess the progress of a plan process or project as assigned.");
			answer2 = allinput.nextInt();
			if (answer2 > 4 || answer2 < 0)
			{
				System.out.println("INCORRECT INPUT! TRY AGAIN");
				error = 1;
				while(error == 1)
				{

					System.out.println("ST 1 - 2. Use the skills required in project management "
							+ "to track and assess the progress of a plan process or project as assigned.");
					answer2 = allinput.nextInt();
					
					if (answer2 > 4 || answer2 < 0)
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
			System.out.println("ST 2 - 3. Apply a currently applicable computer programming "
					+ "language to a process project plan or issue as assigned.");
			answer3 = allinput.nextInt();
			if (answer3 > 4 || answer3 < 0)
			{
				System.out.println("INCORRECT INPUT! TRY AGAIN");
				error = 1;
				while(error == 1)
				{

					System.out.println("ST 2 - 3. Apply a currently applicable computer programming "
							+ "language to a process project plan or issue as assigned.");
					answer3 = allinput.nextInt();
					
					if (answer3 > 4 || answer3 < 0)
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
			System.out.println("ST 2 - 5. Apply a technological scientific or mathematical concept "
					+ "(use of algorithms) when communicating with others on issues plans processes problems or concepts.");
			answer4 = allinput.nextInt();
			if (answer4 > 4 || answer4 < 0)
			{
				System.out.println("INCORRECT INPUT! TRY AGAIN");
				error = 1;
				while(error == 1)
				{

					System.out.println("ST 2 - 5. Apply a technological scientific or mathematical "
							+ "concept (use of algorithms) when communicating with others on issues plans processes problems or concepts.");
					answer4 = allinput.nextInt();
					
					if (answer4 > 4 || answer4 < 0)
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
			System.out.println("ST 5 - 3. Develop a career plan for advancement in science "
					+ "technology engineering and mathematics careers.");
			answer5 = allinput.nextInt();
			if (answer5 > 4 || answer5 < 0)
			{
				System.out.println("INCORRECT INPUT! TRY AGAIN");
				error = 1;
				while(error == 1)
				{

					System.out.println("ST 5 - 3. Develop a career plan for advancement "
							+ "in science technology engineering and mathematics careers.");
					answer5 = allinput.nextInt();
					
					if (answer5 > 4 || answer5 < 0)
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
			System.out.println("ST-ET 1 - 2. Develop the active use of information technology applications.");
			answer6 = allinput.nextInt();
			if (answer6 > 4 || answer6 < 0)
			{
				System.out.println("INCORRECT INPUT! TRY AGAIN");
				error = 1;
				while(error == 1)
				{

					System.out.println("ST-ET 1 - 2. Develop the active use of information technology applications.");
					answer6 = allinput.nextInt();
					
					if (answer6 > 4 || answer6 < 0)
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
			System.out.println("ST-ET 3 - 1. Use knowledge techniques skills and modern tools necessary for engineering practice.");
			answer7 = allinput.nextInt();
			if (answer7 > 4 || answer7 < 0)
			{
				System.out.println("INCORRECT INPUT! TRY AGAIN");
				error = 1;
				while(error == 1)
				{

					System.out.println("ST-ET 3 - 1. Use knowledge techniques skills and modern tools necessary for engineering practice.");
					answer7 = allinput.nextInt();
					
					if (answer7 > 4 || answer7 < 0)
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
			System.out.println("ST-ET 5 - 2. Demonstrate the ability to evaluate a design or product and improve "
					+ "the design using testing modeling and research.");
			answer8 = allinput.nextInt();
			if (answer8 > 4 || answer8 < 0)
			{
				System.out.println("INCORRECT INPUT! TRY AGAIN");
				error = 1;
				while(error == 1)
				{

					System.out.println("ST-ET 5 - 2. Demonstrate the ability to evaluate a design or product and improve "
							+ "the design using testing modeling and research.");
					answer8 = allinput.nextInt();
					
					if (answer8 > 4 || answer8 < 0)
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
			System.out.println("ST-SM 1 - 1. Apply science and mathematics concepts and principles to "
					+ "resolve plans projects processes issues or problems through methods of inquiry.");
			answer9 = allinput.nextInt();
			if (answer9 > 4 || answer9 < 0)
			{
				System.out.println("INCORRECT INPUT! TRY AGAIN");
				error = 1;
				while(error == 1)
				{

					System.out.println("ST-SM 1 - 1. Apply science and mathematics concepts and principles to r"
							+ "esolve plans projects processes issues or problems through methods of inquiry.");
					answer9 = allinput.nextInt();
					
					if (answer9 > 4 || answer9 < 0)
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
			System.out.println("ST-SM 2 - 6. Apply the Scientific Method to projects as assigned.");
			answer10 = allinput.nextInt();
			if (answer10 > 4 || answer10 < 0)
			{
				System.out.println("INCORRECT INPUT! TRY AGAIN");
				error = 1;
				while(error == 1)
				{

					System.out.println("ST-SM 2 - 6. Apply the Scientific Method to projects as assigned.");
					answer10 = allinput.nextInt();
					
					if (answer10 > 4 || answer10 < 0)
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
			System.out.println("ST-SM 4 - 1. Demonstrate and use effective critical thinking "
					+ "and reasoning skills by making and testing conjectures drawing logical conclusions and justifying thinking.");
			answer11 = allinput.nextInt();
			if (answer11 > 4 || answer11 < 0)
			{
				System.out.println("INCORRECT INPUT! TRY AGAIN");
				error = 1;
				while(error == 1)
				{

					System.out.println("ST-SM 4 - 1. Demonstrate and use effective critical thinking and "
							+ "reasoning skills by making and testing conjectures drawing logical conclusions and justifying thinking.");
					answer11 = allinput.nextInt();
					
					if (answer11 > 4 || answer11 < 0)
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
			
String sql = "INSERT INTO intro1_employment (Respond, Respond2, Respond3, Respond4, Respond5, Respond6, Respond7, Respond8, Respond9, Respond10,Respond11) "
		+ "Values (?,?,?,?,?,?,?,?,?,?,?)";
			
			PreparedStatement statement = connect.prepareStatement(sql);
			
			statement.setInt(1, answer);
			statement.setInt(2, answer2);
			statement.setInt(3, answer3);
			statement.setInt(4, answer4);
			statement.setInt(5, answer5);
			statement.setInt(6, answer6);
			statement.setInt(7, answer7);
			statement.setInt(4, answer8);
			statement.setInt(5, answer9);
			statement.setInt(6, answer10);
			statement.setInt(7, answer11);
			
			
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
	
	public static void intro2()
	{
		try {
			Connection connect = DriverManager.getConnection(database11);
System.out.println("Ok, Great!");
			
			System.out.println("ST 1 - 1. Apply the skills and abilities in "
					+ "requirements analysis and configuration control while working plans processes and projects as assigned.");
			answer = allinput.nextInt();
			if (answer > 4 || answer < 0)
			{
				System.out.println("INCORRECT INPUT! TRY AGAIN");
				error = 1;
				while(error == 1)
				{

					System.out.println("ST 1 - 1. Apply the skills and abilities in "
							+ "requirements analysis and configuration control while working plans processes and projects as assigned.");
					answer = allinput.nextInt();
					
					if (answer > 4 || answer < 0)
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
			System.out.println("ST 1 - 2. Use the skills required in project management "
					+ "to track and assess the progress of a plan process or project as assigned.");
			answer2 = allinput.nextInt();
			if (answer2 > 4 || answer2 < 0)
			{
				System.out.println("INCORRECT INPUT! TRY AGAIN");
				error = 1;
				while(error == 1)
				{

					System.out.println("ST 1 - 2. Use the skills required in project management "
							+ "to track and assess the progress of a plan process or project as assigned.");
					answer2 = allinput.nextInt();
					
					if (answer2 > 4 || answer2 < 0)
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
			System.out.println("ST 2 - 3. Apply a currently applicable computer programming "
					+ "language to a process project plan or issue as assigned.");
			answer3 = allinput.nextInt();
			if (answer3 > 4 || answer3 < 0)
			{
				System.out.println("INCORRECT INPUT! TRY AGAIN");
				error = 1;
				while(error == 1)
				{

					System.out.println("ST 2 - 3. Apply a currently applicable computer programming "
							+ "language to a process project plan or issue as assigned.");
					answer3 = allinput.nextInt();
					
					if (answer3 > 4 || answer3 < 0)
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
			System.out.println("ST 2 - 5. Apply a technological scientific or mathematical concept "
					+ "(use of algorithms) when communicating with others on issues plans processes problems or concepts.");
			answer4 = allinput.nextInt();
			if (answer4 > 4 || answer4 < 0)
			{
				System.out.println("INCORRECT INPUT! TRY AGAIN");
				error = 1;
				while(error == 1)
				{

					System.out.println("ST 2 - 5. Apply a technological scientific or mathematical "
							+ "concept (use of algorithms) when communicating with others on issues plans processes problems or concepts.");
					answer4 = allinput.nextInt();
					
					if (answer4 > 4 || answer4 < 0)
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
			System.out.println("ST 5 - 3. Develop a career plan for advancement in science "
					+ "technology engineering and mathematics careers.");
			answer5 = allinput.nextInt();
			if (answer5 > 4 || answer5 < 0)
			{
				System.out.println("INCORRECT INPUT! TRY AGAIN");
				error = 1;
				while(error == 1)
				{

					System.out.println("ST 5 - 3. Develop a career plan for advancement "
							+ "in science technology engineering and mathematics careers.");
					answer5 = allinput.nextInt();
					
					if (answer5 > 4 || answer5 < 0)
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
			System.out.println("ST-ET 1 - 2. Develop the active use of information technology applications.");
			answer6 = allinput.nextInt();
			if (answer6 > 4 || answer6 < 0)
			{
				System.out.println("INCORRECT INPUT! TRY AGAIN");
				error = 1;
				while(error == 1)
				{

					System.out.println("ST-ET 1 - 2. Develop the active use of information technology applications.");
					answer6 = allinput.nextInt();
					
					if (answer6 > 4 || answer6 < 0)
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
			System.out.println("ST-ET 3 - 1. Use knowledge techniques skills and modern tools necessary for engineering practice.");
			answer7 = allinput.nextInt();
			if (answer7 > 4 || answer7 < 0)
			{
				System.out.println("INCORRECT INPUT! TRY AGAIN");
				error = 1;
				while(error == 1)
				{

					System.out.println("ST-ET 3 - 1. Use knowledge techniques skills and modern tools necessary for engineering practice.");
					answer7 = allinput.nextInt();
					
					if (answer7 > 4 || answer7 < 0)
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
			System.out.println("ST-ET 5 - 2. Demonstrate the ability to evaluate a design or product and improve "
					+ "the design using testing modeling and research.");
			answer8 = allinput.nextInt();
			if (answer8 > 4 || answer8 < 0)
			{
				System.out.println("INCORRECT INPUT! TRY AGAIN");
				error = 1;
				while(error == 1)
				{

					System.out.println("ST-ET 5 - 2. Demonstrate the ability to evaluate a design or product and improve "
							+ "the design using testing modeling and research.");
					answer8 = allinput.nextInt();
					
					if (answer8 > 4 || answer8 < 0)
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
			System.out.println("ST-SM 1 - 1. Apply science and mathematics concepts and principles to "
					+ "resolve plans projects processes issues or problems through methods of inquiry.");
			answer9 = allinput.nextInt();
			if (answer9 > 4 || answer9 < 0)
			{
				System.out.println("INCORRECT INPUT! TRY AGAIN");
				error = 1;
				while(error == 1)
				{

					System.out.println("ST-SM 1 - 1. Apply science and mathematics concepts and principles to r"
							+ "esolve plans projects processes issues or problems through methods of inquiry.");
					answer9 = allinput.nextInt();
					
					if (answer9 > 4 || answer9 < 0)
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
			System.out.println("ST-SM 2 - 6. Apply the Scientific Method to projects as assigned.");
			answer10 = allinput.nextInt();
			if (answer10 > 4 || answer10 < 0)
			{
				System.out.println("INCORRECT INPUT! TRY AGAIN");
				error = 1;
				while(error == 1)
				{

					System.out.println("ST-SM 2 - 6. Apply the Scientific Method to projects as assigned.");
					answer10 = allinput.nextInt();
					
					if (answer10 > 4 || answer10 < 0)
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
			System.out.println("ST-SM 4 - 1. Demonstrate and use effective critical thinking "
					+ "and reasoning skills by making and testing conjectures drawing logical conclusions and justifying thinking.");
			answer11 = allinput.nextInt();
			if (answer11 > 4 || answer11 < 0)
			{
				System.out.println("INCORRECT INPUT! TRY AGAIN");
				error = 1;
				while(error == 1)
				{

					System.out.println("ST-SM 4 - 1. Demonstrate and use effective critical thinking and "
							+ "reasoning skills by making and testing conjectures drawing logical conclusions and justifying thinking.");
					answer11 = allinput.nextInt();
					
					if (answer11 > 4 || answer11 < 0)
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
			
			String sql = "INSERT INTO intro2_technial (Respond, Respond2, Respond3, Respond4, Respond5, Respond6, Respond7, Respond8, Respond9, Respond10,Respond11) "
		+ "Values (?,?,?,?,?,?,?,?,?,?,?)";
			
			PreparedStatement statement = connect.prepareStatement(sql);
			
			statement.setInt(1, answer);
			statement.setInt(2, answer2);
			statement.setInt(3, answer3);
			statement.setInt(4, answer4);
			statement.setInt(5, answer5);
			statement.setInt(6, answer6);
			statement.setInt(7, answer7);
			statement.setInt(4, answer8);
			statement.setInt(5, answer9);
			statement.setInt(6, answer10);
			statement.setInt(7, answer11);
			
			
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
			Connection connection = DriverManager.getConnection(database11);
System.out.println("Ok, Great!");
			
			System.out.println("ST 1 - 1. Apply the skills and abilities in "
					+ "requirements analysis and configuration control while working plans processes and projects as assigned.");
			answer = allinput.nextInt();
			if (answer > 4 || answer < 0)
			{
				System.out.println("INCORRECT INPUT! TRY AGAIN");
				error = 1;
				while(error == 1)
				{

					System.out.println("ST 1 - 1. Apply the skills and abilities in "
							+ "requirements analysis and configuration control while working plans processes and projects as assigned.");
					answer = allinput.nextInt();
					
					if (answer > 4 || answer < 0)
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
			System.out.println("ST 1 - 2. Use the skills required in project management "
					+ "to track and assess the progress of a plan process or project as assigned.");
			answer2 = allinput.nextInt();
			if (answer2 > 4 || answer2 < 0)
			{
				System.out.println("INCORRECT INPUT! TRY AGAIN");
				error = 1;
				while(error == 1)
				{

					System.out.println("ST 1 - 2. Use the skills required in project management "
							+ "to track and assess the progress of a plan process or project as assigned.");
					answer2 = allinput.nextInt();
					
					if (answer2 > 4 || answer2 < 0)
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
			System.out.println("ST 2 - 3. Apply a currently applicable computer programming "
					+ "language to a process project plan or issue as assigned.");
			answer3 = allinput.nextInt();
			if (answer3 > 4 || answer3 < 0)
			{
				System.out.println("INCORRECT INPUT! TRY AGAIN");
				error = 1;
				while(error == 1)
				{

					System.out.println("ST 2 - 3. Apply a currently applicable computer programming "
							+ "language to a process project plan or issue as assigned.");
					answer3 = allinput.nextInt();
					
					if (answer3 > 4 || answer3 < 0)
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
			System.out.println("ST 2 - 5. Apply a technological scientific or mathematical concept "
					+ "(use of algorithms) when communicating with others on issues plans processes problems or concepts.");
			answer4 = allinput.nextInt();
			if (answer4 > 4 || answer4 < 0)
			{
				System.out.println("INCORRECT INPUT! TRY AGAIN");
				error = 1;
				while(error == 1)
				{

					System.out.println("ST 2 - 5. Apply a technological scientific or mathematical "
							+ "concept (use of algorithms) when communicating with others on issues plans processes problems or concepts.");
					answer4 = allinput.nextInt();
					
					if (answer4 > 4 || answer4 < 0)
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
			System.out.println("ST 5 - 3. Develop a career plan for advancement in science "
					+ "technology engineering and mathematics careers.");
			answer5 = allinput.nextInt();
			if (answer5 > 4 || answer5 < 0)
			{
				System.out.println("INCORRECT INPUT! TRY AGAIN");
				error = 1;
				while(error == 1)
				{

					System.out.println("ST 5 - 3. Develop a career plan for advancement "
							+ "in science technology engineering and mathematics careers.");
					answer5 = allinput.nextInt();
					
					if (answer5 > 4 || answer5 < 0)
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
			System.out.println("ST-ET 1 - 2. Develop the active use of information technology applications.");
			answer6 = allinput.nextInt();
			if (answer6 > 4 || answer6 < 0)
			{
				System.out.println("INCORRECT INPUT! TRY AGAIN");
				error = 1;
				while(error == 1)
				{

					System.out.println("ST-ET 1 - 2. Develop the active use of information technology applications.");
					answer6 = allinput.nextInt();
					
					if (answer6 > 4 || answer6 < 0)
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
			System.out.println("ST-ET 3 - 1. Use knowledge techniques skills and modern tools necessary for engineering practice.");
			answer7 = allinput.nextInt();
			if (answer7 > 4 || answer7 < 0)
			{
				System.out.println("INCORRECT INPUT! TRY AGAIN");
				error = 1;
				while(error == 1)
				{

					System.out.println("ST-ET 3 - 1. Use knowledge techniques skills and modern tools necessary for engineering practice.");
					answer7 = allinput.nextInt();
					
					if (answer7 > 4 || answer7 < 0)
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
			System.out.println("ST-ET 5 - 2. Demonstrate the ability to evaluate a design or product and improve "
					+ "the design using testing modeling and research.");
			answer8 = allinput.nextInt();
			if (answer8 > 4 || answer8 < 0)
			{
				System.out.println("INCORRECT INPUT! TRY AGAIN");
				error = 1;
				while(error == 1)
				{

					System.out.println("ST-ET 5 - 2. Demonstrate the ability to evaluate a design or product and improve "
							+ "the design using testing modeling and research.");
					answer8 = allinput.nextInt();
					
					if (answer8 > 4 || answer8 < 0)
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
			System.out.println("ST-SM 1 - 1. Apply science and mathematics concepts and principles to "
					+ "resolve plans projects processes issues or problems through methods of inquiry.");
			answer9 = allinput.nextInt();
			if (answer9 > 4 || answer9 < 0)
			{
				System.out.println("INCORRECT INPUT! TRY AGAIN");
				error = 1;
				while(error == 1)
				{

					System.out.println("ST-SM 1 - 1. Apply science and mathematics concepts and principles to r"
							+ "esolve plans projects processes issues or problems through methods of inquiry.");
					answer9 = allinput.nextInt();
					
					if (answer9 > 4 || answer9 < 0)
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
			System.out.println("ST-SM 2 - 6. Apply the Scientific Method to projects as assigned.");
			answer10 = allinput.nextInt();
			if (answer10 > 4 || answer10 < 0)
			{
				System.out.println("INCORRECT INPUT! TRY AGAIN");
				error = 1;
				while(error == 1)
				{

					System.out.println("ST-SM 2 - 6. Apply the Scientific Method to projects as assigned.");
					answer10 = allinput.nextInt();
					
					if (answer10 > 4 || answer10 < 0)
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
			System.out.println("ST-SM 4 - 1. Demonstrate and use effective critical thinking "
					+ "and reasoning skills by making and testing conjectures drawing logical conclusions and justifying thinking.");
			answer11 = allinput.nextInt();
			if (answer11 > 4 || answer11 < 0)
			{
				System.out.println("INCORRECT INPUT! TRY AGAIN");
				error = 1;
				while(error == 1)
				{

					System.out.println("ST-SM 4 - 1. Demonstrate and use effective critical thinking and "
							+ "reasoning skills by making and testing conjectures drawing logical conclusions and justifying thinking.");
					answer11 = allinput.nextInt();
					
					if (answer11 > 4 || answer11 < 0)
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
			
String sql = "INSERT INTO web1_technial (Respond, Respond2, Respond3, Respond4, Respond5, Respond6, Respond7, Respond8, Respond9, Respond10,Respond11) "
		+ "Values (?,?,?,?,?,?,?,?,?,?,?)";
			
			PreparedStatement statement = connection.prepareStatement(sql);
			
			statement.setInt(1, answer);
			statement.setInt(2, answer2);
			statement.setInt(3, answer3);
			statement.setInt(4, answer4);
			statement.setInt(5, answer5);
			statement.setInt(6, answer6);
			statement.setInt(7, answer7);
			statement.setInt(4, answer8);
			statement.setInt(5, answer9);
			statement.setInt(6, answer10);
			statement.setInt(7, answer11);
			
			
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
			Connection connection = DriverManager.getConnection(database11);
System.out.println("Ok, Great!");
			
			System.out.println("ST 1 - 1. Apply the skills and abilities in "
					+ "requirements analysis and configuration control while working plans processes and projects as assigned.");
			answer = allinput.nextInt();
			if (answer > 4 || answer < 0)
			{
				System.out.println("INCORRECT INPUT! TRY AGAIN");
				error = 1;
				while(error == 1)
				{

					System.out.println("ST 1 - 1. Apply the skills and abilities in "
							+ "requirements analysis and configuration control while working plans processes and projects as assigned.");
					answer = allinput.nextInt();
					
					if (answer > 4 || answer < 0)
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
			System.out.println("ST 1 - 2. Use the skills required in project management "
					+ "to track and assess the progress of a plan process or project as assigned.");
			answer2 = allinput.nextInt();
			if (answer2 > 4 || answer2 < 0)
			{
				System.out.println("INCORRECT INPUT! TRY AGAIN");
				error = 1;
				while(error == 1)
				{

					System.out.println("ST 1 - 2. Use the skills required in project management "
							+ "to track and assess the progress of a plan process or project as assigned.");
					answer2 = allinput.nextInt();
					
					if (answer2 > 4 || answer2 < 0)
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
			System.out.println("ST 2 - 3. Apply a currently applicable computer programming "
					+ "language to a process project plan or issue as assigned.");
			answer3 = allinput.nextInt();
			if (answer3 > 4 || answer3 < 0)
			{
				System.out.println("INCORRECT INPUT! TRY AGAIN");
				error = 1;
				while(error == 1)
				{

					System.out.println("ST 2 - 3. Apply a currently applicable computer programming "
							+ "language to a process project plan or issue as assigned.");
					answer3 = allinput.nextInt();
					
					if (answer3 > 4 || answer3 < 0)
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
			System.out.println("ST 2 - 5. Apply a technological scientific or mathematical concept "
					+ "(use of algorithms) when communicating with others on issues plans processes problems or concepts.");
			answer4 = allinput.nextInt();
			if (answer4 > 4 || answer4 < 0)
			{
				System.out.println("INCORRECT INPUT! TRY AGAIN");
				error = 1;
				while(error == 1)
				{

					System.out.println("ST 2 - 5. Apply a technological scientific or mathematical "
							+ "concept (use of algorithms) when communicating with others on issues plans processes problems or concepts.");
					answer4 = allinput.nextInt();
					
					if (answer4 > 4 || answer4 < 0)
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
			System.out.println("ST 5 - 3. Develop a career plan for advancement in science "
					+ "technology engineering and mathematics careers.");
			answer5 = allinput.nextInt();
			if (answer5 > 4 || answer5 < 0)
			{
				System.out.println("INCORRECT INPUT! TRY AGAIN");
				error = 1;
				while(error == 1)
				{

					System.out.println("ST 5 - 3. Develop a career plan for advancement "
							+ "in science technology engineering and mathematics careers.");
					answer5 = allinput.nextInt();
					
					if (answer5 > 4 || answer5 < 0)
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
			System.out.println("ST-ET 1 - 2. Develop the active use of information technology applications.");
			answer6 = allinput.nextInt();
			if (answer6 > 4 || answer6 < 0)
			{
				System.out.println("INCORRECT INPUT! TRY AGAIN");
				error = 1;
				while(error == 1)
				{

					System.out.println("ST-ET 1 - 2. Develop the active use of information technology applications.");
					answer6 = allinput.nextInt();
					
					if (answer6 > 4 || answer6 < 0)
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
			System.out.println("ST-ET 3 - 1. Use knowledge techniques skills and modern tools necessary for engineering practice.");
			answer7 = allinput.nextInt();
			if (answer7 > 4 || answer7 < 0)
			{
				System.out.println("INCORRECT INPUT! TRY AGAIN");
				error = 1;
				while(error == 1)
				{

					System.out.println("ST-ET 3 - 1. Use knowledge techniques skills and modern tools necessary for engineering practice.");
					answer7 = allinput.nextInt();
					
					if (answer7 > 4 || answer7 < 0)
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
			System.out.println("ST-ET 5 - 2. Demonstrate the ability to evaluate a design or product and improve "
					+ "the design using testing modeling and research.");
			answer8 = allinput.nextInt();
			if (answer8 > 4 || answer8 < 0)
			{
				System.out.println("INCORRECT INPUT! TRY AGAIN");
				error = 1;
				while(error == 1)
				{

					System.out.println("ST-ET 5 - 2. Demonstrate the ability to evaluate a design or product and improve "
							+ "the design using testing modeling and research.");
					answer8 = allinput.nextInt();
					
					if (answer8 > 4 || answer8 < 0)
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
			System.out.println("ST-SM 1 - 1. Apply science and mathematics concepts and principles to "
					+ "resolve plans projects processes issues or problems through methods of inquiry.");
			answer9 = allinput.nextInt();
			if (answer9 > 4 || answer9 < 0)
			{
				System.out.println("INCORRECT INPUT! TRY AGAIN");
				error = 1;
				while(error == 1)
				{

					System.out.println("ST-SM 1 - 1. Apply science and mathematics concepts and principles to r"
							+ "esolve plans projects processes issues or problems through methods of inquiry.");
					answer9 = allinput.nextInt();
					
					if (answer9 > 4 || answer9 < 0)
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
			System.out.println("ST-SM 2 - 6. Apply the Scientific Method to projects as assigned.");
			answer10 = allinput.nextInt();
			if (answer10 > 4 || answer10 < 0)
			{
				System.out.println("INCORRECT INPUT! TRY AGAIN");
				error = 1;
				while(error == 1)
				{

					System.out.println("ST-SM 2 - 6. Apply the Scientific Method to projects as assigned.");
					answer10 = allinput.nextInt();
					
					if (answer10 > 4 || answer10 < 0)
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
			System.out.println("ST-SM 4 - 1. Demonstrate and use effective critical thinking "
					+ "and reasoning skills by making and testing conjectures drawing logical conclusions and justifying thinking.");
			answer11 = allinput.nextInt();
			if (answer11 > 4 || answer11 < 0)
			{
				System.out.println("INCORRECT INPUT! TRY AGAIN");
				error = 1;
				while(error == 1)
				{

					System.out.println("ST-SM 4 - 1. Demonstrate and use effective critical thinking and "
							+ "reasoning skills by making and testing conjectures drawing logical conclusions and justifying thinking.");
					answer11 = allinput.nextInt();
					
					if (answer11 > 4 || answer11 < 0)
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
			
String sql = "INSERT INTO web2_technial (Respond, Respond2, Respond3, Respond4, Respond5, Respond6, Respond7, Respond8, Respond9, Respond10,Respond11) "
		+ "Values (?,?,?,?,?,?,?,?,?,?,?)";
			
			PreparedStatement statement = connection.prepareStatement(sql);
			
			statement.setInt(1, answer);
			statement.setInt(2, answer2);
			statement.setInt(3, answer3);
			statement.setInt(4, answer4);
			statement.setInt(5, answer5);
			statement.setInt(6, answer6);
			statement.setInt(7, answer7);
			statement.setInt(4, answer8);
			statement.setInt(5, answer9);
			statement.setInt(6, answer10);
			statement.setInt(7, answer11);
			
			
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
			Connection connect = DriverManager.getConnection(database11);
System.out.println("Ok, Great!");
			
			System.out.println("ST 1 - 1. Apply the skills and abilities in "
					+ "requirements analysis and configuration control while working plans processes and projects as assigned.");
			answer = allinput.nextInt();
			if (answer > 4 || answer < 0)
			{
				System.out.println("INCORRECT INPUT! TRY AGAIN");
				error = 1;
				while(error == 1)
				{

					System.out.println("ST 1 - 1. Apply the skills and abilities in "
							+ "requirements analysis and configuration control while working plans processes and projects as assigned.");
					answer = allinput.nextInt();
					
					if (answer > 4 || answer < 0)
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
			System.out.println("ST 1 - 2. Use the skills required in project management "
					+ "to track and assess the progress of a plan process or project as assigned.");
			answer2 = allinput.nextInt();
			if (answer2 > 4 || answer2 < 0)
			{
				System.out.println("INCORRECT INPUT! TRY AGAIN");
				error = 1;
				while(error == 1)
				{

					System.out.println("ST 1 - 2. Use the skills required in project management "
							+ "to track and assess the progress of a plan process or project as assigned.");
					answer2 = allinput.nextInt();
					
					if (answer2 > 4 || answer2 < 0)
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
			System.out.println("ST 2 - 3. Apply a currently applicable computer programming "
					+ "language to a process project plan or issue as assigned.");
			answer3 = allinput.nextInt();
			if (answer3 > 4 || answer3 < 0)
			{
				System.out.println("INCORRECT INPUT! TRY AGAIN");
				error = 1;
				while(error == 1)
				{

					System.out.println("ST 2 - 3. Apply a currently applicable computer programming "
							+ "language to a process project plan or issue as assigned.");
					answer3 = allinput.nextInt();
					
					if (answer3 > 4 || answer3 < 0)
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
			System.out.println("ST 2 - 5. Apply a technological scientific or mathematical concept "
					+ "(use of algorithms) when communicating with others on issues plans processes problems or concepts.");
			answer4 = allinput.nextInt();
			if (answer4 > 4 || answer4 < 0)
			{
				System.out.println("INCORRECT INPUT! TRY AGAIN");
				error = 1;
				while(error == 1)
				{

					System.out.println("ST 2 - 5. Apply a technological scientific or mathematical "
							+ "concept (use of algorithms) when communicating with others on issues plans processes problems or concepts.");
					answer4 = allinput.nextInt();
					
					if (answer4 > 4 || answer4 < 0)
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
			System.out.println("ST 5 - 3. Develop a career plan for advancement in science "
					+ "technology engineering and mathematics careers.");
			answer5 = allinput.nextInt();
			if (answer5 > 4 || answer5 < 0)
			{
				System.out.println("INCORRECT INPUT! TRY AGAIN");
				error = 1;
				while(error == 1)
				{

					System.out.println("ST 5 - 3. Develop a career plan for advancement "
							+ "in science technology engineering and mathematics careers.");
					answer5 = allinput.nextInt();
					
					if (answer5 > 4 || answer5 < 0)
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
			System.out.println("ST-ET 1 - 2. Develop the active use of information technology applications.");
			answer6 = allinput.nextInt();
			if (answer6 > 4 || answer6 < 0)
			{
				System.out.println("INCORRECT INPUT! TRY AGAIN");
				error = 1;
				while(error == 1)
				{

					System.out.println("ST-ET 1 - 2. Develop the active use of information technology applications.");
					answer6 = allinput.nextInt();
					
					if (answer6 > 4 || answer6 < 0)
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
			System.out.println("ST-ET 3 - 1. Use knowledge techniques skills and modern tools necessary for engineering practice.");
			answer7 = allinput.nextInt();
			if (answer7 > 4 || answer7 < 0)
			{
				System.out.println("INCORRECT INPUT! TRY AGAIN");
				error = 1;
				while(error == 1)
				{

					System.out.println("ST-ET 3 - 1. Use knowledge techniques skills and modern tools necessary for engineering practice.");
					answer7 = allinput.nextInt();
					
					if (answer7 > 4 || answer7 < 0)
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
			System.out.println("ST-ET 5 - 2. Demonstrate the ability to evaluate a design or product and improve "
					+ "the design using testing modeling and research.");
			answer8 = allinput.nextInt();
			if (answer8 > 4 || answer8 < 0)
			{
				System.out.println("INCORRECT INPUT! TRY AGAIN");
				error = 1;
				while(error == 1)
				{

					System.out.println("ST-ET 5 - 2. Demonstrate the ability to evaluate a design or product and improve "
							+ "the design using testing modeling and research.");
					answer8 = allinput.nextInt();
					
					if (answer8 > 4 || answer8 < 0)
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
			System.out.println("ST-SM 1 - 1. Apply science and mathematics concepts and principles to "
					+ "resolve plans projects processes issues or problems through methods of inquiry.");
			answer9 = allinput.nextInt();
			if (answer9 > 4 || answer9 < 0)
			{
				System.out.println("INCORRECT INPUT! TRY AGAIN");
				error = 1;
				while(error == 1)
				{

					System.out.println("ST-SM 1 - 1. Apply science and mathematics concepts and principles to r"
							+ "esolve plans projects processes issues or problems through methods of inquiry.");
					answer9 = allinput.nextInt();
					
					if (answer9 > 4 || answer9 < 0)
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
			System.out.println("ST-SM 2 - 6. Apply the Scientific Method to projects as assigned.");
			answer10 = allinput.nextInt();
			if (answer10 > 4 || answer10 < 0)
			{
				System.out.println("INCORRECT INPUT! TRY AGAIN");
				error = 1;
				while(error == 1)
				{

					System.out.println("ST-SM 2 - 6. Apply the Scientific Method to projects as assigned.");
					answer10 = allinput.nextInt();
					
					if (answer10 > 4 || answer10 < 0)
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
			System.out.println("ST-SM 4 - 1. Demonstrate and use effective critical thinking "
					+ "and reasoning skills by making and testing conjectures drawing logical conclusions and justifying thinking.");
			answer11 = allinput.nextInt();
			if (answer11 > 4 || answer11 < 0)
			{
				System.out.println("INCORRECT INPUT! TRY AGAIN");
				error = 1;
				while(error == 1)
				{

					System.out.println("ST-SM 4 - 1. Demonstrate and use effective critical thinking and "
							+ "reasoning skills by making and testing conjectures drawing logical conclusions and justifying thinking.");
					answer11 = allinput.nextInt();
					
					if (answer11 > 4 || answer11 < 0)
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
			
String sql = "INSERT INTO java_technial (Respond, Respond2, Respond3, Respond4, Respond5, Respond6, Respond7, Respond8, Respond9, Respond10,Respond11) "
		+ "Values (?,?,?,?,?,?,?,?,?,?,?)";
			
			PreparedStatement statement = connect.prepareStatement(sql);
			
			statement.setInt(1, answer);
			statement.setInt(2, answer2);
			statement.setInt(3, answer3);
			statement.setInt(4, answer4);
			statement.setInt(5, answer5);
			statement.setInt(6, answer6);
			statement.setInt(7, answer7);
			statement.setInt(4, answer8);
			statement.setInt(5, answer9);
			statement.setInt(6, answer10);
			statement.setInt(7, answer11);
			
			
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
