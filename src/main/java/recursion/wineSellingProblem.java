package recursion;

public class wineSellingProblem {
    public static int left;
    public static int right;
    public static void main(String[] args) {
        int arr[]={2,4,6,2,5};
        System.out.println(maxProfit(arr,0,arr.length,1));

    }

    public static int maxProfit(int [] arr,int start,int end ,int year)
    {
        // start at 0 || start at last
        System.out.println("recursion");
        if(start==end)
        {
            return year*arr[start];
        }
         left=year*arr[start]+maxProfit(arr,start+1,end,year+1);
         right=year*arr[end]+maxProfit(arr,start,end-1,year+1);

         return Math.max(left,right);
    }
}
