package recursion.maximumArea;

public class maximalRectangleRecursion {
    static int totalRows=4;
    static int totalCols=5;
    static int maxLength=0;
    public static void main(String[] args) {
        int[][] matrix={{1,0,1,0,0},
                {1,1,1,1,1},
                {1,1,1,1,1},
                {1,0,0,1,0}};
        for(int row=0;row<totalRows-1;row++)
        {
            for(int col=0;col<matrix[row].length;col++)
            {
                maxLength=Math.max(maxLength,maxArea(matrix,row,col));
               // System.out.println("Max length is "+maxLength);
            }
        }

        System.out.println("Area is "+maxLength);

    }

    public static int maxArea(int[][] matrix,int row,int col)
    {
        if(row>=totalRows-1 || col>=totalCols-1 || matrix[row][col]!=1)
            return 0;
        int rightLength=maxArea(matrix,row,col+1);
        System.out.println("Right length is "+rightLength);
        int downLength=maxArea(matrix,row+1,col);
        System.out.println("Down length "+downLength);

        return ((1+rightLength)*(1+downLength));

    }
}
