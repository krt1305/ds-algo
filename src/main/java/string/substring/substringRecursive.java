package string.substring;

public class substringRecursive {
    static int max=Integer.MIN_VALUE;
   // https://stackoverflow.com/questions/13197696/using-recursion-to-generate-all-substrings-of-a-given-string/13197884
    public static void main(String[] args) {
        String s1="abaradar121";
        String curr="";


      //  substrings(s1,i+1,String.valueOf(s1.charAt(i)));
        substrings(s1,"");
        System.out.println("Max length is "+max);

    }


    public static void substrings(String s,String curr)
    {
        if(s.length()==0)
        {
            System.out.println(curr);
            if(isPalindrome(curr))
            {
                max=Math.max(max,curr.length());
            }
            return;

        }


        substrings(s.substring(1), curr+s.substring(0,1));
        substrings(s.substring(1), curr);
    }


    public static boolean isPalindrome(String s)
    {
        int n=s.length();
        for(int i=0;i<s.length()/2;i++)
        {
            if(s.charAt(i)!=s.charAt(n-(i+1)))
            {
                return false;
            }
        }
        return true;
    }
}
