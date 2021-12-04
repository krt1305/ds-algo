package recursion.longestIncreasingSubsequence;

import java.util.Arrays;
//    - [x] https://www.youtube.com/watch?v=3fF1r5nhQX4&list=PLEJXowNB4kPxBwaXtRO1qFLpCzF75DYrS&index=26

public class russianDoll {
    static int[] lis;
    public static void main(String[] args) {
        int[][] arr={{5,4}, {6,4},{6,7},{2,3}};
        //{2,3} {5,4} {6,4} {6,7}
        int[][] arr1=new int[4][2];
        Arrays.sort(arr, (a, b) -> a[0] - b[0]);
        System.out.println("array after sorting ");
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.println(arr[i][j]);

            }
        }
        lis=new int[4];
        for(int i=0;i<4;i++)
        {
            lis[i]=i;
        }

        lis(arr);
        int max=Integer.MIN_VALUE;
        for(int i=0;i<lis.length;i++)
        {

            if(lis[i]>max)
            {
                max=lis[i];
            }

        }
        System.out.println("max is "+max);
    }

    public static void lis(int[][] arr)
    {
       for(int i=1;i<arr.length;i++)
       {
           for(int j=0;j<i;j++)
           {
               if(arr[i][0]>arr[j][0] && arr[i][1]>arr[j][1] && lis[i]<=lis[j])
               {
                   lis[i]=1+lis[j];
               }
           }
       }
    }
}
