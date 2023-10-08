import static java.lang.System.*; 
import java.util.Scanner;

public class GradeCheck
{
	public static void main( String args[] )
	{
		Grade test = new Grade();
		test.setGrade(78);
		test.getLetterGrade();
		System.out.println(test);
		
		test.setGrade(92);
		test.getLetterGrade();
		System.out.println(test);
		
		test.setGrade(31);
		test.getLetterGrade();
		System.out.println(test);
		
		test.setGrade(82);
		test.getLetterGrade();
		System.out.println(test);
		
		test.setGrade(77);
		test.getLetterGrade();
		System.out.println(test);
		
		test.setGrade(73);
		test.getLetterGrade();
		System.out.println(test);
		
		test.setGrade(55);
		test.getLetterGrade();
		System.out.println(test);
		
		
	}
}