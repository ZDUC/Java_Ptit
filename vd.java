import java.util.Scanner;

public class vd 
{
    public static void main(String[] args)
    {
        String s1="ha";
        String s2="Ha";
        String s3="ha noi";
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s3));
        System.out.println(s1.compareToIgnoreCase(s2));
        System.out.println(s1.compareToIgnoreCase(s3));
    }
}