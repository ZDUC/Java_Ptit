import java.math.BigInteger;
import java.util.Scanner;

public class hieusonguyenlon {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            String a=sc.next();
            String b=sc.next();
            int m=Math.max(a.length(),b.length());
            BigInteger so1=new BigInteger(a);
            BigInteger so2=new BigInteger(b);
            String ds=so1.subtract(so2).abs().toString();
            while(ds.length()<m)
            {
                ds="0"+ds;
            }
            System.out.println(ds);
        }
    }  
}
