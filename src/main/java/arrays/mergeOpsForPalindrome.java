package arrays;

public class mergeOpsForPalindrome {
    //https://www.youtube.com/watch?v=wBGxPHXAPM4&list=PLqM7alHXFySEQDk2MDfbwEdjd2svVJH9p&index=25
    public static void main(String[] args) {

        //int arr[]={1,4,5,1}; -1
        int arr[]={11,14,15,99};

        int i=0;int n=arr.length-1;
        int j=n;
        int count=0;
        while(i<n && j>0)
        {
            if(arr[i]==arr[j])
            {
                i++;
                j--;
            }
            else if(arr[i]>arr[j])
            {
                j--;
                arr[j-1]=arr[j-1]+arr[j];
                count++;
            }
            else if(arr[i]<arr[j])
            {
                i++;
                arr[i+1]=arr[i+1]+arr[i];
                count++;
            }
        }
        System.out.println("Count is "+count);


    }
}
