import java.util.Scanner;

class TS 
{
    String ten;
    String ns;
    float diem1;
    float diem2;
    float diem3;
    void Input() 
    {
        Scanner sc = new Scanner(System.in);
        ten = sc.nextLine();
        ns = sc.next();
        diem1 = sc.nextFloat();
        diem2 = sc.nextFloat();
        diem3 = sc.nextFloat();
        if (ns.charAt(1) == '/')
            ns = '0' + ns;
        if (ns.charAt(4) == '/')
            ns = ns.substring(0, 3) + '0' + ns.substring(3);
    }

    void Output() {
        System.out.printf("%s %s %.1f", ten, ns, diem1+diem2+diem3);
    }
}
public class khaibaolopts 
{
    public static void main(String[] args) 
    {
        TS ts = new TS();
        ts.Input();
        ts.Output();
    }
}