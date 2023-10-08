import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;
import java.util.Random;

public class GridRunner
{
    public static void main( String args[] ) throws IOException
    {
       String[] arr = {"a", "b", "c"};
        Grid test = new Grid(3,4, arr);
        System.out.println("f occurs "+ test.countVals("f")+ " times");
        System.out.println("x occurs "+ test.countVals("x")+ " times");
        System.out.println("c occurs "+ test.countVals("c")+ " times");
        System.out.println("0 occurs "+ test.countVals("0")+ " times");
        System.out.println("9 occurs "+ test.countVals("9")+ " times");
        System.out.println(test.findMax(arr)+ " occurs the most");
        System.out.println(test);
    }
}