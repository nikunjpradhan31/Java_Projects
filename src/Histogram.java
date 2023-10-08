import java.util.Scanner;

public class Histogram
{
	private int[] numCount;

	public Histogram(int[] arr){
		numCount = arr;
	}

	public String toString(){
		int counter = 0;
		String statement = "";
		for( int x = 0; x<10;x++){
			for(int items: numCount){
				if(x == items)
					counter += 1;
			}
			statement += x + " - " + counter + "\n";
			counter = 0;
		}
		return statement;
	}
}