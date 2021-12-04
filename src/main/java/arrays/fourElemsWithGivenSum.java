package arrays;

public class fourElemsWithGivenSum {
    public static void main(String[] args) {
        int arr[]={10,2,3,4,5,9,7,8};
        int sum=23;
        int n=arr.length;

        for(int i=0;i<n-3;i++)
        {
            for(int j=i+1;j<n-2;j++)
            {
                for(int k=j+1;k<n-1;k++)

                {
                    if(arr[i]+arr[j]+arr[k]==sum)
                        System.out.println(arr[i] + "---- "+arr[j] + "----- "+arr[k]);
                }
            }
        }

    }
}
