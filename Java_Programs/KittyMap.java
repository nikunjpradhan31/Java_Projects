import java.util.Scanner;
import static java.lang.System.*;
import java.lang.Math;

public class KittyMap
{
	private boolean[][] kittyGrid;
	private int[][] kittyCount;
	private int row, col;

	/*
	 *this constructor loads in random true and false values
	 */
	public KittyMap(int rows, int cols)
	{
		row = rows;
		col = cols;
		kittyGrid = new boolean[rows][cols];
		for(int y = 0; y<rows;y++){
			for(int x = 0; x<cols; x++){
				int number = (int)(Math.random()*5);
				if(number == 1)
					kittyGrid [y][x] = true;
				else
					kittyGrid [y][x] = false; 
			}
		}
	}

	/*
	 *this method will call getKittyCountsGrid
	 *to retrieve the kitty counts for the kittyGrid
	 */
	public void printKittyCount()
	{
		getKittyCountsGrid();
		for(int x = 0; x<row;x++){
			for(int y = 0;y<col;y++){
				int z = kittyCount[x][y];
				out.print(z + " ");
			}
			out.print("\n");
		}
	}

	/*
	 *this method will calculate the kitty counts for each cell
	 *if cell is true set int value to 9
	 *if cell is not true set int value to cnt of kitties in adjacent cells
	 */
	private int[][] getKittyCountsGrid()
	{
		kittyCount = new int[row][col];
		for(int x = 0; x< row; x++){
			for(int y = 0; y<col; y++){
					kittyCount[x][y] = getKittyCount(x,y);
				}
			}
			return kittyCount;
		}

	/*
	 *this method will return the value of the current cell
	 *if this cell contains a kitty - return 9
	 *otherwise - return the cnt of all kitties in adjacent cells
	 */
	public int getKittyCount( int r, int c)
	{
		int counter = 0;
		if(kittyGrid[r][c] == true){
			return 9;
		}
		else{
			for(int x = r-1; x<r+2;x++){
				for(int y = c-1;y<c+2;y++){	
				if (inBounds(x,y) && kittyGrid[x][y] == true)
					counter += 1;
				}
			}
			return counter;
	}
	}

	/*
	 *check r and c to ensure they are inside the grid
	 */
	private boolean inBounds( int r, int c)
	{
		if((c>=kittyGrid[0].length || c<0)||(r>=kittyGrid.length || r<0))
		return false;
		else 
		return true;
	}

	/*
	 *return the kitty grid as a string
	 */
	public String toString()
	{
		String output="";
		for(int x = 0; x<row;x++){
			for(int y = 0; y<col; y++){
				if(kittyGrid[x][y] == true)
					output += "1 ";
				else
					output += "0 ";
				
			}
			output += "\n";
		}		
		return output;
	}
}