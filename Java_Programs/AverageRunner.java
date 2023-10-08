public class AverageRunner
{
	public static void main( String[] args )
   {
 		Average test = new Average ();
 		test.setNums(5,12);
 		test.calculation();
 		test.print();
 		
 		test.setNums(90,100);
 		test.calculation();
 		test.print();
 		test.setNums(100,85.8);
 		test.calculation();
 		test.print();
 		test.setNums(-100,55);
 		test.calculation();
 		test.print();
 		test.setNums(15236,5642);
 		test.calculation();
 		test.print();
 		test.setNums(1000,555);
 		test.calculation();
 		test.print();
	}
}