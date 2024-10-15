import java.util.Scanner;

public class daotu 
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0)
        {
            String s=sc.nextLine();
            s=s+" ";
            int n=s.length();
            int check=0;
            for(int i=0;i<n;i++)
            {
                if(s.charAt(i)==' ')
                {
                    for(int j=i-1;j>=check;j--)
                    {
                        System.out.print(s.charAt(j));
                    }
                    System.out.print(" ");
                    check=i+1;
                }
            }
            System.out.println();
        }
    }
}
