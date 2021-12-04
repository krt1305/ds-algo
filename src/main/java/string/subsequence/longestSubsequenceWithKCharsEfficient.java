package string.subsequence;

public class longestSubsequenceWithKCharsEfficient {
    public static void main(String[] args) {
        String s="geeksforgeeks";
        //output geeksforgeeks
        int k=2;
        lcs(s,k);

    }

    public static void lcs(String s,int k)
    {
        int[] occurArr=new int[26];
        for(int i=0;i<s.length();i++)
        {
            occurArr[s.charAt(i)-'a']++;
        }
        for(int i=0;i<occurArr.length;i++)
        {
            if(occurArr[i]==k) {
                int ascii=i+(int)'a';
                char ch = (char)ascii;
                System.out.println(ch);
            }

        }


    }
}
