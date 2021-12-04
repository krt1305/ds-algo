package arrays;

public class missingNumberinRange1N {
    //https://www.youtube.com/watch?v=lBk6fVhuCyw&list=PLqM7alHXFySEQDk2MDfbwEdjd2svVJH9p&index=3
    public static void main(String[] args) {
        int arr[]={1,2,4,5,6};
        int n=6;
        int xor1=1;
        int xor2=arr[0];
        for(int i=2;i<=n+1;i++)
        {
            xor1=xor1^i;
        }
        System.out.println("xor1 is "+xor1);
        for(int i=0;i<arr.length-1;i++)
        {
            xor2=arr[i]^xor2;
        }
        System.out.println("xor2 is "+xor2);
        System.out.println("Missing number is "+(xor1^xor2));
    }

}


