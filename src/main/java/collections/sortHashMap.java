package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class sortHashMap {
    public static void main(String[] args) {
        HashMap<Integer,String> map=new HashMap<>();
        map.put(10,"a");
        map.put(1,"c");
        map.put(0,"v");

        TreeMap<Integer,String> treeMap=new TreeMap<>(map);
        for(Map.Entry<Integer,String> entrySet:treeMap.entrySet())
        {
            System.out.println(entrySet.getKey());
           // System.out.println(entrySet.getValue());
        }
    }
}
