package slidingWindow;

import java.util.ArrayList;
import java.util.List;

public class maxInSubArray {
    static int max=Integer.MIN_VALUE;
    static List<Integer> maxSubset=new ArrayList<>();
    public static void main(String[] args) {
        int arr[]={1,3,-1,-3,5,3,6,7};
        int k=3;
        maxSubarray(arr,k,0,0);
    }

    public static void maxSubarray(int[] arr,int k,int i,int j)
    {
        int p=0;
        while(j<arr.length)
        {

            while(maxSubset.size()>0 && arr[j]>maxSubset.get(p))
            {
                maxSubset.remove(p);//p++;

            }
            maxSubset.add(arr[j]);

            if(j-i+1<k) j++;
            else if(j-i+1==k)
            {

                if(arr[i]==maxSubset.get(0))
                {
                    maxSubset.remove(0);
                }

                i++;
                  j++;

            }
        }
        System.out.println("Max is "+maxSubset.get(0));


    }
}
