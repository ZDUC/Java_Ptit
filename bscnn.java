import java.math.BigInteger;
import java.util.Scanner;

public class bscnn 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) 
        {
            BigInteger m = sc.nextBigInteger();
            BigInteger n = sc.nextBigInteger();
            System.out.println(m.multiply(n).divide(m.gcd(n)));
        }
    }
}