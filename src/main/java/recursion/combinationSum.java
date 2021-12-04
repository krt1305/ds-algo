package recursion;

import javax.sound.midi.SoundbankResource;
import java.util.ArrayList;
import java.util.List;

public class combinationSum {
    static int currSum=0;
    static List<Integer> tempList=new ArrayList<>();
    public static void main(String[] args) {
        //int arr[]={1,2,3};
        int arr[]={2,4,6,8};
        int sum=8;
        combinationSum(arr,0,sum,tempList);
    }
    public static void combinationSum(int[] arr,int start,int sum,List<Integer> tempList)
    {
        if(sum==0)
        {

            for(Integer i:tempList)
            {
                System.out.print(i+"---- ");

            }
            System.out.println(" ");
            return;
        }

        for(int i=start;i<arr.length;i++)
        {
            if(sum-arr[i]>=0)
            {
                tempList.add(arr[i]);
                combinationSum(arr,i,sum-arr[i],tempList);
                tempList.remove(tempList.size()-1);

            }
        }

    }
}
