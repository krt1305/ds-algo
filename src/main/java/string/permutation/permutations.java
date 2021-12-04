package string.permutation;

import java.util.ArrayList;
import java.util.List;

public class permutations {
    public static List<String> ans=new ArrayList<>();
    public static void main(String[] args) {
        String str="aab";
        int start=0;
        int end=str.length();
        List <String> ans=permutation(str,start,end);
        for(String s:ans)
        {
            System.out.println(s);
        }



    }

    public static String swapString(String str,int i,int j)
    {
        char[] b=str.toCharArray();
        char ch;
        ch=b[i];
        b[i]=b[j];
        b[j]=ch;
        return String.valueOf(b);

    }

    public static List<String> permutation(String str,int start,int end)
    {

        if(start==end-1)
            ans.add(str);
        else
        {
            for(int i=start;i<=end;i++)
            {
                System.out.println("in for loop");
                    str=swapString(str,start,i);
                    permutation(str,start+1,end);
                    str=swapString(str,start,i);

            }
        }
        return ans;

    }


}
