package arrays;

import java.util.ArrayList;
import java.util.List;

public class leadersInArray {
    public static void main(String[] args) {
        int arr[]={16,17,4,3,5,2};
        List<Integer> leaders=new ArrayList<>();
        for(int i=arr.length-1;i>0;i--)
        {
            System.out.println("for loop "+i);
            if(i==arr.length-1)
            {
                leaders.add(arr[i]);
                continue;
            }
            if(arr[i]>leaders.get(leaders.size()-1))
            {
                leaders.add(arr[i]);
            }

        }
        System.out.println("Leaders are");
        for(Integer i:leaders)
        {
            System.out.println(i);
        }
    }
}
