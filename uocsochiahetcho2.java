import java.util.Scanner;

public class uocsochiahetcho2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int s = 0;
            for (int i = 1; i * i <= n; i++) 
            {
                if (n % i == 0) 
                {
                    if (i % 2 == 0)
                        s++;
                    if ((n / i) % 2 == 0)
                        s++;
                    if (i * i == n && i % 2 == 0)
                        s--;
                }
            }
            System.out.println(s);
        }
    }
}
