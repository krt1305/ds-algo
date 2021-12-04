package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedlistToArrayList {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<>();
        list.add("string1");
        list.add("string2");
        List<String> arrayList=new ArrayList<>(list);
        for(String str:arrayList)
        {
            System.out.println(str);

        }


    }
}
