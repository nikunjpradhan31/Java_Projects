import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class QuadraticRunner
{
	public static void main( String[] args )
   {
   	Quadratic test =  new Quadratic();
   	test.setEquation(1,3,2);
   	test.calcRoots();
   	test.print();
   	
   	test.setEquation(2,13,6);
   	test.calcRoots();
   	test.print();
   	
   	test.setEquation(5,-8,3);
   	test.calcRoots();
   	test.print();
   	//add test cases
   	
   	
		
		
	}
}