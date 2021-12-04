package recursion.uniquePaths;



public class countUniquePathsRIghtDown {
    static int totalRows = 3;
    static int totalCols = 2;
    static int count=0;
    public static void main(String[] args) {
            int arr[][] = {{0, 0},
                    {0, 0},
                    {0, 0},
            };
        System.out.println(uniquePaths(arr, 0, 0));
        }

        public static int uniquePaths(int arr[][],int row,int col)
        {
            if(row==totalRows-1 && col==totalCols-1){
                return 1;
            }
            if(col>totalCols-1)
            {
                //row++;
                return 0;
            }
            if(row>totalRows-1)
            {
                return 0;
            }
                return uniquePaths(arr,row,col+1)+ uniquePaths(arr,row+1,col);

        }

}
