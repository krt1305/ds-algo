package arrays;

public class floorCeilSortedArray {
    public static void main(String[] args) {
        int[] arr={1,2,8,10,10,12,19};
        int x=5;
        System.out.println("floor eleme is "+findFloorElem(arr,0, args.length,x));

    }

    public static int findFloorElem(int arr[],int low,int high,int x)
    {
        int mid = 0;

        while(low<high)
        {
            mid=(low+high)/2;
            if(arr[mid]==x)
            {
                return arr[mid];

            }
            else if(arr[mid]<x)
            {
                low=mid+1;
            }
            else
                mid=high-1;
        }
        return arr[mid];
    }

    public static int findCeilElem(int arr[],int low,int high,int x)
    {
        int mid = 0;

        while(low<high)
        {
            mid=(low+high)/2;
            if(arr[mid]==x)
            {
                return arr[mid];

            }
            else if(arr[mid]<x)
            {
                low=mid+1;
            }
            else
                mid=high-1;
        }
        return arr[mid];
    }
}
