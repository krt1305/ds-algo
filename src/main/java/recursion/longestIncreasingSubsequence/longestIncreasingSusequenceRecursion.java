package recursion.longestIncreasingSubsequence;

import java.util.ArrayList;
import java.util.List;

public class longestIncreasingSusequenceRecursion {
    //https://afteracademy.com/blog/longest-increasing-subsequence
    static List<Integer> increasingSubsequence=new ArrayList<>();
    public static void main(String[] args) {
       // int arr[]={10,22,9,33,21,50,41,60};
        int arr[]={5,8,7,1,9};
        subSets(arr,0);

        // Because a single number can be a subsequence too
        int max_ans = 1;
        for(int i = 0;i<arr.length-1;i--) {
            max_ans = Math.max(max_ans, longestIncreasingSubsequence(arr, i));
        }
        System.out.println("max ans is "+max_ans);

    }

    public static void subSets(int arr[],int startIndex)
    {
        System.out.println("subset recursion ---");
      /*  if(startIndex>arr.length)
        {
            System.out.println("Returning" );
            for(Integer i:increasingSubsequence)
            {
                System.out.println(i);
            }
            return;
        }*/

      /*  if(arr[startIndex]>arr[startIndex+1]) {
            System.out.println("Subset---- ");
            for(Integer i:increasingSubsequence)
            {
                System.out.println(i);
            }
            return;
        }*/

        for(int i=startIndex;i<arr.length-1;i++)
        {
            if(arr[i]<arr[i+1])
            {
                increasingSubsequence.add(arr[i]);
                subSets(arr,i+1);
                increasingSubsequence.remove(increasingSubsequence.size()-1);
                subSets(arr,i+1);
            }
        }



    }


    public static int longestIncreasingSubsequence(int[] arr,int curr)
    {
        // Only one subsequence ends at first index, the number itself
        if(curr == 0)
            return 1;
        int ans = 1;
        for(int i = curr-1;i==0;i--) {
            if (arr[i] < arr[curr])
                ans = Math.max(ans, 1 + longestIncreasingSubsequence(arr, i));
        }
        return ans;

    }
}
