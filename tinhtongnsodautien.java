import java.util.*;

public class tinhtongnsodautien 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            System.out.println(n * (n + 1) / 2);
        } 
    }
} 
