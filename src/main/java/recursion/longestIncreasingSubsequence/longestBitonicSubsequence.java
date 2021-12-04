package recursion.longestIncreasingSubsequence;

public class longestBitonicSubsequence {
    static int lis[];
    static int lds[];
    static int lbs[];
    public static void main(String[] args) {
        int arr[]={1,11,2,10,4,5,2,1};
        lis=new int[arr.length];
        lds=new int[arr.length];
        lbs=new int[arr.length];
        for(int i=0;i<lis.length;i++) {
            lis[i] = 1;
            lds[i] = 1;
        }
        lis(arr);
        lds(arr);
        int max=Integer.MIN_VALUE;
        for(int i=0;i<lbs.length;i++)
        {
            lbs[i]=lis[i]+lds[i]-1;
            if(lbs[i]>max)
            {
                max=lbs[i];
            }

        }

        System.out.println("max is "+max);
    }


    public static void lis(int[] arr)
    {
        for(int i=1;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    if(lis[i]<=lis[j])
                    {
                        lis[i]=1+lis[j];
                    }
                }
            }
        }


    }

    public static void lds(int[] arr){

        for(int i=1;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(arr[i]<arr[j])
                {
                    if(lds[i]<=lds[j])
                    {
                        lds[i]=1+lds[j];
                    }
                }
            }
        }
    }
}
