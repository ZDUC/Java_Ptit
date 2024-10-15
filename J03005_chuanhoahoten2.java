import java.util.Scanner;
public class J03005_chuanhoahoten2
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0)
        {
            String s=sc.nextLine();
            s=s.trim();
            String m[]=s.split("\\s");
            for(int i=1;i<m.length-1;i++)
            {
                if(m[i].isEmpty()==false)
                {
                    String ds=m[i].substring(0, 1).toUpperCase()+m[i].substring(1).toLowerCase();
                    System.out.print(ds+" ");
                }
            }
            String x=m[m.length-1].substring(0, 1).toUpperCase()+m[m.length-1].substring(1).toLowerCase();
            System.out.print(x+", ");
            System.out.println(m[0].toUpperCase());
        }
    }
}