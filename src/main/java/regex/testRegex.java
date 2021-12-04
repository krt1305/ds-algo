package regex;

import java.util.regex.Pattern;

public class testRegex {
    public static void main(String[] args) {
        boolean match= Pattern.compile(".*").matcher("abc").matches();
        System.out.println(match);
    }
}
