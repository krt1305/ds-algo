package string;

public class SringRotation {
    public static void main(String[] args) {
        String s1="XYZ";
        String s2="YXZ";
        if(s1.concat(s1).contains(s2))
            System.out.println("rotated ");
        else
            System.out.println("false");
    }
}
