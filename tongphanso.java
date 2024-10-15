import java.util.Scanner;

class Fraction {
    long tu;
    long mau;
    static Scanner sc = new Scanner(System.in);

    void Input() {
        tu = sc.nextLong();
        mau = sc.nextLong();
    }

    void Output() {
        System.out.printf("%d/%d", tu, mau);
    }

    void Compact() {
        Long a = tu;
        Long b = mau;
        while (a != 0) {
            Long x = a;
            a = b % a;
            b = x;
        }
        tu /= b;
        mau /= b;
    }

    Fraction Add(Fraction b) {
        Fraction c = new Fraction();
        c.mau = mau * b.mau;
        c.tu = tu * b.mau + mau * b.tu;
        c.Compact();
        return c;
    }
}

public class tongphanso {
    public static void main(String[] args) {
        Fraction a = new Fraction();
        Fraction b = new Fraction();
        a.Input();
        b.Input();
        Fraction c = a.Add(b);
        c.Output();
    }
}