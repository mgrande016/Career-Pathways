package net.codejava;

import java.util.Scanner;

public class Rate {
	static int check = 0, select;
	static Employment skills = new Employment();
	static Literacy otherskills = new Literacy();
	static Technial thridskills = new Technial();
	static Scanner allinput = new Scanner(System.in);
	
	public void employ()
	{
		System.out.println("Welcome to Employment Profile");
		
		System.out.println("Which course would you like to look at?\n"
			+ "1 - Intro to Software I\n"
			+ "2 - Intro to Software II\n"
			+ "3 - Web Development I\n"
			+ "4 - Web Development II\n"
			+ "5 - Java Applications I");
			
			select = allinput.nextInt();
		
			if (select == 1)
			{
				Rate.intro1();
				
			}else if(select == 2)
			{
				Rate.intro2();
			}else if (select == 3)
			{
				Rate.web1();
			}else if (select == 4)
			{
				Rate.web2();
			}else if (select == 5)
			{
				Rate.java();
			}
			else
			{
				System.out.print("PLEASE ENTER A CORRECT SELECTION!");
				check = 1;
				
				while (check == 1)
				{
					
				}
			}
			
	}
	
		public static void intro1()
		{
		
			System.out.println("Ok, Please rate yourself for INTRO TO SOFTWARE I!");
			
			System.out.println("Ok, which field would you like to rate?\n"
					+ "1 - Employment Skills\n"
					+"2 - Literacy Skills\n"
					+ "3 - Technial Skills");
			select = allinput.nextInt();
			if (select == 1)
			{
				skills.employskills();
				
			}else if(select == 2)
			{
				otherskills.intro1();
			}else if (select == 3)
			{
				thridskills.intro1();
			}else 
			{
				System.out.println("INVAILD INPUT...");
				check = 1; 
				
				while(check == 1)
				{
					System.out.println("Ok, which field would you like to rate?\n"
							+ "1 - Employment Skills\n"
							+"2 - Literacy Skills\n"
							+ "3 - Technial Skills");
					select = allinput.nextInt();
					if (select == 1)
					{
						check = 0;
						skills.employskills();
						
						
					}else if(select == 2)
					{	
						check = 0;
						otherskills.intro1();
						
					}else if (select == 3)
					{
						check = 0;
						thridskills.intro1();
						
					}else 
					{
						System.out.println("INVAILD INPUT...");
						check = 1; 
	
					}
					
				}
			}
			
		}
		
		public static void intro2()
		{
			System.out.println("Ok, Please rate yourself for INTRO TO SOFTWARE II!");
			System.out.println("Ok, which field would you like to rate?\n"
					+ "1 - Employment Skills"
					+"2 - Literacy Skills"
					+ "3 - Technial Skills");
			select = allinput.nextInt();
			if (select == 1)
			{
				skills.intro2employskills();
				
			}else if(select == 2)
			{
				otherskills.intro2();
			}else if (select == 3)
			{
				thridskills.intro2();
			}else
			{
				System.out.println("INVAILD INPUT...");
				check = 1;
				
				while(check == 1)
				{
					System.out.println("Ok, which field would you like to rate?\n"
							+ "1 - Employment Skills\n"
							+"2 - Literacy Skills\n"
							+ "3 - Technial Skills");
					select = allinput.nextInt();
					if (select == 1)
					{
						check = 0;
						skills.intro2employskills();
						
					}else if(select == 2)
					{	
						check = 0;
						otherskills.intro2();
						
					}else if (select == 3)
					{
						check = 0;
						thridskills.intro2();
						
					}else 
					{
						System.out.println("INVAILD INPUT...");
						check = 1; 
	
					}
					
				}
			}
		}
		
		public static void web1()
		{
			System.out.println("Ok, Please rate yourself for WEB DEVELOPMENT I!");
			System.out.println("Ok, which field would you like to rate?\n"
					+ "1 - Employment Skills"
					+"2 - Literacy Skills"
					+ "3 - Technial Skills");
			select = allinput.nextInt();
			if (select == 1)
			{
				skills.web1skills();
				
			}else if(select == 2)
			{
				otherskills.web1();
			}else if (select == 3)
			{
				thridskills.web1();
			}else 
			{
				System.out.println("INVAILD INPUT...");
				check = 1;
				while(check == 1)
				{
					System.out.println("Ok, which field would you like to rate?\n"
							+ "1 - Employment Skills\n"
							+"2 - Literacy Skills\n"
							+ "3 - Technial Skills");
					select = allinput.nextInt();
					if (select == 1)
					{
						check = 0;
						skills.web1skills();
						
					}else if(select == 2)
					{	
						check = 0;
						otherskills.web1();
						
					}else if (select == 3)
					{
						check = 0;
						thridskills.web1();
						
					}else 
					{
						System.out.println("INVAILD INPUT...");
						check = 1; 
	
					}
					
				}
			}
		}
		
		public static void web2()
		{
			System.out.println("Ok, Please rate yourself for WEB DEVELOPMENT II!");
			System.out.println("Ok, which field would you like to rate?\n"
					+ "1 - Employment Skills"
					+"2 - Literacy Skills"
					+ "3 - Technial Skills");
			select = allinput.nextInt();
			if (select == 1)
			{
				skills.web2skills();
				
			}else if(select == 2)
			{
				otherskills.web2();
			}else if (select == 3)
			{
				thridskills.web2();
			}else 
			{
				System.out.println("INVAILD INPUT...");
				check = 1;
				while(check == 1)
				{
					System.out.println("Ok, which field would you like to rate?\n"
							+ "1 - Employment Skills\n"
							+"2 - Literacy Skills\n"
							+ "3 - Technial Skills");
					select = allinput.nextInt();
					if (select == 1)
					{
						check = 0;
						skills.web2skills();
						
					}else if(select == 2)
					{	
						check = 0;
						otherskills.web2();
						
					}else if (select == 3)
					{
						check = 0;
						thridskills.web2();
						
					}else 
					{
						System.out.println("INVAILD INPUT...");
						check = 1; 
	
					}
					
				}
				
			}
		}
		
		public static void java()
		{
			System.out.println("Ok, Please rate yourself for JAVA APPLICATIONS!");
			System.out.println("Ok, which field would you like to rate?\n"
					+ "1 - Employment Skills"
					+"2 - Literacy Skills"
					+ "3 - Technial Skills");
			select = allinput.nextInt();
			if (select == 1)
			{
				skills.javaskills();
				
			}else if(select == 2)
			{
				otherskills.java();
			}else if (select == 3)
			{
				thridskills.java();
			}else
			{
				System.out.println("INVAILD INPUT");
				check = 1;
				while(check == 1)
				{
					System.out.println("Ok, which field would you like to rate?\n"
							+ "1 - Employment Skills\n"
							+"2 - Literacy Skills\n"
							+ "3 - Technial Skills");
					select = allinput.nextInt();
					if (select == 1)
					{
						check = 0;
						skills.javaskills();
						
					}else if(select == 2)
					{	
						check = 0;
						otherskills.java();
						
					}else if (select == 3)
					{
						check = 0;
						thridskills.java();
						
					}else 
					{
						System.out.println("INVAILD INPUT...");
						check = 1; 
					}
					
				}
			}
		}
}
