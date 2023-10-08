import static java.lang.System.*;

public class Factorial
{
	private int number;

	public Factorial()
	{
		setNum(0);
	}

	public Factorial(int num)
	{
		setNum(num);
	}

	public void setNum(int num)
	{
		number = num;
	}

	public int getNum()
	{
		return number;
	}

	public long getFactorial( )
	{
		long factorial=1;
		for (int x = number; x > 0; x--)
		{
			factorial = factorial * x;
		}

		return factorial;
	}

	public String toString()
	{
		return "factorial of " + getNum() + " is "+ getFactorial()+"\n";
	}
}