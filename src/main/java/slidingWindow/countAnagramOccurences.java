package slidingWindow;

import java.util.HashMap;

public class countAnagramOccurences {
    public static void main(String[] args) {
        String s1="forxxorfxdofr";
        String s2="for";
        countOccur(s1,s2);

    }

    public static void countOccur(String s1,String s2)
    {
        int i=0,j=0;
        HashMap<Character,Integer> countMap=new HashMap<>();
        for(Character ch:s2.toCharArray())
        {
            if(countMap.containsKey(ch)){}
                else countMap.put(ch,1);
        }
        //put all chars of s2 in map
        //now check chars in s1 and if it is present in s1
        //if window length is not s2.length continue
        int windowLen=s2.length();
        int anagramCount=0;
        int count=countMap.size();
        while(j<s1.length())
        {
            if(countMap.containsKey(s1.charAt(j))){
                count--;
                countMap.put(s1.charAt(j),countMap.get(s1.charAt(j))-1);
            }
            if(j-i+1<windowLen)
            {
                j++;
            }
            if(countMap.size()==windowLen)
            {
                //increase anagram count
                System.out.println("Increasing anagram count");
                if(count==0) {
                    anagramCount++;
                }
            }

            i++;
            j++;

        }
        System.out.println("Anagram count is "+anagramCount);

    }
}
