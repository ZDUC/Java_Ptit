import java.util.Scanner;

public class phanso 
{
    public static long ucln(Long a, Long b)
    {
        while (a*b!=0) 
        {
            if(a > b)
                a = a%b;
            else
                b = b%a;
        }
        return a+b;
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        Long a=sc.nextLong();
        Long b=sc.nextLong();
        Long c=ucln(a,b);
        System.out.println((a/c)+"/"+(b/c));
    }
}
