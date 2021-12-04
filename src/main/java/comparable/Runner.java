package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Runner {
    public static void main(String[] args) {

        List<Laptop> laptopList = new ArrayList();
        laptopList.add(new Laptop("dell", 100, 10000));
        laptopList.add(new Laptop("apple", 90, 400));
        Collections.sort(laptopList);

        for (Laptop lap : laptopList) {
            System.out.println(lap);
        }

        Comparator<Laptop> com = new Comparator<Laptop>() {
            public int compare(Laptop o1, Laptop o2) {
                if (o1.getPrice() > o2.getPrice())
                    return 1;
                else
                    return -1;
            }
        };
        System.out.println("Comparator------------");

        Collections.sort(laptopList,com);

        for (Laptop lap : laptopList) {
            System.out.println(lap);
        }
    }
}
