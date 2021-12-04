package stacks;

import java.util.HashMap;
import java.util.Stack;

public class maximumAreaHistogran {
    static int arr[];
    static  int smallerLeftArr[];
    static int smallerRightArr[];
    static HashMap<Integer,Integer> map=new HashMap();
    static int widthArr[];
    public static void main(String[] args) {

            arr = new int[]{6, 2, 5, 4, 5, 1, 6};
            smallerLeftArr = new int[arr.length];
            widthArr=new int[arr.length];
            for(int i=0;i<arr.length-1;i++)
            {
                map.put(arr[i],i);
            }
            nearestSmallertoLeft(arr);
            System.out.println("Smaller to left");
            for (Integer i : smallerLeftArr) {
                System.out.println(i);

            }

            System.out.println("Smaller to right");
            smallerRightArr = new int[arr.length];
            nearestSmallerToRight(arr);
            for (Integer i : smallerRightArr) {
                System.out.println(i);
            }

            System.out.println("Width array ");
            for(int i=0;i<widthArr.length;i++)
            {
                widthArr[i]=smallerRightArr[i]-smallerLeftArr[i]-1;
                System.out.println(widthArr[i]);
            }
            //area=height*width;
            int[] area=new int[arr.length];
            int max=Integer.MIN_VALUE;
            for(int i=0;i<area.length;i++)
            {
                area[i]=arr[i]*widthArr[i];
                if(area[i]>max)
                {
                    max=area[i];
                }
            }
          System.out.println("Max area is "+max);


        }

        public static void nearestSmallertoLeft(int[] arr)
        {
            Stack<Integer> stack=new Stack<>();
            for(int i=0;i< arr.length;i++)
            {

                if(stack.isEmpty())
                {
                    smallerLeftArr[i]=-1;
                }
                if(!stack.isEmpty() && arr[i]>=stack.peek())
                {
                    smallerLeftArr[i]=map.get(stack.peek());
                }
                else if(!stack.isEmpty() && arr[i]<stack.peek())
                {
                    while(!stack.isEmpty() && arr[i]<stack.peek())
                    {
                        stack.pop();
                    }
                    if(stack.isEmpty())
                    {
                        smallerLeftArr[i]=-1;
                    }
                    else
                    {
                        smallerLeftArr[i]=map.get(stack.peek());
                    }

                }
                stack.push(arr[i]);
            }
        }

        public static void nearestSmallerToRight(int arr[])
        {
            Stack<Integer> stack=new Stack<>();
            for(int i=arr.length-1;i>=0;i--)
            {
                if(stack.isEmpty())
                {
                    smallerRightArr[i]=arr.length;
                }
                if(!stack.isEmpty() && arr[i]>=stack.peek())
                {
                    smallerRightArr[i]=map.get(stack.peek());
                }
                else if(!stack.isEmpty() && arr[i]<=stack.peek())
                {
                    while(!stack.isEmpty() && arr[i]<stack.peek())
                    {
                        stack.pop();
                    }
                    if(stack.isEmpty())
                    {
                        smallerRightArr[i]=arr.length;
                    }
                    else
                    {
                        smallerRightArr[i]=map.get(stack.peek());
                    }
                }
                stack.push(arr[i]);
            }

        }


}
