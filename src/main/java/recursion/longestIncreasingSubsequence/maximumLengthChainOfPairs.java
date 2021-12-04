package recursion.longestIncreasingSubsequence;

//https://www.youtube.com/watch?v=v-HIXptqM3Q&list=PLqM7alHXFySGbXhWx7sBJEwY2DnhDjmxm&index=16

import java.util.Arrays;

public class maximumLengthChainOfPairs   {
    static int[] lis;
    public static void main(String[] args) {
        int[][] arr={{5,24},{15,28},{27,40},{50,90}};
        //{5,24} {15,28} {27,40}  {50,90}
        // actual answer - {5,24} {27,40} {50,90}
        Arrays.sort(arr, (a, b) -> a[0] - b[0]);
        lis=new int[5];
        for(int i=0;i<5;i++)
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
                if(arr[i][0]>arr[j][0] && arr[i][1]>arr[j][1] && lis[i]<lis[j]+1)
                {
                    lis[i]=1+lis[j];
                }
            }
        }
    }

}
