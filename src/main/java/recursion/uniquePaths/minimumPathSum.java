package recursion.uniquePaths;

public class minimumPathSum {
    static int rows=3;
    static int sum=0;
    public static void main(String[] args) {
        int arr[][]={{1,3,1},
                {2,3,2},
                {4,3,1}};
        System.out.println("minimum path sum "+miniumPathSum(arr,rows,rows,0,0));


    }

    public static int miniumPathSum(int[][] arr,int totalRows,int totalCols,int currRow,int currCol)
    {
        if(currRow==totalRows-1 && currCol==totalCols-1)
        {
          return arr[currRow][currCol];
        }
        if(currRow>totalRows-1)
        {
            return 0;
        }
        if(currCol>totalCols-1)
        {
            return 0;
        }
        //System.out.println(arr[currRow][currCol]);
        return  arr[currRow][currCol]+Math.min(miniumPathSum(arr,totalRows,totalCols,currRow,currCol+1),
                miniumPathSum(arr,totalRows,totalCols,currRow+1,currCol));


    }


}
