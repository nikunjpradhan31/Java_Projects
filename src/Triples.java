import static java.lang.System.*;

public class Triples
{
   private int number;

	public Triples()
	{
		this(0);
	}

	public Triples(int num)
	{
		setNum(num);
	}

	public void setNum(int num)
	{
		number = num;

	}
	
	private int greatestCommonFactor(int a, int b, int c)
	{
		int gcf = 0;
		for (int x=1; x <=a && x <=b && x<=c; x++)
		{
			if (a%x==0 && b%x==0 && c%x==0)
				gcf = x;
		}
		return gcf;
	}

	public String toString()
	{
		String output="";
	for(int a =1; a<=(number-2) ;a++)
		for(int b=a+1; b <=(number-1); b++)
			for(int c=b+1; c<=(number); c++)
			{
				if ((a*a) + (b*b) == (c*c))
				{
					if (((a%2==1&&b%2==0)||(a%2==0&&b%2==1))&&c%2==1)
						if (greatestCommonFactor(a,b,c)==1)
							output += "" + a + " " + b + " " + c + "\n";
				}
			}
		return output+"\n";
	}
}