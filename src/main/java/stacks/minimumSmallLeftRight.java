package stacks;

import java.util.Stack;

public class minimumSmallLeftRight {
    static int arr[];
    static  int smallerLeftArr[];
    static int smallerRightArr[];
    public static void main(String[] args) {
         arr=new int[]{6,2,5,4,5,1,6};
         smallerLeftArr=new int[arr.length];
         nearestSmallertoLeft(arr);
         System.out.println("Smaller to left");
         for(Integer i:smallerLeftArr)
         {
             System.out.println(i);
         }
         System.out.println("Smaller to right");
         smallerRightArr=new int[arr.length];
         nearestSmallerToRight(arr);
         for(Integer i:smallerRightArr)
         {
             System.out.println(i);
         }

    }

    public static void nearestSmallertoLeft(int[] arr)
    {
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i< arr.length;i++)
        {
            System.out.println("for loop "+i);
            if(stack.isEmpty())
            {
                smallerLeftArr[i]=-1;
            }
            if(!stack.isEmpty() && arr[i]>=stack.peek())
            {
                smallerLeftArr[i]=stack.peek();
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
                    smallerLeftArr[i]=stack.peek();
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
                smallerRightArr[i]=-1;
            }
            if(!stack.isEmpty() && arr[i]>=stack.peek())
            {
                smallerRightArr[i]=stack.peek();
            }
            else if(!stack.isEmpty() && arr[i]<=stack.peek())
            {
                while(!stack.isEmpty() && arr[i]<stack.peek())
                {
                    stack.pop();
                }
                if(stack.isEmpty())
                {
                    smallerRightArr[i]=-1;
                }
                else
                {
                    smallerRightArr[i]=stack.peek();
                }
            }
            stack.push(arr[i]);
        }

    }

}
