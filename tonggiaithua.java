import java.util.Scanner;

public class tonggiaithua 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Long n = sc.nextLong();
        Long s = (long) 1, k = (long) 1;
        for (int i = 2; i <= n; i++) 
        {
            k *= i;
            s += k;
        }
        System.out.print(s);
    }
}
