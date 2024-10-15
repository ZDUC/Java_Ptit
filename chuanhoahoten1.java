
import java.util.Scanner;

public class chuanhoahoten1 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0)
        {
            String s=sc.nextLine();
            String m[]=s.split(" ");
            for(int i=0;i<m.length;i++)
            {
                if(m[i].isEmpty()==false)
                {
                    String ds=m[i].substring(0, 1).toUpperCase()+m[i].substring(1).toLowerCase();
                    System.out.print(ds+" ");
                }
            }
            System.out.println();
        }
    }  
}
