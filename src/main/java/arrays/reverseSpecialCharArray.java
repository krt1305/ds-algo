package arrays;

public class reverseSpecialCharArray {
    public static void main(String[] args) {
        String str="a,b$c";
        int i=0;
        int n=str.length()-1;
        int j=0;
        while(i<n && j>0)
        {
            if(!isSpecialChar(str,i) && !isSpecialChar(str,j))
            {
                //reverse
                char iTemp=str.charAt(i);
                char jTemp=str.charAt(j);
                str.replace(str.charAt(i),jTemp);
                str.replace(str.charAt(j),iTemp);

            }
            else if(isSpecialChar(str,i) && !isSpecialChar(str,j))
            {
                i++;
            }
            else
            {
                j--;
            }

        }




    }

    public static boolean isSpecialChar(String str,int i)
    {
        if(str.charAt(i)>='a' && str.charAt(i)<='z' || Integer.valueOf(str.charAt(i))>=0 && Integer.valueOf(str.charAt(i))<=9 )
            return false;
        return true;
    }

}
