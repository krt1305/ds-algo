package arrays;

public class oddAppearingelem {
    public static void main(String[] args) {
        int arr[]={1,1,2,2,2,2,13};
        int xor=arr[0];
        for(int i=1;i<=arr.length-1;i++)
        {
            //System.out.println("in for loop");
            System.out.println(xor+ " ^ "+arr[i] + "----- ");
            xor=xor^arr[i];
            System.out.println(xor);
        }
        System.out.println("final xor is "+xor);

    }
}
