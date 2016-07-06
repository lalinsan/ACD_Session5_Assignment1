/*
 * Student: Eduardo Aguirre
 * Session 5
 * Assignment 1
 * Java Football Class that uses different implementations of the methods defined by the Sports Interface.
 */

import java.text.DecimalFormat;

public class Football implements Sports //Implements Sports interface
{
    private String homeTeam; //Variable to store Home Team
    private String visitingTeam; //Variable to store Visiting Team
    private int homeTeamScore; //Variable to store Home Team Score
    private int visitingTeamScore; //Variable to store Visiting Team Score
    private String homeScoreType;
    private String visitingScoreType;
    private String winner; //Variable to store Winner
    
    //Setters Section
	@Override
	public void setHomeTeam(String homeTeam) 
	{ //Set Home Team. Implemented from Sports Interface
		this.homeTeam=homeTeam;
	}

	@Override
	public void setVisitingTeam(String visitingTeam) //Set Visiting Team. Implemented from Sports Interface
	{ 
		this.visitingTeam=visitingTeam;
		
	}
    	
	public void setHomeTeamScoreType(String homeScoreType ) //Set Home Team Score Type
	{ 
		this.homeScoreType=homeScoreType;
	}
	
	public void setVisitingTeamScoreType(String visitingScoreType) //Set Visiting Team Score Type
	{ 
		this.visitingScoreType=visitingScoreType;
	}
	
	
	@Override
	public void setHomeTeamScore(int homeTeamScore ) //Set Home Team Score. Implemented from Sports Interface
	{ 
	}
	
	public void setHomeTeamScore() //Set Home Team Score
	{ 
		if (homeScoreType.equalsIgnoreCase("Touch_down"))
		{
			this.homeTeamScore=6;
		}
		else if (homeScoreType.equalsIgnoreCase("Field_Goal")) 
		{
			this.homeTeamScore=3;
		}
		else if (homeScoreType.equalsIgnoreCase("Safety")) 
		{
			this.homeTeamScore=2;
		}
		else if (homeScoreType.equalsIgnoreCase("Extra_Point")) 
		{
			this.homeTeamScore=1;
		}
		else
		{
			this.homeTeamScore=0;
		}
			
	}
    
	@Override
	public void setVisitingTeamScore(int visitingTeamScore)//Set Visiting Team Score. Implemented from Sports Interface
	{
		
	}
	
	
	public void setVisitingTeamScore() { //Set Visiting Team Score. 
		if (visitingScoreType.equalsIgnoreCase("Touch_Down"))
		{
			this.visitingTeamScore=6;
		}
		else if (visitingScoreType.equalsIgnoreCase("Field_Goal")) 
		{
			this.visitingTeamScore=3;
		}
		else if (visitingScoreType.equalsIgnoreCase("Safety")) 
		{
			this.visitingTeamScore=2;
		}
		else if (visitingScoreType.equalsIgnoreCase("Extra_Point")) 
		{
			this.visitingTeamScore=1;
		}
		else
		{
			this.visitingTeamScore=0;
		}
			
	}

	@Override
	public void setWinner(String winner)  //Set Winner. Implemented from Sports Interface
	{
		
	}
	
	public void setWinner()  //Set Winner. 
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
			this.winner="Extra Time required";
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
    
		
	public String getFormattedScore(int teamScore) //Formats Score to be Strings (Passes the int as parameter)
	{
		DecimalFormat df = new DecimalFormat ("#");
		String teamScoreF =df.format(teamScore);
		return teamScoreF;
	}
	
		
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
