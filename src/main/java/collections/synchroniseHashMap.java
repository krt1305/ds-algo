package collections;

import java.util.*;

//https://javahungry.blogspot.com/2017/11/how-to-synchronize-hashmap-in-java-with-example.html
public class synchroniseHashMap {
    public static void main(String[] args) {

        // Creating a HashMap of Integer keys and String values
        HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
        hashmap.put(1, "Value1");
        hashmap.put(2, "Value2");
        hashmap.put(3, "Value3");
        hashmap.put(4, "Value4");
        hashmap.put(5, "Value5");
        Map map= Collections.synchronizedMap(hashmap);
        Set set = map.entrySet();
        //synchronized(map){
            Iterator i = set.iterator();
            // Display elements
            while(i.hasNext()) {
                Map.Entry pair = (Map.Entry)i.next();
                System.out.print(pair.getKey() + ": ");
                System.out.println(pair.getValue());
            }
        //}
    }
    }

