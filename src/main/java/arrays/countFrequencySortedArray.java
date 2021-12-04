package arrays;

public class countFrequencySortedArray {
    //https://www.youtube.com/watch?v=zr_AoTxzn0Y&list=PL_z_8CaSLPWeYfhtuKHj-9MpYb6XQJ_f2&index=5
    public static void main(String[] args) {
        int arr[]={1,1,2,2,2,2,3};
        int x=2;
        System.out.println("last occurence index is "+lastOccurence(arr,0,arr.length,x));
        System.out.println("first occurence index is "+firstOcuurence(arr,0,arr.length,x));
      //  System.out.println(lastOccurence(arr,0,arr.length,x)-firstOccurence()+1);
    }

    public static int firstOcuurence(int arr[],int low,int high,int x)
    {
        int res=-1;
        int mid=(0+arr.length)/2;
        while(low<=high)
        {
             mid=(low+high)/2;
            if(arr[mid]==x ){
                res=mid;
                high=mid-1;
            }
            else if(x<arr[mid])
                high=mid-1;
            else
                low=mid+1;

        }
        return res;

    }

    public static int lastOccurence(int arr[],int low,int high,int x)
    {
        int res=-1;
        int mid=(0+arr.length)/2;
        while(low<=high)
        {
            mid=(low+high)/2;
            if(arr[mid]==x ){
                res=mid;
                low=mid+1;
            }
            else if(x<arr[mid])
                high=mid-1;
            else
                low=mid+1;

        }
        return res;
    }
}
