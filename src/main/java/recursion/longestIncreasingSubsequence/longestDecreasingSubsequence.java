package recursion.longestIncreasingSubsequence;

import java.util.ArrayList;
import java.util.List;

public class longestDecreasingSubsequence {
    static List<Integer> subset=new ArrayList<>();
    public static void main(String[] args) {
        int[] arr={5,8,7,1,9};
        for(int i=0;i<arr.length;i++)
        {
            subset.add(arr[i]);
            lds(arr,i);
        }

    }

    public static void lds(int[] arr,int start)
    {
        if(start==arr.length-1)
        {
            System.out.println("Subset");
            for(Integer i:subset)
            {
                System.out.print(i+ " --- ");
            }
            subset.clear();
            return ;
        }


        for(int i=start;i<arr.length;i++)
        {
            if(subset.size()>0) {
                if (subset.get(subset.size() - 1) >arr[i]) {
                    subset.add(arr[i]);
                    lds(arr, i + 1);
                }
            }

        }



    }
}
