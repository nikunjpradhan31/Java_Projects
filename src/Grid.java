import java.util.Arrays;
import java.lang.Math;

public class Grid
{
    private String[][] grid;
    private int colu, row;

    //load vals into the rows x cols grid randomly
    public Grid(int rows, int cols, String[] vals)
    {

         colu = cols;
         row = rows;
        grid = new String[rows][cols];
        for(int y = 0; y < rows; y ++){
            for(int x = 0; x < cols; x++){
                int value = (int)(Math.random()*vals.length);
                grid[y][x] = vals[value];
            }
        }
    }

    //find out which of the vals occurs the most
    public String findMax(String[] vals)
    {
        String max_string = vals[0];
        int most_occ = 0;
        for(int i = 0; i<vals.length;i++){
            int counter = 0;
            for(int y = 0; y<row;y++){
                for(int x = 0; x<colu;x++){
                    if(vals[i].equals(grid[y][x]))
                        counter ++;


                }
            }
            if(most_occ<counter){
                max_string = vals[i];
                most_occ = counter;
            }
        }
        return max_string;
    }

    //returns a count of how many times val occurs in the matrix
    public int countVals( String val ) {
        int counter = 0;
        for (int y = 0; y < row; y++) {
            for (int x = 0; x < colu; x++) {
                if(val.equals(grid[y][x]))
                    counter ++;
            }
        }
        return counter;
    }

    //display the grid
    public String toString()
    {
        String x = "";
        for(int y = 0; y < row; y++){
            x += Arrays.toString(grid[y]) + "\n";
        }
        return x;
    }
}
