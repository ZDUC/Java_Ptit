import java.util.Scanner;

public class bscusc {

    public static Long gcd(Long a, Long b) 
    {
        while (a != 0) 
        {
            Long x = a;
            a = b % a;
            b = x;
        }
        return b;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) 
        {
            Long a = sc.nextLong();
            Long b = sc.nextLong();
            Long c = gcd(a, b);
            System.out.println(a * b / c + " " + c);
        }
    }
}