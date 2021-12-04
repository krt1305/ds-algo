package recursion.editDistance;

public class editDistance {
    public static void main(String[] args) {
        String word1="horse";
        String word2="ros";
        editDistance(word1,word2,0,0);

    }

    public static int editDistance(String word1,String word2,int i,int j)
    {
        if(i>=word1.length() && j>=word2.length()) return 0;
        if(i==word1.length()) return word2.length()-j;
        if(j==word2.length()) return word1.length()-i;


        //both chars are equal , do nothing .Move the pointers
        if(word1.charAt(i)==word2.charAt(j)) return editDistance(word1,word2,i++,j++);
        else{
        //both chars not equal
            //Options
        // insert , delete , replace .Pick min of these
        //abc bcd

        return Math.min(editDistance(word1, word2, i, j++), Math.min(editDistance(word1, word2, i++, j),
                editDistance(word1, word2, i++, j++))) +1;
        }

    }
}
