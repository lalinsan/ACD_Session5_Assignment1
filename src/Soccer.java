
/*
 * Student: Eduardo Aguirre
 * Session 5
 * Assignment 1
 * Java Soccer Class that uses  implementations of the methods defined by the Sports Interface.
 */

import java.text.DecimalFormat;

public class Soccer implements Sports //Implements Sports interface
{
    private String homeTeam; //Variable to store Home Team
    private String visitingTeam; //Variable to store Visiting Team
    private int homeTeamScore; //Variable to store Home Team Score
    private int visitingTeamScore; //Variable to store Visiting Team Score
    private String winner; //Variable to store Winner
    
    //Setters Section
	@Override
	public void setHomeTeam(String homeTeam) { //Set Home Team. Implemented from Sports Interface
		this.homeTeam=homeTeam;
	}

	@Override
	public void setVisitingTeam(String visitingTeam) { //Set Visiting Team. Implemented from Sports Interface
		this.visitingTeam=visitingTeam;
		
	}

	@Override
	public void setHomeTeamScore(int homeTeamScore) { //Set Home Team Score. Implemented from Sports Interface
		this.homeTeamScore=homeTeamScore;
		
	}

	@Override
	public void setVisitingTeamScore(int visitingTeamScore) { //Set Visiting Team Score. Implemented from Sports Interface
		this.visitingTeamScore=visitingTeamScore;
		
	}
    	
	@Override
	public void setWinner(String winner)  //Set Winner. Implemented from Sports Interface
	{
		if (homeTeamScore>visitingTeamScore) //If home team score is higher than visiting team the Home team is set as winner
		{
			this.winner=homeTeam;
		}
		else if (homeTeamScore<visitingTeamScore) //If home team score is less than visiting team the Visiting team is set as winner
		{
			this.winner=visitingTeam;
		}
		else //If Home and Visiting Team Score are the same then is shows that the game was tied
		{
			this.winner="Tie Match";
		}	
	}
	
	//Getters section
	public String getHomeTeam() { //Returns Home Team
		return homeTeam;
	}

	public String getVisitingTeam() { //Returns Visiting Team
		return visitingTeam;
	}

	public int getHomeTeamScore() { //Returns Home Team Score
		return homeTeamScore;
	}
		
	public int getVisitingTeamScore() { //Returns Visiting Team Score
		return visitingTeamScore;
	}

	
	public String getWinner() { //Returns Winner Team
		return winner;
	}
    
	/*public String getHomeTeamScoreF()
	{
		DecimalFormat df = new DecimalFormat ("#");
		String homeTeamScoreF =df.format(homeTeamScore);		
		return homeTeamScoreF;
	}
	
	public String getVisitingTeamScoreF()
	{
		DecimalFormat df = new DecimalFormat ("#");
		String visitingTeamScoreF =df.format(visitingTeamScore);
		return visitingTeamScoreF;
	}*/
	
	public String getFormattedScore(int teamScore) //Formats Score to be Strings (Passes the int as parameter)
	{
		DecimalFormat df = new DecimalFormat ("#");
		String teamScoreF =df.format(teamScore);
		return teamScoreF;
	}
	
	/*public String getGameScore(String gameScore)
	{
		gameScore=teamScoreF(homeTeamScore) + "-" + visitingTeamScore;
		return gameScore;
	}*/
	
	
	public String toString()  //Prints Game Information
	{
		return  "======================================================="+"\n"+
				"Home Team : "           + " " +getHomeTeam() +"\n" + 
		        "Visiting Team :  "      + " " +getVisitingTeam() +"\n" +
		        "======================================================="+"\n"+
		        "Home Team Score: "      + " " +getFormattedScore(homeTeamScore) +"\n" +
		        "Visiting Team Score : " + " " +getFormattedScore(visitingTeamScore) +"\n"+
		        "======================================================="+"\n"+
		        "Game Score :"           + " " +getFormattedScore(homeTeamScore)+ "-" + getFormattedScore(visitingTeamScore)+"\n"+ 
	            "Winning Team: "         + " " +getWinner() +"\n"+
		       "=======================================================";      
	}


	
}