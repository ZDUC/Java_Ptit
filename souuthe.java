import java.util.Scanner;

public class souuthe 
{
    public static int check(String s)
    {
        int n = s.length();
        int dl=0;
        int dc=0;
        for(int i=0;i<n;i++)
        {
            int k=s.charAt(i)-'0';
            if(k<0||k>9) return 0;
            if(k%2==0) dc++;
            else dl++;
        }
        if(dc>dl && n%2==0) return 1;
        else if(dl>dc && n%2!=0) return 1;
        else return 2;
    }  
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            String s = sc.next();
            if (check(s) == 1)
                System.out.println("YES");
            else if(check(s)==2)
                System.out.println("NO");
            else System.out.println("INVALID");
        }
    }
}
