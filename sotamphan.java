import java.util.Scanner;
public class sotamphan 
{
    public static int check(String s) 
    {
        int n = s.length();
        for (int i = 0; i < n; i++) 
        {
            int h = s.charAt(i) - '0';
            if(h!=0 && h!=1 && h!=2) return 0;
        }
        return 1;
    }
    public static void main(String[] arg)
    {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            Long n=sc.nextLong();
            if(check(Long.toString(n))==1) System.out.println( "YES");
            else System.out.println( "NO");
        }
    }
}
