package lcs;

public class longestPalindromicSubsequence {
    public static void main(String[] args) {
        String s1="agbcba";
        String s2=new StringBuilder(s1).reverse().toString();
        System.out.println(lps(s1,s2,s1.length(),s2.length()));
    }


    public static int lps(String s1,String s2,int m ,int n)
    {
        if(m==0 || n==0)
            return 0;
        if(s1.charAt(m-1)==s2.charAt(n-1))
            return 1+lps(s1,s2,m-1,n-1);
        return Math.max(lps(s1,s2,m,n-1),lps(s1,s2,m-1,n));
    }

}
