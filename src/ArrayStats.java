import static java.lang.System.*;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayStats
{
	private int[] numCount;
	
	public ArrayStats(){
		
	}
	public void setArray(int[] arr){
		numCount = arr;
	}

	public int getNumGroupsOfSize(int size)
	{
		int cnt =1;
		int cnt2 = 0;
		for(int x= 0; x<numCount.length-1;x++){
			if(numCount[x]==numCount[x+1]){
				cnt++;
			}
			else
				cnt =1;
			if(cnt==size){
				cnt2++;
			}
		}
			if(size==1){
				cnt2++;
			}
				

		return cnt2;
	}
	
	public String toString()
	{
		return ""+Arrays.toString(numCount);
	}
}