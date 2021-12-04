package sorting;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr={12,9,10,4,5};
        mergeSort(0,arr.length-1,arr);



    }


    public static void mergeSort(int low,int high,int[] arr)
    {
        int mid=(low+high)/2;
        mergeSort(low,mid,arr);
        mergeSort(mid+1,high,arr);
        merge(low,high,mid,arr);

    }

    public static void merge(int low,int high,int mid,int [] arr)
    {
        int[] temp=new int[arr.length];
        int i=low;
        int j=mid+1;
        int k=0;

        while(i<=mid && j<high)
        {
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
            i++;}
            else {
                temp[k]=arr[j];
                j++;
            }
            k++;
        }

        if(i<=mid)
        {
            while(i<=mid)
            {
                temp[k]=arr[i];
                i++;k++;
            }
        }

        if(j<=high)
        {
            while(j<=high)
            {
                temp[k]=arr[j];
                j++;k++;
            }
        }


    }
}
