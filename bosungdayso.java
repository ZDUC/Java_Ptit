import java.util.Scanner;

public class bosungdayso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x, s = 0, ok = 0, a[] = new int[205];
        for (int i = 0; i < n; i++) {
            x = sc.nextInt();
            if (s < x)
                s = x;
            a[x]++;
        }
        for (int i = 1; i <= s; i++) {
            if (a[i] == 0) {
                ok = 1;
                System.out.println(i);
            }
        }
        if (ok == 0)
            System.out.print("Excellent!");
    }
}