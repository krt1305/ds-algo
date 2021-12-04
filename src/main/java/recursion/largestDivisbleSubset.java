package recursion;

import java.util.ArrayList;
import java.util.List;

public class largestDivisbleSubset {
    static List<Integer> subsetList=new ArrayList<>();
    static int max=Integer.MIN_VALUE;
   // static int i;
    public static void main(String[] args) {
        int arr[]={3,5,10};
        subset(arr,0);

    }

    public static void subset(int[] arr,int start)
    {
        System.out.println("recursion");
        if(start==arr.length)
        {
            for(Integer i:subsetList)
            {
                System.out.print(i+" --- ");
            }
            System.out.println(" ");
            return ;
        }
        for(int i=start;i<arr.length;i++)
        {
            if(subsetList.size()==0)
            {
                    subsetList.add(arr[i]);
                    subset(arr,i+1);
                    subsetList.remove(subsetList.size()-1);

            }
            else {
                int top=subsetList.get(subsetList.size()-1);
                if(arr[i]%top==0){
                    subsetList.add(arr[i]);
                    subset(arr, i + 1);
                    subsetList.remove(subsetList.size() - 1);
                }


            }

        }


    }
}
