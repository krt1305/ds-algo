package recursion.powerSets;

public class subSetsString {
    public static void main(String[] args) {

        String str = "abc";
        int index = 0;
        String curr="";
        powerSet(str,index,curr);

    }

    static void powerSet(String str, int index,
                         String curr)

    {
        int n = str.length();

        // base case
        if (index == n)
        {
            System.out.println(curr);
            return;
        }

        // Two cases for every character
        // (i) We consider the character
        // as part of current subset
        // (ii) We do not consider current
        // character as part of current
        // subset
        powerSet(str, index + 1, curr + str.charAt(index));
        powerSet(str, index + 1, curr);

    }
}
