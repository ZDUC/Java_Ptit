import java.util.Scanner;

public class chuso4va7 
{
    public static int check(String s) 
    {
        int n = s.length();
        int d = 0;
        for (int i = 0; i < n; i++) 
        {
            int h = s.charAt(i) - '0';
            if(h==4||h==7) d++;
        }
        if (d == 4||d==7)
            return 1;
        return 0;
    }
    public static void main(String[] arg)
    {
//        Scanner sc = new Scanner(System.in);
//        Long n = sc.nextLong();
//        if(check(Long.toString(n))==1) System.out.println("YES");
//        else System.out.println("NO");
        System.out.print("hello");
    }
}
