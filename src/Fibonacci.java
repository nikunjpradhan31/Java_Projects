import java.util.Arrays;
public class Fibonacci
{
	private int size;
	private int[] arr;
	
	public Fibonacci(int s){
		arr = new int[s];
		size = s;
		createArr();
	}
	public int getNum(int i){
		createArr();
		i = i - 1;
		if (i>arr.length){
			System.out.println("-1");
			return -1;
		}
		else{
		System.out.println(arr[i]);
		return arr[i];
		}
	}
	public int[] createArr(){
		int num1 = 0;
		int num2 = 1;
		arr[0] = 1;
		for(int x = 0; size-1>x;x++){
			int num3 = num2+num1;
			num1 = num2;
			num2 = num3;
			arr[x+1] = num3;
		}
		return arr;
	}
	public String toString(){

		return Arrays.toString(arr);
	}
}
