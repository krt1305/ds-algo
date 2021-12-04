package arrays;

public class pairSumClosetToX {
    public static void main(String[] args) {
        int arr[]={1,3,4,7,10};
        int x=54;
        int left=0;
        int right=arr.length-1;
        int diff=Integer.MAX_VALUE;

        while(left<right)
        {
            System.out.println("in while");
            if(Math.abs(x-(arr[left]+arr[right]))<diff)
            {
                diff=Math.abs(x-(arr[left]+arr[right]));
                left++;
                right--;
                System.out.println("Pair is "+arr[left] +" ----- "+arr[right]);
                System.out.println("diff is "+diff);

            }
            else if(arr[left]+arr[right]<x)
                left++;
            else right--;
        }
        System.out.println("Diff is "+diff);
        System.out.println("Pair is "+arr[left] +" ----- "+arr[right]);
    }
}
