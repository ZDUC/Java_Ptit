import java.math.BigInteger;
import java.util.Scanner;

public class hieusonguyenlon2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();
        int m=Math.max(a.length(),b.length());
        BigInteger so1=new BigInteger(a);
        BigInteger so2=new BigInteger(b);
        System.out.println(so1.subtract(so2));
        }
}
