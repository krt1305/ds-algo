package string.substring;

import java.util.Collection;
import java.util.Collections;

public class Substring {
    public static void main(String[] args) {

        String s1="abc";
        for(int i=0;i<=s1.length();i++)
        {
            for(int j=i+1;j<=s1.length();j++)
                System.out.println(s1.substring(i,j));
        }


    }
}
