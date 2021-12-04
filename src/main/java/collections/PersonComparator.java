package collections;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {

    public int compare(Person o1, Person o2) {
        if(o1.getAge()==o2.getAge())
            return o1.getFirstName().compareToIgnoreCase(o2.getFirstName());
        else if (o1.getAge()>o2.getAge())
            return -1;
        return 1;
    }
}
