public class Rectangle {
	int length;
	int width;
	int perimeter;
	
  	public void setLengthWidth(int len, int ht)
  	{
  		length = len;
  		width = ht;
  	}
  	
  	public void calculatePerimeter()
  	{
  		perimeter = 2*(length+width);
  	}
    
    public void print()
    {
    	System.out.println("The perimeter is :: " + perimeter);
    }
}