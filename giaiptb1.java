import java.util.*;

public class giaiptb1
{
    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a == 0 && b == 0)
            System.out.println("VSN");
        else if (a == 0 && b != 0)
            System.out.print("VN");
        else
            System.out.printf("%.2f", (float) -b / a);
    }
}