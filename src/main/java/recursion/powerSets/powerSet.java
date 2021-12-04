package recursion.powerSets;

import java.util.ArrayList;
import java.util.List;

public class powerSet
{
    static List<Integer> subsets=new ArrayList<>();
    public static void main(String[] args) {
        int arr[]={10,22,9,33,21,50,41,60};
        subsets(arr,0);

    }

    public static void subsets(int [] arr,int startIndex)
    {
        /*if(startIndex>arr.length)
        {
            return;
        }*/

        for(int i=0;i<arr.length;i++)
        {
            subsets.add(arr[i]);
            for(int j=0;j<i;j++)
            {
                //permute
                subsets.add(arr[j]);
              //  subsets(arr,j);
            }
            System.out.println("Subset---------");
            for(Integer k:subsets)
            {
                System.out.print(k+" ----- ");
            }
            subsets.clear();
        }

    }
}
