import java.util.Scanner;

public class sodep2 {

    public static int Check(String s) {
        int d = 0, n = s.length();
        String x = "";
        if (s.charAt(0) != '8' && s.charAt(n - 1) != '8')
            return 0;
        for (int i = 0; i < n; i++) {
            d += s.charAt(i) - '0';
            x = s.charAt(i) + x;
        }
        if (d % 10 == 0 && s.compareTo(x) == 0)
            return 1;
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            if (Check(s) == 1)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}