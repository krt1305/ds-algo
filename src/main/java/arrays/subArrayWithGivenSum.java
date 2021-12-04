package arrays;


public class subArrayWithGivenSum {
    public static void main(String[] args) {
        int arr[]={1,4,20,3,10,5};
        //subarray with given sum
        int sum=33;
        int currSum=0;
        int startIndex=0;
        int i=0;
        while(i<arr.length-1){
            currSum = currSum + arr[i];
            if(currSum==sum){
                System.out.println("start index "+startIndex + " end index "+i);
                break;
            }
            if(currSum<sum){
                i++;
            }
            while(currSum>sum)
            {
                currSum=currSum-arr[startIndex];
                startIndex++;
            }

        }
        System.out.println("start index is "+startIndex);
        System.out.println("end index is "+i);

    }
}
