package recursion;

public class balancedParenthesis {
    public static void main(String[] args) {
        int n=3;
        int open=0;
        int close=0;
        generateBalancedParenthesis(n,new StringBuilder(),open,close);
    }


    public static void generateBalancedParenthesis(int n,StringBuilder sb,int open,int close)
    {

        if(sb.length()==n*2)
        {
            System.out.println(sb);
            return;
        }
        if(open<n) {
            generateBalancedParenthesis(n, sb.append("("), open + 1, close);
            sb.deleteCharAt(sb.length()-1);
        }
        if(close<open)
        {
            generateBalancedParenthesis(n, sb.append(")"), open , close+1);
            sb.deleteCharAt(sb.length()-1);
        }

    }

}
