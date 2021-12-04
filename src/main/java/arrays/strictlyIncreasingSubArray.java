package arrays;

public class strictlyIncreasingSubArray {
    public static void main(String[] args) {
        int arr[]={1,2,2,4};
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]>arr[j-1])
                    count++;
                else break;
            }

        }
        System.out.println("count is "+count);
    }
}
