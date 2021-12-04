package arrays;

//https://www.youtube.com/watch?v=Glv9KXC0lgE&list=PLqM7alHXFySEQDk2MDfbwEdjd2svVJH9p&index=84
public class IncreasingsubsequenceMaxProduct {
    public static void main(String[] args) {
        int arr[]={1,5,10,8,9};
        increasingSubsequence(arr);
    }

    public static void increasingSubsequence(int arr[])
    {
        // for every element find next greater to left and next greater to right
        // check product and find max
        int max=Integer.MIN_VALUE;
        int ngl[]=new int[arr.length];
        int ngr[]=new int[arr.length];
        ngl=nextGreaterToLeft(arr);
        ngr=nextGreaterToRight(arr);
          for(int i=0;i<arr.length-1;i++)
          {
            if(ngr[i]*ngl[i]*arr[i]>max)
                max=ngr[i]*ngl[i]*arr[i];
          }
        System.out.println("Max is "+max);

    }

    public static int[] nextGreaterToLeft(int[] arr)
    {
        int tempArr[]=new int[arr.length];
        int max=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                tempArr[i]=arr[i];
            }
            else
            {
                tempArr[i]=max;
            }
        }

        return tempArr;

    }

    public static int[] nextGreaterToRight(int[] arr)
    {
        int tempArr[]=new int[arr.length];
        int max=arr[arr.length-1];

        for(int i=arr.length-2;i>=0;i--)
        {
            if(arr[i]>max)
            {
                tempArr[i]=arr[i];
            }
            else {
                tempArr[i]=max;
            }
        }

        return tempArr;

    }


}
