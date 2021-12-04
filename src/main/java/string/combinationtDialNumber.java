package string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class combinationtDialNumber {
    public static void main(String[] args) {
        String phoneNo="23";
        //2 - A,B , C
        HashMap<Character,String> map=new HashMap<>();
        map.put('2',"ABC");
        map.put('3',"DEF");
        map.put('4',"GHI");
        map.put('5',"JKL");
        map.put('6',"MNO");
        map.put('7',"PQRS");
        map.put('8',"TUV");
        map.put('9',"WXYZ");
        map.put('1',"1");
        map.put('0',"0");
        generatePhoneCombinations(map,phoneNo,0,new StringBuilder(""));


    }

    public static void generatePhoneCombinations(HashMap<Character,String> map,String phoneNo,int start,StringBuilder str)
    {

            if(start==phoneNo.length()){
                System.out.println(str +" ");
                return;
            }
            String s=map.get(phoneNo.charAt(start));
            for(int j=0;j<s.length();j++)
            {
                str.append(s.charAt(j));
                generatePhoneCombinations(map,phoneNo,start+1,str);
                str.deleteCharAt(str.length()-1);
            }

    }



}
