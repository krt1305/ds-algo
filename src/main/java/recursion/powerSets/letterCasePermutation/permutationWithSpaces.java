package recursion.powerSets.letterCasePermutation;

public class permutationWithSpaces {
    public static void main(String[] args) {
        String s="abc";
        powerSet(s,0,new StringBuilder(""));


    }


    public static void powerSet(String s,int start,StringBuilder sb)
    {
        int n=s.length();
        if(start==n)
        {
            System.out.println(sb);
            return;
        }
        char ch=s.charAt(start);
        sb.append(ch).append(" ");
        powerSet(s,start+1,sb);
        sb.deleteCharAt(sb.length()-1);

        sb.append(ch);
        powerSet(s,start+1,sb);
        sb.deleteCharAt(sb.length()-1);

    }
}
