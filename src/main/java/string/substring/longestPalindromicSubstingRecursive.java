package string.substring;

public class longestPalindromicSubstingRecursive {
    static int max=Integer.MIN_VALUE;
    public static void main(String[] args) {
       // String s1="bananas";
       // String s2="sananab";
        String s1="abcdef";
        String s2="abfc";
     //   StringBuffer sb=new StringBuffer(s);
     //   System.out.println("reverse string is "+sb.reverse().toString());
        System.out.println(lps(s1, s2,s1.length(),s2.length()));

    }


    public static int lps(String s1 ,String s2,int m,int n)
    {

        if(m==0 || n==0) return 0;

        if(s1.charAt(m-1)==s2.charAt(n-1))
        {
            return 1+ lps(s1,s2,m-1,n-1);

        }
        else return Math.max(lps(s1,s2,m-1,n),lps(s1,s2,m,n-1));
       // else return 0;
    }


}

