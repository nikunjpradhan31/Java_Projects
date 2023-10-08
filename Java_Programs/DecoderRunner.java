import static java.lang.System.*; 
import java.util.Scanner;

public class DecoderRunner
{
	public static void main( String args[] )
	{

		Decoder test = new Decoder();
		test.setLetter('a');
		test.deCode();
		System.out.println(test);
		
		test.setLetter('A');
		test.deCode();
		System.out.println(test);
		
		test.setLetter('0');
		test.deCode();
		System.out.println(test);
		
		test.setLetter('*');
		test.deCode();
		System.out.println(test);
		
			
	}
}