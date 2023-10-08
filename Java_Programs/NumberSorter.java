import java.util.Arrays; 
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberSorter
{
	//instance variables and other methods not shown

	private static int getNumDigits(int number)
	{
		int count= String.valueOf(number).length();

		return count;
	}

	public static int[] getSortedDigitArray(int number)
	{
		int length = getNumDigits(number);
		int [] digits = new int[length];
		for (int x= 0; length >x;x++){
			int space = number %10;
			number = number/10;
			digits[x] = space;
		}
		Arrays.sort(digits);
		
		return digits;
	}
}