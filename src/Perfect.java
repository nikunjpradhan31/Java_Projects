import static java.lang.System.*;

public class Perfect
{
   private int number;

	//add constructors
	public Perfect()
	{
		setNum(0);
	}
	public Perfect(int num)
	{
		setNum(num);
	}
	public void setNum(int num)
	{
		number = num;
	}	

	//add a set method

	public boolean isPerfect()
	{
		int runner = 1;
		int total=0;
		while(runner<number)
		{
			if (number%runner == 0)
			{
				total = total + runner;
			}
			runner ++;
		}
		if (number == total)
		{
			return true;
		}
		else
		{
			return false;
		}
			
	}

	//add a toString	
	public String toString()
	{
		if (isPerfect()== true)
		{
			return number + " is perfect";
		}
			
		else
		{
			return number + " is not perfect";
		}
	}
}