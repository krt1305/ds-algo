package string.substring;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class kDistinctSubString {
    public static void main(String[] args) {
        String s="abc";
        int count;
        HashMap<Character,Integer> occurMap=new HashMap<>();
        int i=0;int j=0;
        int k=2;
        List<String> subStrings=new ArrayList<>();

        while(j<s.length())
        {
            char ch=s.charAt(j);
                if (occurMap.containsKey(ch)) {
                   // System.out.println("Incrementing map count value");
                    occurMap.put(ch, occurMap.get(ch) + 1);
                } else {
                   // System.out.println("putting 1 in mmap");
                    occurMap.put(ch, 1);
                }

        if(occurMap.size()<k) {
            j++;
        }
            else if(occurMap.size()==k) {
                System.out.println("map size is equal to "+k);
                System.out.println("j ---- "+j +" i----- "+i);
                System.out.println("Sliding window is "+(j-i+1));
                System.out.println("substring is "+s.substring(i, j-i+1));
                System.out.println("");
                subStrings.add(s.substring(i, j-i+1));
                occurMap.remove(s.charAt(i));
                i++;
                j++;

            }
      /*      else if(occurMap.size()>k)
        {
            while(occurMap.size()>k)
            {
                occurMap.put(s.charAt(i),occurMap.get(s.charAt(i)-1));
                if(occurMap.get(s.charAt(i))==0)
                    occurMap.remove(s.charAt(i));
                i++;
            }
            j++;
        }*/

        }
        System.out.println("subStrings size is "+subStrings.size());
        for(String s1: subStrings){
            System.out.println(s1);
        }




    }
}
