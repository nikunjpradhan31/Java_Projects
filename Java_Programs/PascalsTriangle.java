import java.util.Scanner;
import static java.lang.System.*;

public class PascalsTriangle
{
	private int[][] mat;
	private int siz;

	public PascalsTriangle()
	{
		mat = new int[0][0];
	}

	public PascalsTriangle(int size)
	{
		siz = size;
		mat = new int[size][size];

	}

	public void createTriangle()
	{

	for(int i = 0; i<siz; i++){
		for(int x = 0; x<=i;x++){
			if(x==0 || x==i)
				mat[i][x]=1;
			else
				mat[i][x] = mat[i-1][x-1]+mat[i-1][x];
		}
	}



	}

	public String toString()
	{
		String output="";
		for(int x = 0; x<siz;x++){
			for(int y = 0; y<siz;y++){
				if(mat[x][y] != 0)
				output += mat[x][y] + " ";
			}
			output += "\n";
		}

		return output;
	}
}