import static java.lang.System.*;

class TriangleWord
{
   private String word;

	public TriangleWord()
	{
		setWord("");
	}

	public TriangleWord(String w)
	{
		setWord(w);
	}

	public void setWord(String w)
	{
		word = w;
	}

	public String toString()
	{
		String output="";//first line is the length of the word is the first letter
		int len = word.length();
		int opp = 0;
		for(int x = 0; x<=len-2;x++)
		{
			for(int y =1; y<(len-x);y++)
				output += " ";
			output += word.charAt(x);
			if (opp >0)
			{
				for(int z =1; z<opp+1;z++)
					output += " ";
				output += word.charAt(x);
				opp += 1;	
			}
			output += "\n";
			opp += 1;
		}
		for(int a = len-1;a>=0;a--)
			output += word.charAt(a);
		output += word.substring(1);
		return output+"\n";
	}
}