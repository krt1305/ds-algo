package arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class arrayReducedForm {
    static List<Integer> reducedForm=new ArrayList<>();
    static HashMap<Integer,Integer> reducedMap=new HashMap<>();
    static HashMap<Integer,Integer> tempMap=new HashMap<>();
    static int count=0;
    public static void main(String[] args) {
        int arr[]={10,40,20};
        for(int i=0;i<=arr.length-1;i++)
        {
            reducedForm.add(arr[i]);
        }
        tempMap=generateReducedForm(reducedForm);
        System.out.println("Map values-----");
        for(Map.Entry<Integer,Integer> entry:tempMap.entrySet())
        {
            System.out.println(tempMap.keySet() + "--- "+tempMap.values());
        }
    }

    public static HashMap<Integer,Integer> generateReducedForm(List<Integer> reducedForm)
    {
        if(reducedForm.size()==0) return reducedMap;
        int min=findMin(reducedForm);
        System.out.println("min--- "+min + "count--- "+count);
        reducedMap.put(min,count);
        reducedForm.remove(new Integer(min));
        System.out.println("After reducing list size is "+reducedForm.size());
        count++;
        generateReducedForm(reducedForm);
        return reducedMap;


    }

    static int findMin(List<Integer> reducedForm)
    {
        int min=reducedForm.get(0);
        for(int i=1;i<reducedForm.size();i++)
        {
            if(reducedForm.get(i)<min)
                min=reducedForm.get(i);
        }
        return min;
    }
}
