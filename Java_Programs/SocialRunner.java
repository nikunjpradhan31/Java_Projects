import static java.lang.System.*;

public class SocialRunner
{
	public static void main( String args[] )
	{
		//add test cases
		Social smitty = new Social("1-1-1");
		smitty.chopAndAdd();
		System.out.println(smitty);
		
		smitty.setWord("987-65-4321");
		smitty.chopAndAdd();
		System.out.println(smitty);
		
		smitty.setWord("456-56-234");
		smitty.chopAndAdd();
		System.out.println(smitty);
		
		smitty.setWord("102-2-12");
		smitty.chopAndAdd();
		System.out.println(smitty);
	}
}