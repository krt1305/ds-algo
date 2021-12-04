package recursion.powerSets;

import java.util.ArrayList;
import java.util.List;

public class subSetInteger {
    public static List<List<Integer>> finalList=new ArrayList<>();
    public static void main(String[] args) {
        int arr[]={1,2,3};
        int start=0;
        subSet(arr,start,new ArrayList<>(),arr.length);

    }

    public static void subSet(int [] arr,int start,List<Integer> tempList,int n)
    {
       // int n=arr.length;
        if(start==n){
            if(tempList.size()==0)
            {
                System.out.println("{}");
            }
            else{
                for(Integer i:tempList)
                {
                    System.out.print(i+" ---- ");
                }
            }
            finalList.add(tempList);
            System.out.println(" ");
            return;
        }

        subSet(arr,start+1,tempList,n);
        tempList.add(arr[start]);
        subSet(arr,start+1,tempList,n);
        tempList.remove(tempList.size()-1);

    }
}
