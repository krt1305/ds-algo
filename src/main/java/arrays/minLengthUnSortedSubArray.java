package arrays;

public class minLengthUnSortedSubArray {
    public static void main(String[] args) {
        int arr[]={10,12,20,30,25,40,32,31,35,50,60};
        //first larger greater than
        int index1 = -1;int index2=-1;

        //30,25,40,32,31,35,50,60
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]>arr[i+1]) {
                index1 = i;
                break;
            }

        }
        System.out.println("first index is "+index1);
        //second index is
        for(int i=arr.length-1;i>index1;i--)
        {
            System.out.println("for loop "+i);
            if(arr[i]<arr[i-1]) {
                index2 = i;
                break;
            }

        }

        System.out.println("second index is "+index2);


    }


}
