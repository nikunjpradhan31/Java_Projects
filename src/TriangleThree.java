import static java.lang.System.*;

public class TriangleThree
{
   private int size;
   private String letter;

	public TriangleThree()
	{
		setTriangle("",0);
	}

	public TriangleThree(int count, String let)
	{
		setTriangle(let,count);
	}

	public void setTriangle( String let, int sz )
	{
		size = sz;
		letter = let;
	}

	public String getLetter() 
	{
		return "#";
	}

	public String toString()
	{
		String output="";
		for (int x= 1; x<=size;x++)
		{
			for(int y = 1; y<=size-x;y++)
				output += " ";
			for(int z = 1;z<= size-(size-x);z++)
				output += letter;
			output += "\n";
		}
		return output+"\n";
	}
}