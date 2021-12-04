package recursion;

import java.util.ArrayList;
import java.util.List;

public class greatestSumDivisbleBy3 {
    static List<Integer> subSet=new ArrayList<>();
    static int max=Integer.MIN_VALUE;
    public static void main(String[] args) {
        int arr[]={3,6,5,1,8};
        int sum=0;
        greatestSum(arr,sum,subSet,0);

    }

    public static void greatestSum(int [] arr,int sum,List<Integer> subSet,int start)
    {
        if(sum%3==0)
        {
            System.out.println("Subset size is -- "+subSet.size());
            for(Integer i:subSet)
            {
                System.out.print(i+" --- ");
            }
            if(sum>max)
                max=sum;
            return;
        }

        for(int i=start;i<arr.length;i++ )
        {
            if((sum+arr[i])%3==0) {
                subSet.add(arr[i]);
                greatestSum(arr, sum + arr[i], subSet, start + 1);
                subSet.remove(subSet.size() - 1);
            }
        }

    }
}
