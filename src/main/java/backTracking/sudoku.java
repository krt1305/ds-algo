package backTracking;

public class sudoku {
    public static int totalrows=9;
    public static int totalCols=9;
    public static void main(String[] args) {
        int grid[][]={{3,0,6,5,0,8,4,0,0},
                {5,2,0,0,0,0,0,0,0},
                {0,8,7,0,0,0,0,3,1},
                {0,0,3,0,1,0,0,8,0},
                {9,0,0,8,6,3,0,0,5},
                {0,5,0,0,9,0,6,0,0},
                {1,3,0,0,0,0,2,5,0},
                {0,0,0,0,0,0,0,7,4},
                {0,0,5,2,0,6,3,0,0}};


        //for every row
        //check every ol value
                // if filled continue
                // else ( check with no's from 1-9 and check if its safe
                          // if yes continue
                          // else put the value back to 0
        solveSoduku(grid,0,0,9,9);
    }

    public static boolean solveSoduku(int[][] grid,int currRow,int currCol,int rows,int cols)
    {
        if(currRow==totalrows-1 && currCol==totalCols-1) return true;
        if(currCol==cols-1){
            currRow++;
            currCol=0;
        }

                if(grid[currRow][currCol]==0){

                    for(int k=1;k<=9;k++)
                    {
                        grid[currRow][currCol]=k;
                        //isSafe if it is safe move to next col
                        if(isSafe(grid,currRow,currCol,k)){
                            if(solveSoduku(grid,currRow,currCol++,rows,cols)){
                                return true;
                            }
                        }
                        grid[currRow][currCol]=0;
                    }
                }
                return false;
    }


    public static boolean isSafe(int[][] grid,int row,int col,int num)
    {
      //no should not be present in same row
        for(int i=col;i<totalCols;i++)
        {
            if(i==col ) continue;
            if(grid[row][i]==num) return false;
        }

        //no should not be present in same column
        for(int i=row;i<totalrows;i++)
        {
            if(i==row ) continue;
            if(grid[i][col]==num) return false;
        }

        //check in 3X3 matrix

        int startRow=row-row%3;
        int startCol=col-col%3;
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(grid[i+startRow][i+startCol]==num)
                    return false;
            }
        }
        return true;
    }
}
