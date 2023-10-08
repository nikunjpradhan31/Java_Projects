import static java.lang.System.*; 

public class Decoder
{
	private char letter;

	public Decoder()
	{
		setLetter(' ');


	}

	public Decoder(char let)
	{
		setLetter(let);


	}

	public void setLetter(char let)
	{
		letter =let;


	}

	public char deCode()
	{
		char result = 0;
		if ((letter >= 97)&& (letter <=122)){
			result = (char)(letter -32);
		}
		else if ((letter >= 65)&& (letter <=90)){
			result = (char)(letter +32);
		}
		else if ((letter >= 48)&& (letter <=57)){
			 result  = (char)(letter + 17);
		}
		else {
			 result = (char)(35);
		} return result;
	}

	public String toString()
	{
		return "" + deCode();
	}
}