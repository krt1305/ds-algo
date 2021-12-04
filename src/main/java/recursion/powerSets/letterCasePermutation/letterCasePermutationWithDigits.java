package recursion.powerSets.letterCasePermutation;

public class letterCasePermutationWithDigits {
    public static void main(String[] args) {
        String s="a1b2";
        int index=0;
        powerSet(s,index,new StringBuilder());

    }

    public static void powerSet(String s,int index,StringBuilder sb)
    {
        int n=s.length();
        if(index==n)
        {
            System.out.println(sb);
            return;
        }
        char c = s.charAt(index);
        if (!Character.isLetter(c)) {  // numbers
            sb.append(c);
            powerSet (s,index + 1,sb);      // explore
            sb.deleteCharAt(sb.length() - 1);                   // unchosen
        } else {
            sb.append(Character.toLowerCase(c));
            powerSet (s,index + 1,sb);
            sb.deleteCharAt(sb.length() - 1);

            sb.append(Character.toUpperCase(c));
            powerSet (s,index + 1,sb);
            sb.deleteCharAt(sb.length() - 1);
        }

    }
}
