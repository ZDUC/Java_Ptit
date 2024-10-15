import java.util.Scanner;
import java.lang.Math;
public class solienke 
{
    public static int Check(String s)
    {
        int n=s.length();
        for (int i = 1; i < n; i++)
            if (Math.abs(s.charAt(i) - s.charAt(i - 1)) != 1)
                return 0;
        return 1;
    }
    public static void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0)
        {
            String str=sc.nextLine();
            if(Check(str)==1) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
