package recursion.uniquePaths;

import java.util.ArrayList;
import java.util.List;

public class combinationDifference {
    static List<Integer> tempList=new ArrayList<>();
    static int arrSum=0;
    static int sum=0;
    public static void main(String[] args) {
        int arr[]={1,1,2,3};
        int diff=1;
        for(int i=0;i<arr.length;i++)
        {
            arrSum=arrSum+arr[i];
        }
        sum=(diff+arrSum)/2;
        System.out.println("sum is "+sum);

        subsetDiff(arr,0,sum);
        //s1-s2=diff

    }

    public static void subsetDiff(int[] arr,int start,int sum)
    {

       if(sum==0)
       {
           System.out.println("IN diff ");
           for(Integer i:tempList)
           {
               System.out.print(i+"---- ");

           }
           System.out.println(" ");
           return;

       }

       for(int i=0;i<arr.length;i++)
       {
           if(sum-arr[i]>=0)
           {
               tempList.add(arr[i]);
               subsetDiff(arr,i+1,sum-arr[i]);
               tempList.remove(tempList.size()-1);

           }
       }

    }
}
