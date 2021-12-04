package collections;

import java.util.HashSet;

//https://javahungry.blogspot.com/2017/11/convert-hashset-to-array-in-java-with-example.html
public class HashSetToArray {
    public static void main(String[] args) {
        HashSet<String> hashSet=new HashSet<>();
        hashSet.add("abc");
        hashSet.add("cde");
        String[] strings=new String[hashSet.size()];
        hashSet.toArray();
        for(String str1:strings)
        {
            System.out.println(str1);
        }

    }
}
