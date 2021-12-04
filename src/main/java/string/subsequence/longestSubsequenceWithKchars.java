package string.subsequence;

import java.util.HashMap;

public class longestSubsequenceWithKchars {
    static HashMap<Character,Integer> occurMap=new HashMap();
    static int max=Integer.MIN_VALUE;
    public static void main(String[] args) {
        String s="geeksforgeeks";
        //output geeksforgeeks
        int k=2;
        System.out.println(lcs(s,k,0,0));


    }

    public static int lcs(String s ,int k,int i,int j)
    {

        while(j<s.length())
        {
            char ch=s.charAt(j);
            if(occurMap.containsKey(ch))
            {
                occurMap.put(s.charAt(j),occurMap.get(ch)+1);
            }
            else
                occurMap.put(s.charAt(j),1);

            if(occurMap.size()<k)
            {
                j++;
            }
            else if(occurMap.size()==k)
            {
                max=Math.max(max,j-i+1);
                j++;

            }
            else if(occurMap.size()>k)
            {
                while(occurMap.size()>k)
                {
                    occurMap.put(s.charAt(i),occurMap.get(ch)-1);
                    if(occurMap.get(s.charAt(i))==0) occurMap.remove(s.charAt(i));
                    i++;
                }
                j++;
            }

        }
        return max;
    }
}
