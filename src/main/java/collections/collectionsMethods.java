package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class collectionsMethods {
    public static void main(String[] args) {

        int[] a={1,4,0,9};
        String[] str={"a","b","c"};
        ArrayList<String> list=new ArrayList<>();
        list.add("r");
        list.add("a");
        Collections.sort(list);
        System.out.println("Sorted list in ascending order "+list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println("Sorted list in descending order "+list);
        System.out.println("Max elem "+Collections.max(list));
        System.out.println("Min elem "+Collections.min(list));


    }
}
