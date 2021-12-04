package recursion;

import java.util.ArrayList;
import java.util.List;
//https://www.youtube.com/watch?v=Z3N3H77uZTM&list=PLNxqWc8Uj2LRX8GaMJFeRE0Nx5gLBxBBX&index=13

public class diceRollSum {
    static List<Integer> subSet=new ArrayList<>();
    static List<List<Integer>> diceRolls=new ArrayList();
    public static void main(String[] args) {
        int arr[]={1,2,3};
        int sum=4;
        greatestSum(arr,sum,subSet,0);
        System.out.println("Total dice rolls "+diceRolls.size());

    }

    public static void greatestSum(int [] arr,int sum,List<Integer> subSet,int start)
    {
        if(sum<0)
            return;
        if(sum==0)
        {
            System.out.println("Subset size is -- "+subSet.size());
            for(Integer i:subSet)
            {
                System.out.print(i+" --- ");
            }
            diceRolls.add(subSet);
            return;
        }

        for(int i=start;i<arr.length;i++ )
        {
            subSet.add(arr[i]);
            greatestSum(arr,sum-arr[i],subSet,i);
            subSet.remove(subSet.size()-1);
        }

    }
}
