package slidingWindow;

public class maxSumSubarrayK {

    static int sum=0;
    static int max=Integer.MIN_VALUE;
    public static void main(String[] args) {
        int arr[]={2,5,1,8,2,9,1};
        int k=3;
        maxSumSubarray(arr,k,0,0);
    }


    public static void maxSumSubarray(int[] arr,int k,int i,int j)
    {

       while(j<arr.length)
       {
           sum=sum+arr[j];
           if(j-i+1<k)
           {
               j++;
           }
           else if(j-i+1==k)
           {

               max=Math.max(sum,max);
               sum=sum-arr[i];
               i++;
               j++;

           }
           System.out.println("j is "+j);
       }
        System.out.println("max is "+max);


    }

}

