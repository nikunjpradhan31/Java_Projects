import java.util.Scanner;
import static java.lang.System.*;

public class RPSRunner
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		char response;
		response = 'y';
		while (response == 'y' ){
		
		//add in a do while loop after you get the basics up and running
		
			String player = "";
		
			out.print("type in your prompt [R,P,S] :: ");
			
			//read in the player value
		
			RockPaperScissors game = new RockPaperScissors(keyboard.next());
			System.out.println(game);
			out.print("Do you want to play again? ");
			response = keyboard.next().charAt(0);
		}
	}
}



