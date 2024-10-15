import java.util.Scanner;
class ps
{
    private Long tu,mau;
    ps(Long tu,Long mau)
    {
        this.tu=tu;
        this.mau=mau;
    }
    public Long gcd(Long a,Long b)
    {
        if(b==0) return a;
        return gcd(b,a%b);
    }
    public ps hieu(ps b)
    {
        Long tu1=tu*b.mau;
        Long tu2=b.tu*mau;
        ps s=new ps(tu1-tu2,mau*b.mau);
        return s;
    }
    public String rg()
    {
        Long gc=gcd(tu,mau);
        Long t=tu/gc;
        Long m=mau/gc;
        if(m==1) return Long.toString(t);
        if(t==0) return Long.toHexString(0);
        return Long.toString(t)+"/"+Long.toString(m);
    }
}
public class hieu2phanso 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        long xtu=sc.nextLong();
        long xmau=sc.nextLong();
        Long ytu=sc.nextLong();
        Long ymau=sc.nextLong();
        ps ps1=new ps(xtu,xmau);
        ps ps2=new ps(ytu,ymau);
        ps tru=ps1.hieu(ps2);
        System.out.println(tru.rg());
    }
}
