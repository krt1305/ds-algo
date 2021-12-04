package recursion.longestIncreasingSubsequence;

public class longestDecreasingDP {
    static  int[] lds;
    public static void main(String[] args) {
       // int arr[]={5,8,7,1,9};
        int arr[]={1,11,2,10,4,5,2,1};

        lds=new int[arr.length];
        for(int i=0;i<lds.length;i++)
        {
            lds[i]=1;
        }
        lds(arr);
        int max=lds[0];
        for(int i=1;i<lds.length;i++)
        {
            if(lds[i]>max)
                max=lds[i];

        }
        System.out.println("max is "+max);

        lds(arr);
    }

    public static void lds(int[] arr)
    {
        for(int i=1;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(arr[i]<arr[j])
                {
                    if(lds[i]<=lds[j])
                        lds[i]=1+lds[j];
                }
            }
        }

    }
    }




