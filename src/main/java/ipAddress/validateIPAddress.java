package ipAddress;

import java.util.regex.Pattern;

public class validateIPAddress {
    public static void main(String[] args) {
        String ipAddress="";
        //0-9
        //10-99
        //100-199
        //200-249
        //250-255
        String regexPart1="([0-9]|[1-9][0-9]|[1][0-9][0-9]|2[0-4][0-9]|25[0-5]\\.){3}";
        String regexPart2="([0-1]|[1-9][0-9]|[1][0-9][0-9]|2[0-4][0-9]|25[0-5]){1}";
        String regexIpv6="([0-9a-fA-F]\\:){7}([0-9a-fA-F])";
        System.out.println(Pattern.matches(regexPart1+regexPart2,ipAddress));
    }
}
