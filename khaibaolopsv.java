import java.util.Scanner;

class SV 
{
    String ten;
    String ns;
    String lop;
    String maSV;
    float GPA;
    SV() 
    {
        maSV = "B20DCCN001";
    }
    void Input() {
        Scanner sc = new Scanner(System.in);
        ten = sc.nextLine();
        lop = sc.next();
        ns = sc.next();
        GPA = sc.nextFloat();
        if (ns.charAt(1) == '/')
            ns = '0' + ns;
        if (ns.charAt(4) == '/')
            ns = ns.substring(0, 3) + '0' + ns.substring(3);
    }

    void Output() {
        System.out.printf("%s %s %s %s %.2f", maSV, ten, lop, ns, GPA);
    }
}
public class khaibaolopsv 
{
    public static void main(String[] args) 
    {
        SV sv = new SV();
        sv.Input();
        sv.Output();
    }
}