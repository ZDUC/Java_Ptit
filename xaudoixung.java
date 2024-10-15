import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Vector;
public class xaudoixung 
{
    public static int check(String s)
    {
        int n=s.length();
        int dem=0;
        for(int i=0;i<n/2;i++)
        {
            if(s.charAt(i)!=s.charAt(n-i-1)) dem++;
        }
        if(dem==0&&n%2==1) return 1;
        if(dem==1) return 1;
        return 0;
    }
    public static void main(String[] args) 
    {
         Scanner sc= new Scanner(System.in);
        int t =sc.nextInt();
        sc.nextLine();
        while(t-->0)
        {
            String s=sc.nextLine();
            if(check(s)==1) System.out.println("YES");
            else System.out.println("NO");
        }
    }
   
}
