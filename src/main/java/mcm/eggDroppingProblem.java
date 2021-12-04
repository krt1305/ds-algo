package mcm;

public class eggDroppingProblem {
    //https://www.youtube.com/watch?v=S49zeUjeUL0&list=PL_z_8CaSLPWekqhdCPmFohncHwz8TY2Go&index=44
    public static void main(String[] args) {
        int eggs=5;
        int floors=10;
        System.out.println(eggDropping(eggs,floors));
    }


    public static int eggDropping(int n,int f)
    {
        if(f==0 || f==1)
            return f;
        if(n==1)
            return f;
        int min=Integer.MAX_VALUE;
        //floor n - 1) egg breaks k th floor- n-1,f 2) egg doesn't break f+1,n
        for(int k=1;k<=f;k++)
        {
           int temp=1+Math.max(eggDropping(n-1,k-1),eggDropping(n,f-k));
           min=Math.min(min,temp);
        }

        return min;
        //return eggDropping(n-1,f);
    }

}
