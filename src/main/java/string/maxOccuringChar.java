package string;

public class maxOccuringChar {
    public static void main(String[] args) {
        String str="abbc";
        int[] occurArr=new int[26];
        int max=Integer.MIN_VALUE;
        char ch = 0;

        for(int i=0;i<str.length()-1;i++)
        {
            occurArr[str.charAt(i)-'a']++;
            System.out.println("occur"+i + " is "+ occurArr[i]);
            if(occurArr[i]>max)
            {
                max=occurArr[i];
                ch=str.charAt(i);
            }
        }
        for(int i=0;i<occurArr.length;i++)
        {
            System.out.println(occurArr[i]);
        }

        System.out.println("max occurence is "+max);
        System.out.println("character is "+ch);
    }
}
