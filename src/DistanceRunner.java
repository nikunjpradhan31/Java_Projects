import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class DistanceRunner
{
	public static void main( String[] args )
	{
		Distance test = new Distance();
		test.setCoordinates(1,1,-2,1);
		test.calcDistance();
		test.print();
		
		test.setCoordinates(0,0,3,4);
		test.calcDistance();
		test.print();
		
		test.setCoordinates(-1,2,4,14);
		test.calcDistance();
		test.print();
		
		
		
		
		
		
			
	}
}