import java.util.Scanner;

public class danhdauchucai 
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();
        int m[]=new int[27];
        for(int i=0;i<s.length();i++)
        {
            char x=s.charAt(i);
            m[x - 'a'] = 1;
        }
        int dem=0;
        for(int i=0;i<27;i++)
        {
            if(m[i]==1) dem=dem+1;
        }
        System.out.println(dem);
    }
}
