import java.util.Scanner;

public class hieu2matran 
{
    public static int gcd(int a,int b)
    {
        if(b==0) return a;
        return gcd(b,a%b);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int m=sc.nextInt();
            int n=sc.nextInt();
            int b[]=new int [m];
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                    int x=sc.nextInt();
                    b[i]=gcd(b[i],x);
                }
            }
            for(int x:b) System.out.print(x+" ");
            System.out.println();
        }
    }
}
