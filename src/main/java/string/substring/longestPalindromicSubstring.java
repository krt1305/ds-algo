package string.substring;

public class longestPalindromicSubstring {
    public static void main(String[] args) {
        //genrate all substrings and check the largest one
        String str="forgeeksskeegfor";
        //String str="iiii";
        System.out.println("Substrings are ");
        int maxLen=Integer.MIN_VALUE;
        String lps = null;
        String tempString;
        for(int i=0;i<str.length()-1;i++)
        {
            for(int j=i+1;j <str.length()-1;j++)
            {
                   tempString=str.substring(i,j);
                   if(isPalindrome(tempString)) {
                       System.out.println(tempString + " is palindrome "+ " length is "+tempString.length());
                     if (tempString.length() > maxLen) {
                         maxLen=tempString.length();
                         lps = tempString;
                     }
                 }
            }
        }
        System.out.println("lps is "+lps);

    }

    public static boolean isPalindrome(String str)
    {
        int j=0;
        for(int i=str.length()-1;i>0;i--)
        {
            if(str.charAt(i)!=str.charAt(j))
                return false;
            else j++;

        }
       return true;
    }
}
