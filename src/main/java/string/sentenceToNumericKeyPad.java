package string;

public class sentenceToNumericKeyPad {
    //https://www.youtube.com/watch?v=hE4Nn7o4GFw&list=PLqM7alHXFySE_Pxx_HsUSZGwiLpv9ziWA&index=73
    public static void main(String[] args) {
        String input="GEEKSFORGEEKS";
       // String input="GEE";
        String[] str={"2","22","222",
                    "3","33","333",
                    "4","44","444",
                    "5","55","555",
                "6","66","666",
                "7","77","777","7777",
                "8","88","888" ,
                "9","99","999","9999"};
        //2 -1 - A
        //22 -2  - B
        StringBuilder numeric=new StringBuilder();
        int index;
        for(int i=0;i<=input.length()-1;i++)
        {
            index=(int)input.charAt(i)-'A';
            System.out.println("index is "+index);
            System.out.println("number at index "+index + " is "+str[index]);
            numeric.append(str[index]);
        }
        System.out.println("Sequence is "+numeric.toString());


    }
}
