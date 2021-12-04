package StringBuffer;

import javax.sound.midi.SoundbankResource;

public class charOccurence {
    public static void main(String[] args) {
        int[] occurence=new int[26];
        String s="aabc";

        for(int i=0;i<s.length()-1;i++)
        {
            occurence[s.charAt(i)-'a']++;
        }

        for(Integer i:occurence)
        {
            System.out.println(i);
        }
    }
}
