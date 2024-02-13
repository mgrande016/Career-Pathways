package net.codejava;

import java.util.Scanner;

public class Dash {

		static Scanner allinput = new Scanner(System.in);
		static Mess message = new Mess();
		static StudentInfo newmess = new StudentInfo();
		static Rate rateyourself = new Rate();
		static App applications = new App();
		static Adddoc documents = new Adddoc();
		static int answer, check = 0;
		public static void main(String [] args)
		{
			System.out.println("WELCOME TO NYC CAREER PATHWAYS!");
			System.out.println("_______________________________\n");
			
			Dash.welcome(); 
		}
		
		public static void welcome()
		{
			System.out.println("1- Tasks/Messages\n"
					+ "2 - Information\n"
					+ "3 - Employment Profile\n"
					+ "4 - Applications\n"
					+ "5 - Documents\n");
			answer = allinput.nextInt();
			
			switch(answer)
			{
				case 1:
					System.out.println("OK...LOADING");
					message.welcome();
					break;
				
				case 2:
					System.out.println("OK...LOADING");
					newmess.StudentInfo2();
					break;
					
				case 3:
					System.out.println("OK....LOADING");
					rateyourself.employ();
					break;
					
				case 4:
					System.out.println("OK...LOADING");
					applications.welcome();
					break;
					
				case 5:
					System.out.println("OK...LOADING");
					documents.welcome();
					break;
					
				default:
					System.out.println("INVAILD INPUT");
					check = 1;
					
					while (check == 1)
					{
						System.out.println("1- Tasks/Messages"
								+ "2 - Information"
								+ "3 - Employment Profile"
								+ "4 - Applications"
								+ "5 - Documents");
						answer = allinput.nextInt();
						
						switch(answer)
						{
							case 1:
								check = 0;
								System.out.println("OK...LOADING");
								message.welcome();
								break;
							
							case 2:
								check = 0;
								System.out.println("OK...LOADING");
								newmess.StudentInfo2();
								break;
								
							case 3:
								check = 0;
								System.out.println("OK....LOADING");
								rateyourself.employ();
								break;
								
							case 4:
								check = 0;
								System.out.println("OK...LOADING");
								applications.welcome();
								break;
								
							case 5:
								check = 0;
								System.out.println("OK...LOADING");
								documents.welcome();
								break;
								
							default:
								System.out.println("INVAILD INPUT");
								check = 1;
								
								while (check == 1)
								{
									System.out.println("1- Tasks/Messages"
											+ "2 - Information"
											+ "3 - Employment Profile"
											+ "4 - Applications"
											+ "5 - Documents");
									answer = allinput.nextInt();
								}
							
						}
					}
				
			}
		}
}
