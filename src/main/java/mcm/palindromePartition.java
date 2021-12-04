package mcm;

public class palindromePartition {
    public static void main(String[] args) {
        //https://www.youtube.com/watch?v=fOUlNlawdAU&list=PL_z_8CaSLPWekqhdCPmFohncHwz8TY2Go&index=37
        String s="nitik";

        System.out.println(palindromePartition(s,0,s.length()-1));
    }

    public static int palindromePartition(String s,int i,int j)
    {
        if(i>=j) return 0;
        int min=Integer.MAX_VALUE;
        for(int k=i;k<=j-1;k++)
        {
            int temp=palindromePartition(s,i,k)+palindromePartition(s,k+1,j)+1;
            min=Math.min(min,temp);

        }
        return min;
    }
}
