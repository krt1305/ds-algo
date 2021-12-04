package sort;

public class bubbleSort {
    public static void main(String[] args) {
        int arr[]={3,60,35,2,45,320,5};
        bubbleSort(arr);
        System.out.println("After sorting---");
        for(Integer i:arr)
        {
            System.out.println(i);
        }

    }

    static void bubbleSort(int arr[])
    {

        int n=arr.length;
        for(int i=0;i< n;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
