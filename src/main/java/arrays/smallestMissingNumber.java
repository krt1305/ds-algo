package arrays;

public class smallestMissingNumber {
    public static void main(String[] args) {
        int arr[]={0,1,2,6,9};
        int m=10;
        int n= arr.length;
        boolean present[] =new boolean[m];
        System.out.println("present size is "+present.length);
        for(int i=0;i<present.length-1;i++)
        {
            present[i]=false;
        }
        for(int i=0;i<arr.length-1;i++)
        {
            present[arr[i]]=true;
        }
        System.out.println("present array after setting true");
        for(int i=0;i<present.length-1;i++)
        {
            System.out.println(present[i]);
        }
        for(int i=0;i<present.length-1;i++)
        {
            if(present[i]==false) {
                System.out.println("missing index " +i);
                break;
            }
        }
    }
}
