import static java.lang.System.*;

public class StringFirstLetterRunner
{
	public static void main( String args[] )
	{
		//add test cases
		StringFirstLetterCheck smitty = new StringFirstLetterCheck("joe", "jim");
		System.out.println(smitty);

		smitty.setWords("Billy", "billy");
		System.out.println(smitty);
		
		smitty.setWords("bill", "billy");
		System.out.println(smitty);
		
		smitty.setWords("TCEA", "UIL");
		System.out.println(smitty);
		
		smitty.setWords("State", "Champions");
		System.out.println(smitty);
		
		smitty.setWords("ABC", "DEF");
		System.out.println(smitty);
	}
}