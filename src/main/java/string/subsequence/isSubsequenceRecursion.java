package string.subsequence;

public class isSubsequenceRecursion {
    //https://www.geeksforgeeks.org/given-two-strings-find-first-string-subsequence-second/
    public static void main(String[] args) {
        String str1="ABB";
        String str2="ADXCPY";
        System.out.println(isSubsequence(str1,str2,str1.length(),str2.length()));

    }
    public static boolean isSubsequence(String str1,String str2,int m,int n)
    {

        if(m==0) return true;
        if(n==0) return false;
        if(str1.charAt(m-1)==str2.charAt(n-1))
            return isSubsequence(str1,str2,m-1,n-1);
        //return (isSubsequence(str1,str2,m,n-1) || isSubsequence(str1,str2,m-1,n)) ;
        else
         return (isSubsequence(str1,str2,m,n-1));
    }
}
