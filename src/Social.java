//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

import static java.lang.System.*;

public class Social
{
   private String socialNum;
   private int sum;

	public Social()
	{
		setWord("");
	}

	public Social(String soc)
	{
		setWord(soc);
	}


	public void setWord(String w)
	{
		socialNum = w;
	}

	public void chopAndAdd()
	{
		String sub = socialNum;
	
		int sub1 = Integer.parseInt(socialNum.substring(0,socialNum.indexOf("-")));
		int sub2 = Integer.parseInt(socialNum.substring(socialNum.indexOf("-")+1,socialNum.lastIndexOf("-")));
		int sub3 = Integer.parseInt(socialNum.substring(socialNum.lastIndexOf("-") +1));	
		sum = sub1 + sub2 + sub3;
		
	}

	public String toString()
	{
		return "SS# " + socialNum + " has a total of " + sum + "\n";
	}
}