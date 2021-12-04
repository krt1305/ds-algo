package string;

public class evenSubstringsDigit {
    public static void main(String[] args) {
        String str="15";
        int totalSubstrings=0;
        int evenSubStrings=0;
        for(int i=0;i<=str.length();i++)
        {
            for(int j=i+1;j<=str.length();j++)
            {
                System.out.println(str.substring(i,j));
                int num=Integer.parseInt(str.substring(i,j));
                if(num%2==0){
                    evenSubStrings++;
                }
                    totalSubstrings++;
            }
        }
        System.out.println("totalSubstrings is "+totalSubstrings);
        System.out.println("even substrings is "+evenSubStrings);
    }
}
