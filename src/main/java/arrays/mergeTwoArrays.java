package arrays;

public class mergeTwoArrays {
    public static void main(String[] args) {
        int arr[]={2,0,7,0,0,10,0};
        int arr1[]={5,8,12,14};

        int m=arr.length-1;
        int n=arr1.length;
        int i=0;int j=0;
        while(i<m && j<n)
        {
            if(arr[i]<arr1[j])
            {
                i++;
            }
            if(arr[i]==0)
            {
                arr[i]=arr1[j];
                j++;
            }

        }
        System.out.println("final merged array is ");
        for(Integer k:arr)
        {
            System.out.println(k);
        }
    }
}
