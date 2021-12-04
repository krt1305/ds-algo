package arrays;

public class missingElemsRange099 {
    //https://www.youtube.com/watch?v=qjNVJTUge7s&list=PLqM7alHXFySEQDk2MDfbwEdjd2svVJH9p&index=16
    public static void main(String[] args) {
        int[] arr={88,105,3,2,200,0,10};
        int[] occurArr=new int[100];
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]<100) {
                occurArr[arr[i]]++;
            }
        }
        for(int i=0;i<occurArr.length-1;i++)
        {
            System.out.println(occurArr[i]);
        }
    }
}
