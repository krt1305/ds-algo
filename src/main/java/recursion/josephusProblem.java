package recursion;

//https://www.geeksforgeeks.org/josephus-problem-set-1-a-on-solution/
public class josephusProblem {
    public static void main(String[] args) {
        int n=5;
        int k=2;
        System.out.println(josephus(n,k));


    }

    static int josephus(int n,int k)
    {
        if(n==1) return 1;
        else
            return 1+ (josephus(n-1,k)+ k-1)% n;
    }
}
