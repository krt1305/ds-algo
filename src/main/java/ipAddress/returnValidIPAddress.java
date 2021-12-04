package ipAddress;

public class returnValidIPAddress {
    public static void main(String[] args) {
        String ipAddress="19216811";
        for(int i=1;i<=3;i++)
        {
            String firstPart=ipAddress.substring(0,i);
            if(isValid(firstPart)) {
                for (int j = 1; j <= 3; j++) {
                    String secondPart = ipAddress.substring(i, j);
                    if(isValid(secondPart)) {
                        for (int k = 1; k <= 3; k++) {
                            String thirdPart =ipAddress.substring(i+j,k);
                            String fourthPart=ipAddress.substring(i+j+k);
                            if(isValid(thirdPart)&& isValid(fourthPart))
                            {
                                System.out.println(firstPart+"."+secondPart+"."+thirdPart+"."+fourthPart);
                            }
                        }
                    }
                }
            }
        }


    }
    public static boolean isValid(String str)
    {
        Integer i=Integer.valueOf(str);
        if(i>=0 && i<=255)
            return true;
        return false;
    }
}
