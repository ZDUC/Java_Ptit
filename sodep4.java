import java.util.Scanner;
public class sodep4 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0)
        {
            String s = sc.nextLine();
            int l = s.length();
            int check = 0;
            for(int i=0;i<l/2;i++)
            {
                if(s.charAt(i)!='6'&&s.charAt(i)!='8')
                {
                    System.out.println("NO");
                    check=1;
                    break;
                }
                if(s.charAt(i)!=s.charAt(l-i-1))
                {
                    System.out.println("NO");
                    check=1;
                    break;
                }
            }
            if(check==0) System.out.println("YES");
        }
    }
}
