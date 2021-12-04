package listQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class removeItemsFromList {

    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(2);
        list.add(3);
        list.add(40);

        Collections.sort(list);
        System.out.println("sorted collection");
        {
            for (Integer i:list)
            {
                System.out.println(i);
            }
        }
        int sum=list.get(0)+list.get(1);
        System.out.println("List size before removing "+list.size());
        list.remove(0);
        list.remove(1);
        list.add(sum);
        System.out.println("List size after removing ----"+list.size());
        System.out.println("List is ");
        for(int i:list)
        {
            System.out.println(i);
        }
        Collections.sort(list);
        System.out.println("sorted collection after sum ");
        {
            for (Integer i:list)
            {
                System.out.println(i);
            }
        }
    }
}
