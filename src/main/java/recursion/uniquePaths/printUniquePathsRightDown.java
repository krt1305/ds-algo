package recursion.uniquePaths;

import java.util.ArrayList;
import java.util.List;

public class printUniquePathsRightDown {
    static List<String> uniquePath=new ArrayList<String>();
    static int totalRows=3;
    static int totalCols=2;
    static boolean[][] visitedArr;

    public static void main(String[] args) {
        int arr[][]={{0,0},
                {0,0},
                {0,0},
               };
        visitedArr=new boolean[totalRows][totalCols];
        for(int i=0;i<totalRows;i++)
        {
            for(int j=0;j<totalCols;j++)
            {
               // System.out.println(visitedArr[i][j]);
            }
        }
        uniquePaths(arr,0,0,uniquePath);
    }

    public static void uniquePaths(int arr[][],int row,int col,List<String> uniquePath)
    {
        //only right and down direction
        //base conditions
        //RDD ,DRD,RDR
        if(row==totalRows-1 && col==totalCols-1) {
            System.out.println("Subset-----");
            for(String s:uniquePath)
            {
                System.out.println(s);
            }
            System.out.println("-------------------");
           // uniquePath=new ArrayList<>();
            return;
        }
         if(col>totalCols-1) {
           // col=0;
           // uniquePath.remove(uniquePath.size()-1);
            //row++;
            return ;
        }
        if(row>totalRows-1)
        {
            return;
        }

        visitedArr[row][col]=true;
        uniquePath.add("R");
        uniquePaths(arr,row,col+1,uniquePath);
        uniquePath.remove(uniquePath.size()-1);
        uniquePath.add("D");
        uniquePaths(arr,row+1,col,uniquePath);

    }


}
