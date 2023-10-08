public class LineRunner
{
	public static void main( String[] args )
   {
		//add test cases
		Line smitty = new Line(1,9,14,2);
		smitty.calculateSlope();
		smitty.print();
		
		smitty.setCoordinates(1,7,18,3);
		smitty.calculateSlope();
		smitty.print();
		
		smitty.setCoordinates(6,4,2,2);
		smitty.calculateSlope();
		smitty.print();
		
		smitty.setCoordinates(4,4,5,3);
		smitty.calculateSlope();
		smitty.print();
		
		smitty.setCoordinates(1,3,5,5);
		smitty.calculateSlope();
		smitty.print();
	}
}