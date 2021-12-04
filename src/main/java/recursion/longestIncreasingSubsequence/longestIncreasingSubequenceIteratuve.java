package recursion.longestIncreasingSubsequence;

import java.util.ArrayList;
import java.util.List;

public class longestIncreasingSubequenceIteratuve {
    static List<Integer> increasingSubsequence = new ArrayList<>();

    public static void main(String[] args) {
        int arr[] = {10, 22, 9, 33, 21, 50, 41, 60};
        subSets(arr, 0);
    }

    public static void subSets(int arr[], int startIndex) {

            for(int i=startIndex;i<arr.length;i++){
                for(int j=0;j<i;j++)
                {
                        //increasingSubsequence.add(arr[j]);
                    System.out.println(arr[i] + " ----- "+arr[j]);

                }
                System.out.println("subset -----------");
                for(Integer k:increasingSubsequence){
                    System.out.println(k);
                }
                increasingSubsequence.clear();

        }
    }

}
