import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class PascalsTriangleRunner
{
	public static void main( String args[] ) throws IOException
	{
		PascalsTriangle test = new PascalsTriangle(7);
		test.createTriangle();
		System.out.print(test);
	}
}



