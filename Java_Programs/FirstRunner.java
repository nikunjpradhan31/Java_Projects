import static java.lang.System.*;

public class FirstRunner
{
	public static void main ( String[] args )
	{
		FirstAndLast demo = new FirstAndLast("Hello");
		demo.findFirstLastLetters();
		out.println(demo);
		
		FirstAndLast world = new FirstAndLast("World");
		world.findFirstLastLetters();
		out.println(world);
		
		FirstAndLast juke = new FirstAndLast("JukeBox");
		juke.findFirstLastLetters();
		out.println(juke);
		
		FirstAndLast TC = new FirstAndLast("TCEA");
		TC.findFirstLastLetters();
		out.println(TC);
		
		FirstAndLast UI = new FirstAndLast("UIL");
		UI.findFirstLastLetters();
		out.println(UI);
	
		
	}
}