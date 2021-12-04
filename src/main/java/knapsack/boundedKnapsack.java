package knapsack;

public class boundedKnapsack {
    public static void main(String[] args) {

    }


    public static int knapSack(int wt[],int val[],int w,int n)

    {
        if(w==0 || n==0) return 0;
        if(wt[n-1]<=w)
           return Math.max(val[n-1]+knapSack(wt,val,w-wt[n-1],n-1),knapSack(wt,val,w,n-1));
        else
           return knapSack(wt,val,w,n-1);


    }
}
