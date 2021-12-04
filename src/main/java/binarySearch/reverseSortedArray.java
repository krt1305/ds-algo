package binarySearch;

public class reverseSortedArray {
    public static void main(String[] args) {
        int arr[]={13,12,10,9,8,4};
        int elem=4;
        int low=0;
        int high=arr.length-1;
        System.out.println(binarySearch(arr,low,high,elem));

    }

    public static int binarySearch(int arr[],int low ,int high,int elem)
    {
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]==elem)
                return mid;
            else if(arr[mid]>elem)
                low=mid+1;
            else
                high=mid-1;
        }
        return -1;
    }
}
