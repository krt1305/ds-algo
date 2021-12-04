package string;

import static java.lang.Math.abs;

public class stringBetweenTwoStrings {
    public static void main(String[] args) {
        String s1="aaa";
        String s2="ccc";
        for(int i=0;i<s1.length();i++)
        {

            int ascii=abs((int)s1.charAt(i)-(int)s2.charAt(i));

        }
    }
}
