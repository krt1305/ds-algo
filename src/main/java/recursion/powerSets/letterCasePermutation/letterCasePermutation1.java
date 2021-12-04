package recursion.powerSets.letterCasePermutation;

public class letterCasePermutation1 {

    public static void main(String[] args) {
        String str = "ab";
        // ab,aB,Ab,AB
        int index = 0;
         String curr="";
        powerSet(str,index,curr);

    }
    public static void powerSet(String str,int index , String curr)
    {
        //take char convert to uppper case , permute
        //take char - convert to lower case , permute

        int n=str.length();

        if(index==n)
        {
            System.out.println(curr);
            return;
        }
        char ch=str.charAt(index);
        powerSet(str,index+1,curr+Character.toUpperCase(ch));
        powerSet(str,index+1,curr+Character.toLowerCase(ch));

    }
}
