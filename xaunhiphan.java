import java.util.Scanner;

public class xaunhiphan {

    static long a[] = new long[93];

    public static int Try(int n, long k) {
        if (n == 1)
            return 0;
        if (n == 2)
            return 1;
        if (k > a[n - 2])
            return Try(n - 1, k - a[n - 2]);
        else
            return Try(n - 2, k);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        a[1] = 1L;
        a[2] = 1L;
        for (int i = 3; i <= 92; i++)
            a[i] = a[i - 1] + a[i - 2];
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long k = sc.nextLong();
            System.out.println(Try(n, k));
        }
    }
}
