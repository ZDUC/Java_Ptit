import java.util.Scanner;
import java.lang.Math;
public class hinhvuong 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int b1 = sc.nextInt();
        int c1 = sc.nextInt();
        int d1 = sc.nextInt();
        int a2 = sc.nextInt();
        int b2 = sc.nextInt();
        int c2 = sc.nextInt();
        int d2 = sc.nextInt();
        int x1 = Math.min(a1, a2);
        int x2 = Math.min(b1, b2);
        int y1 = Math.max(c1, c2);
        int y2 = Math.max(d1, d2);
        int x = Math.max((y1 - x1), (y2 - x2));
        System.out.print(x * x);
    }
}

