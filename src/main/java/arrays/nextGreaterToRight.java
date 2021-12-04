package arrays;

import java.util.Stack;

public class nextGreaterToRight {
    public static void main(String[] args) {
        int arr[]={16,17,4,3,5,2};
        Stack<Integer> stack=new Stack<>();
        int nextGreater[]=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--)
        {
            if(stack.isEmpty())
            {
                nextGreater[i]=-1;
            }
            else if(arr[i]<stack.peek() && stack.size()>0)
            {
                nextGreater[i]=stack.peek();
            }
            else if(arr[i]>stack.peek() && stack.size()>0)
            {
                while(!stack.isEmpty() && arr[i]>stack.peek())
                {
                    stack.pop();
                }
                if(stack.isEmpty())
                {
                    nextGreater[i]=-1;
                }
                else
                {
                    nextGreater[i]=stack.peek();
                }

            }
            stack.push(arr[i]);
        }

        System.out.println("Next greater elems to rights");
        for(int i=0;i<nextGreater.length;i++)
        {
            System.out.println(nextGreater[i]);
        }
    }
}
