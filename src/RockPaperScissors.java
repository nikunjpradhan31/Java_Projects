import java.util.Scanner;
import static java.lang.System.*;
import java.util.Random;

public class RockPaperScissors
{
	private String playChoice;
	private String compChoice;

	public RockPaperScissors()
	{
		setPlayers("");
	}

	public RockPaperScissors(String player)
	{
		setPlayers(player);
	}

	public void setPlayers(String player)
	{
		playChoice = player;
		Random rand = new Random();
		int num = rand.nextInt(3);
		if (num == 0)
			compChoice = "R";
		else if (num ==1)
			compChoice = "P";
		else
			compChoice = "S";
	}

	public String determineWinner()
	{
		String winner="";
		if (playChoice.equals(compChoice))
		{
			winner = "Draw Game";
		}
		else if(playChoice.equals("R"))
		{
			if(compChoice.equals("P"))
				winner = "Player: R / Computer: P / Computer Wins";
			else 
				winner = "Player: R / Computer: S / Player Wins";
					
		}
		else if(playChoice.equals("S"))
		{
			if(compChoice.equals("R"))
				winner = "Player: S / Computer: R / Computer Wins";
			else 
				winner = "Player: S / Computer: P / Player Wins";
		}
					
		else if(playChoice.equals("P")) 
		{
			if(compChoice.equals("S"))
				winner = "Player: P / Computer: S / Computer Wins";
			else 
				winner = "Player: P / Computer: R / Player Wins";
		}
	
		return winner;
	}

	public String toString()
	{
		String output= "" + determineWinner();
		return output;
	}
}