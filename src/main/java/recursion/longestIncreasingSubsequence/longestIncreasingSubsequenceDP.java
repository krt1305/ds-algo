package recursion.longestIncreasingSubsequence;

public class longestIncreasingSubsequenceDP {
    static  int[] lis;
    public static void main(String[] args) {
       // int arr[]={5,8,7,1,9};
        int arr[]={1,11,2,10,4,5,2,1};

        lis=new int[arr.length];
        for(int i=0;i<lis.length;i++)
        {
            lis[i]=1;
        }
        longestIncreasingSubsequence(arr);
        int max=lis[0];
        for(int i=1;i<lis.length;i++)
        {
            if(lis[i]>max)
                max=lis[i];

        }
        System.out.println("max is "+max);

        //lis(arr);
    }

    public static void longestIncreasingSubsequence(int[] arr)
    {
        for(int i=1;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    if(lis[i]<=lis[j])
                        lis[i]=1+lis[j];
                }
            }
        }

    }
}
