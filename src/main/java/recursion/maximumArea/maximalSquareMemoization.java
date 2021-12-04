package recursion.maximumArea;

public class maximalSquareMemoization {
    static int totalRows=4;
    static int totalCols=5;
    static int maxLength=0;
    public static void main(String[] args) {
        int[][] matrix={{1,0,1,0,0},
                {1,0,1,1,1},
                {1,1,1,1,1},
                {1,0,0,1,0}};
        int[][] memo=new int[totalRows][totalCols];
        for(int row=0;row<totalRows-1;row++)
        {
            for(int col=0;col<matrix[row].length;col++)
            {
                maxLength=Math.max(maxLength,maxArea(matrix,row,col,memo));

            }
        }
         System.out.println("Max length is "+maxLength*maxLength);


    }

    public static int maxArea(int[][] matrix,int row,int col,int[][] memo)
    {
        if(row>=totalRows-1 || col>=totalCols-1 || matrix[row][col]!=1)
            return 0;
        if(memo[row][col]!=0) return memo[row][col];
       // int right= maxArea(matrix,row,col+1,memo);
       // int down=maxArea(matrix,row+1,col,memo);
        //int diagonal=maxArea(matrix,row+1,col+1,memo);

        return memo[row][col]=1+Math.min( maxArea(matrix,row,col+1,memo),Math.min(maxArea(matrix,row+1,col,memo),
                maxArea(matrix,row+1,col+1,memo)));

    }
}
