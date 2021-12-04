package string.substring;

public class isSubstring {
    public static void main(String[] args) {
        String s1="foer";
        String s2="geeksforgeeks";
        System.out.println(isSubString(s1,s2));

    }

    public static boolean isSubString(String s1,String s2)
    {
        int m=s1.length();
        int n=s2.length();
        int i=0;int j=0;
        int startIndex=0;int lastIndex=0;
        while(j<s2.length() && i<s1.length())
        {
            System.out.println("in whiles");
            if(s1.charAt(i)==s2.charAt(j))
            {
                startIndex=i;
                i++;j++;
            }
                else {
                lastIndex=j;
                j++;
            }


        }
      //  if(lastIndex-startIndex==s1.length()) return true;
        System.out.println("i value "+i);
        if(i==s1.length()) return true;
        return false;

    }
}
