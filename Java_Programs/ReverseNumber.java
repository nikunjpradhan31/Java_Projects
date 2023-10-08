import static java.lang.System.*;

public class ReverseNumber
{
   private int number;

	//add constructors
	public ReverseNumber()
	{
		setNum(0);
	}	
	public ReverseNumber(int num)
	{
		setNum(num);
	}
	//add a set method
	public void setNum(int num)
	{
		number = num;
	}

	public int getReverse()
	{
		int rev=0;
		while(number>0)
		{
			rev = (rev*10) + (number%10);
			number = number/10;
		}	
		return rev;
	}

	//add  a toString	
	public String toString()
	{
		return ""+ getReverse();
	}
}