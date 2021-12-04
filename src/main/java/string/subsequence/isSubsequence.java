package string.subsequence;

public class isSubsequence {
    public static void main(String[] args) {
        String str1="foks";
        String str2="geeksforgeeks";
        System.out.println(isSubsequence(str1,str2));


    }

    public static boolean isSubsequence(String str1,String str2)
    {

        int i=0;int j=0;
        while(j<str2.length() && i<str1.length())
        {
            if(str1.charAt(i)==str2.charAt(j)) {
                i++;
                j++;
            }
            else
                j++;

        }
        System.out.println("I value is --"+i + " j value --- "+j);
        if(i==str1.length())
            return true;
        else return false;
    }
}
