package recursion;

import java.io.Serializable;
import java.util.*;

public class    combinationSumDuplicatesNotAllowed {
    static List<Integer> tempList=new ArrayList<>();
    public static void main(String[] args) {
        //duplicates in input should be removed

        int arr[]={2,2,4,6,8};
        int sum=8;
      /*  Set<Integer> set=new HashSet();
        set.add(1);
        set.add(9);*/
        Set<Integer> set=new HashSet();
        for(Integer i:arr)
        {
            set.add(i);
        }
        int arr1[]=new int[set.size()];
        int j=0;
        for(Integer i: set)
        {
            arr1[j++]=i;
        }
        System.out.println("new array after removing duplicates us ----");
        for(Integer i: arr1)
        {
            System.out.println(i);
        }
        combinationSum(arr1,sum,0,tempList);
        System.out.println("set size is "+ set.size());
    }

    static void combinationSum(int[] arr,int sum,int start,List<Integer> tempList)
    {
        if(sum <0) return;
        if(sum==0) {
            for (Integer i : tempList) {
                System.out.print(i + "---- ");

            }
            System.out.println(" ");
            return;
        }
        for(int i=start;i<arr.length;i++)
        {

                tempList.add(arr[i]);
                combinationSum(arr, sum - arr[i], i+1, tempList);
                tempList.remove(tempList.size() - 1);


        }

    }
}
