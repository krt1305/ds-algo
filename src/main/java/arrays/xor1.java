package arrays;

public class xor1 {
    public static void main(String[] args) {
        int arr[]={7,3,5,4,5,3,4};
        int xor=arr[0];
        for(int i=1;i<=arr.length-1;i++)
        {
            xor=xor^arr[i];
        }
        System.out.println("xor is "+xor);
    }
}
