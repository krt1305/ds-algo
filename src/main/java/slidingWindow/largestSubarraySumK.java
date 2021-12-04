package slidingWindow;

import java.util.ArrayList;
import java.util.List;

public class largestSubarraySumK {
    static List<Integer> maxSubset=new ArrayList<>();
    static int currSum=0;
    static int max=Integer.MIN_VALUE;
    public static void main(String[] args) {
        int arr[]={4,1,1,1,2,3,5};
        int sum=6;
        subset(arr,0,0,sum);

    }

    public static void subset(int[] arr,int i,int j,int sum )
    {
        while(j<arr.length)
        {
            currSum=currSum+arr[j];
            if(currSum<sum)
            {
                j++;
            }
            else if(currSum==sum)
            {
                if(j-i+1>max)
                {
                    max=j-i+1;
                }
            }
            else if(currSum>sum)
            {

                while(currSum>sum)
                {
                    currSum=currSum-arr[i];
                    i++;
                }
                j++;

            }
        }
        System.out.println("Max is "+max);

    }
}
