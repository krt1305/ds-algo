package recursion.powerSets.letterCasePermutation;

public class letterCasePermutation {
    //https://techlarry.github.io/Leetcode/784.%20Letter%20Case%20Permutation/
    public static void main(String[] args) {
        String str = "ab";
        // ab,aB,Ab,AB
        int index = 0;
       // String curr="";
        powerSet(str,index,new StringBuilder());

    }

    public static void powerSet(String str,int index , StringBuilder sb)
    {
        //take char convert to uppper case , permute
        //take char - convert to lower case , permute

        int n=str.length();

        if(index==n)
        {
            System.out.println(sb);
            return;
        }
        char ch=str.charAt(index);
        sb.append(Character.toUpperCase(ch));
        powerSet(str,index+1,sb);
        sb.deleteCharAt(sb.length()-1);

        sb.append(Character.toLowerCase(ch));
        powerSet(str,index+1,sb);
        sb.deleteCharAt(sb.length()-1);


    }
}
