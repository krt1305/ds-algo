package recursion;

import java.util.ArrayList;
import java.util.List;

public class perfectSquare {
    static List<Integer> subset=new ArrayList<>();
    public static void main(String[] args) {
        int sum=12;
        int arr[]=new int[sum];
        for(int i=0;i<12;i++)
        {
            arr[i]=i+1;
        }
       /* System.out.println("Elems are ");
        for(Integer i:arr)
        {
            System.out.println(i);
        }*/

        perfectSquareSubsets(arr,sum,0,subset);
    }


    public static void perfectSquareSubsets(int[] arr,int sum,int start,List<Integer> subset)
    {
       // System.out.println("sum is "+sum);
        if(sum==0)
        {
            System.out.println("Subset--");
            for(Integer i:subset)
            {
                System.out.print(i+" --- ");
            }
            return;
        }
        for(int i=start;i<arr.length;i++)
        {
            if(sum-(arr[i]*arr[i])>=0) {
                subset.add(arr[i]);
                perfectSquareSubsets(arr, sum - (arr[i] * arr[i]), i, subset);
                subset.remove(subset.size() - 1);
            }

        }

    }
}
