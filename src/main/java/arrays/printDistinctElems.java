package arrays;

import java.util.HashSet;

public class printDistinctElems {
    public static void main(String[] args) {
        int arr[]={12,10,9,45,2,10,10,45};
        HashSet<Integer> set=new HashSet<>();
        System.out.println("Distinct elems are ");
        for(int i=0;i<arr.length-1;i++)
        {
            if(!set.contains(arr[i]))
                System.out.println(arr[i]);

        }
    }
}
