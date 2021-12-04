package sorting;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr=selectionSort(new int[]{9,8,3,13,87,12,99});
        for(int item:arr)
        {
            System.out.println(item);
        }

    }

    public static int[] selectionSort(int a[])
    {


        for(int i=0;i<a.length;i++)
        {
            int min=i;
            for(int j=i+1;j<a.length;j++)
            {
                if(a[j]<a[min])
                    min=j;

            }
            //swap
            int temp=a[i];
            a[i]=a[min];
            a[min]=temp;


        }
        return a;

    }
}
