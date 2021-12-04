package stacks;

import java.util.Stack;

public class nextGreaterLeft {
    static int ngl[];
    public static void main(String[] args) {
        int arr[]={100,80,60,70,60,75,85};
        ngl=new int[arr.length];
        ngl(arr);


    }

    public static void ngl(int[] arr)
    {
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<arr.length;i++)
        {
            if(stack.isEmpty())
            {
                ngl[i]=-1;
            }
            else if(!stack.isEmpty() && stack.peek()>=arr[i])
            {
                ngl[i]=stack.peek();
            }
            else if(!stack.isEmpty() && stack.peek()<arr[i])
            {
                while(!stack.isEmpty() && stack.peek()<arr[i])
                {
                    stack.pop();
                }
                if(stack.isEmpty())
                {
                    ngl[i]=-1;
                }
                else if(stack.peek()>arr[i]){
                    ngl[i]=stack.peek();
                }
            }
            stack.push(arr[i]);
        }

        System.out.println("NGL----");
        for(Integer i:ngl)
        {
            System.out.println(i);
        }
    }
}
