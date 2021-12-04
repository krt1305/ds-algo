package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class test {
    public static List<Integer> list=new ArrayList<>();
    public static int combineParts(List<Integer> parts) {
        int sum=0;
        if(parts.size()==1)
            return 0;
        Collections.sort(parts);
        List<Integer> sortedList=new ArrayList(parts);
        System.out.println("sorted list ");
        for(Integer i:sortedList)
        {
            System.out.println(i);
        }
        sum=sortedList.get(0)+sortedList.get(1);
        System.out.println("sum is "+sum);
        sortedList.remove(0);
        sortedList.remove(1);
        List<Integer> tempList=new ArrayList<>();
        tempList.add(sum);
        for(Integer i:sortedList)
        {
            tempList.add(i);
        }
        sum= combineParts(tempList);
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> parts=new ArrayList<>();
        parts.add(8);
        parts.add(4);
        parts.add(6);
        parts.add(12);
        combineParts(parts);



    }
}
