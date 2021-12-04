package string;

public class stringinterleaving {
    public static void main(String[] args) {
        String a="AB";
        String b="CD";
        String c="ABCD";
        System.out.println(isInterLeaved(a,b,c));

    }

    public static boolean isInterLeaved(String a,String b,String c)
    {
        int len=c.length();
        int i=0;int j=0;int k=0;
        while(k<len)
        {
            System.out.println("inside while ");
            if(a.charAt(i)==c.charAt(k))
                i++;
            else if(b.charAt(j)==c.charAt(k))
                j++;
            else return false;
            k++;

        }

        if(i<a.length() || j<b.length()) return false;
        return true;

    }
}
