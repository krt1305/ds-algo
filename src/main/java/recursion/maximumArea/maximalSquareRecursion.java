package recursion.maximumArea;

public class maximalSquareRecursion {
    static int totalRows=4;
    static int totalCols=5;
    static int maxLength=0;

    public static void main(String[] args) {
        int[][] matrix={{1,0,1,0,0},
                        {1,0,1,1,1},
                        {1,1,1,1,1},
                        {1,0,1,1,0}};
        for(int row=0;row<totalRows-1;row++)
        {
            for(int col=0;col<matrix[row].length;col++)
            {
                maxLength=Math.max(maxLength,maxArea(matrix,row,col));
            }
        }

        System.out.println("Area is "+maxLength*maxLength);

    }

    public static int maxArea(int[][] matrix,int row ,int col)
    {
        if(row>=totalCols-1 || col>=totalCols-1 || matrix[row][col]!=1)
        {
            return 0;
        }
        int right= maxArea(matrix,row,col+1);
        int down=maxArea(matrix,row+1,col);
        int diagonal=maxArea(matrix,row+1,col+1);

        return 1+Math.min(right,Math.min(down,diagonal));

    }
}
