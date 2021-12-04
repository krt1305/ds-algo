package string.subsequence;

public class dict {
    static int max=Integer.MIN_VALUE;
    static String maxWord="";
    public static void main(String[] args) {
        String word="abpcplea";

        String[] dict={"ale","apple","monkey","plea"};
        maxLenWord(dict,word);

    }

    public static void maxLenWord(String[] dict,String word)
    {

        for(String s:dict)
        {
            if(isSubsequence(s,word))
            {
                System.out.println("Is subsequence ---"+s);
                if(s.length()>max) {
                    max = Math.max(max, s.length());
                    maxWord=s;
                }

            }
          /*  if(isSubsequence1(s,word,s.length(),word.length()))
            {
                System.out.println("Is subsequence ---"+s);
                if(s.length()>max) {
                    max = Math.max(max, s.length());
                    maxWord=s;
                }


            }*/
        }
        System.out.println("Max word --"+maxWord);


    }

    public static boolean isSubsequence(String s, String word)
    {

        int m=s.length();
        int n=word.length();
        int i=0,j=0;
        while(i<m && j<n)
        {
            if(s.charAt(i)==word.charAt(j))
            {
                i++;j++;
            }
            else
                j++;
        }
        if(i==s.length()) return true;
        else return false;


    }

    public static boolean isSubsequence1(String s, String word,int m,int n)
    {

        if(m==0) return true;
        if(n==0) return false;

        if(s.charAt(m-1)==word.charAt(n-1))
           return isSubsequence1(s,word,m-1,n-1);
        else
           return isSubsequence1(s,word,m,n-1);

    }
}
