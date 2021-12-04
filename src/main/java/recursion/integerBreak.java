package recursion;

import java.util.ArrayList;
import java.util.List;

//https://www.youtube.com/watch?v=a9JqRfTcFqk
public class integerBreak {
    static List<Integer> ans=new ArrayList<>();
    static int maxProduct;
    static int product;
    public static void main(String[] args) {
        int num=10;
        int arr[]=new int[num];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=i+1;
        }
        System.out.println("Array eleems are ");
        for(Integer i:arr)
        {
      //      System.out.println(i);
        }
        solution(arr,0,num,ans);

    }

    public static void solution(int[] arr,int start,int num,List<Integer> ans)
    {
        //list of lists with sum as 10
        //list size should be greater than equal to 2
        if(num<0) return;

        if(num==0)
        {
            if(ans.size()>=2) {
                for (Integer i : ans) {
                  //  System.out.print(i + " ---- ");
                    product = product * i;

                }
            }
            maxProduct=Math.max(maxProduct,product);
            product=1;
            System.out.println("Max product is "+maxProduct);
            return;
        }

        for(int i=start;i<arr.length;i++)
        {
            ans.add(arr[i]);
            solution(arr,i,num-arr[i],ans);
            ans.remove(ans.size()-1);
        }

    }
}
