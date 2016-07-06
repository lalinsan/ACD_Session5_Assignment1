/*
 * Student: Eduardo Aguirre
 * Session 5
 * Assignment 1
 * Java Programs that Prompts the user to select a Sport
 * Enter 2 Teams
 * Enter Score
 * Show the Winner
 */


import java.util.Scanner; //Imports the Scanner Class from Java API Library, to allows User's Input


public class TestSports {

	public static void main(String[] args) { //Main Method to run the Program
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner (System.in); //Initiates the Scanner Instance
		String choice ="Y";
		
		//Executes the code below as long as choice = Y or Yes
		while (choice.equalsIgnoreCase("Y") || choice.equalsIgnoreCase("Yes"))
		{
			System.out.print("Enter the Sport you like : ");
			String sport=sc.next();
			System.out.print("Enter Home Team : "); //Prompts user to enter a Home Team
			String homeTeam=sc.next(); //stores value entered by user
			System.out.print("Enter Visiting Team : "); //Prompts user to enter a Visiting Team
			String visitingTeam=sc.next(); //stores value entered by user
			
			if (sport.equalsIgnoreCase("Soccer"))
			{
				System.out.print("Enter Home Team Score : "); //Prompts user to enter a Home Team Score
				int homeTeamScore=sc.nextInt(); //stores value entered by user
				System.out.print("Enter Visiting Team Score : "); //Prompts user to enter a Visiting Team Score
				int visitingTeamScore=sc.nextInt(); //stores value entered by user
				
				Soccer soccer = new Soccer (); //Creates an Instance of the Soccer Class
				soccer.setHomeTeam(homeTeam); //Calls method to set the Home Team
				soccer.setVisitingTeam(visitingTeam); //Calls method to set the Visiting Team
				soccer.setHomeTeamScore(homeTeamScore); //Calls method to set the Home Team Score
				soccer.setVisitingTeamScore(visitingTeamScore); //Calls method to set the Visiting Team Score
				String winner=""; //Initalizes the winner variable to an Empty String
				soccer.setWinner(winner); //Calls method to set the Game Winner
					
				System.out.println(soccer.toString()); //Calls the String Method to print the Game Information
			}
			
						
			else if (sport.equalsIgnoreCase("Football"))
			{
				System.out.print("Enter Home Team Score Type : ");
				String homeScoreType=sc.next();
				
				System.out.print("Enter Visiting Team Score Type : ");
				String visitingScoreType=sc.next();
				//int homeTeamScore=0;
				//int visitingTeamScore=0;
								
				Football football = new Football (); //Creates an Instance of the Soccer Class
				football.setHomeTeamScoreType(homeScoreType);
				football.setVisitingTeamScoreType(visitingScoreType);
				football.setHomeTeam(homeTeam); //Calls method to set the Home Team
				football.setVisitingTeam(visitingTeam); //Calls method to set the Visiting Team
				football.setHomeTeamScore(); //Calls method to set the Home Team Score
				football.setVisitingTeamScore(); //Calls method to set the Visiting Team Score
				@SuppressWarnings("unused")
				String winner=""; //Initalizes the winner variable to an Empty String
				football.setWinner(); //Calls method to set the Game Winner
					
				System.out.println(football.toString()); //Calls the String Method to print the Game Information
			}
			
			System.out.print("Do you want to try again? Y|N : "); //Prompts the user to try again
			choice=sc.next(); //Store the value enter by the User

		}
			System.out.println("Thanks for using the App"); //Good by Message
	}

}
