package string.substring;

import java.util.Iterator;
import java.util.TreeSet;

public class concatSubStringsLexicographicOrder {
    public static void main(String[] args) {
        String s="abc";
        TreeSet<String> subStrings=new TreeSet<>();
        for(int i=0;i<=s.length();i++)
        {
            for(int j=i+1;j<=s.length();j++)
            {
                System.out.println("Substring is "+s.substring(i,j));
                subStrings.add(s.substring(i,j));
            }
        }
        StringBuilder lexiOrder=new StringBuilder();
        Iterator<String> iterator=subStrings.iterator();
        while(iterator.hasNext())
        {
            lexiOrder.append(iterator.next());
           // System.out.println(iterator.next());
        }
        System.out.println("Lexi order is "+lexiOrder.toString());
    }
}
