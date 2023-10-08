import java.util.Scanner;
import static java.lang.System.*;

public class MonsterRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		int size, size2;
		String name, name2;
		
		
		System.out.print("Enter 1st monster's name : ");
		name = keyboard.next();
		System.out.print("Enter 1st monster's size : ");
		size = keyboard.nextInt();
		
		Monster mOne = new Monster(name, size);
		
		System.out.print("Enter 2st monster's name : ");
		name2 = keyboard.next();
		System.out.print("Enter 2st monster's size : ");
		size2 = keyboard.nextInt();
		
		Monster mTwo = new Monster(name2,size2);
		
		out.println(mOne.isBigger(mTwo));
		out.println(mOne.namesTheSame(mTwo));
		
		if(mOne.isBigger(mTwo)== true)
			out.println("Monster one is bigger than Monster two");
		else{
			out.println("Monster one is smaller than Monster two");		}
			
		if(mOne.namesTheSame(mTwo) == false)
			out.println("Monster one does not have the same name as Monster two");
		else{
			out.println("Monster one has the same name as Monster two");
	}
}
}