import static java.lang.System.*;

public class Divisors
{
	public static String getDivisors( int number )
	{
		int num = number;
		int runner = 1;
		String divisors="";
		while(runner<num)
		{
			if (num%runner == 0)
			{
				divisors = divisors + runner + " ";
			}
			runner = runner + 1;
		}
		System.out.println(divisors);
		return divisors; 
	}
}