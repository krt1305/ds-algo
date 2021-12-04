package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class pairsWithSum {
    public static void main(String[] args) {
        int arr[]={1,5,7,-1};
        int sum=6;
        List<Integer> pairList=new ArrayList<>();
        for(int i:arr)
        {
            pairList.add(i);
        }
        System.out.println(pairList.get(0));

        for(int i=0;i<=arr.length-1;i++)
        {
            System.out.println(pairList.contains(sum-arr[i]));
            System.out.println("in for ");
            if(pairList.contains(sum-arr[i]))
            {
                System.out.println("Pair --- "+arr[i] + " ---- "+(sum-arr[i]));
            }
        }


    }
}
