import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Vector;

class MatHang {
    static int id = 1;
    String maHang;
    String tenHang;
    String nhomHang;
    float giaMua;
    float giaBan;
    float loiNhuan;

    void input(Scanner sc) {
        if (id < 10)
            maHang = "MH0";
        else
            maHang = "MH";
        sc.nextLine();
        maHang += Integer.toString(id++);
        tenHang = sc.nextLine();
        nhomHang = sc.nextLine();
        giaMua = sc.nextFloat();
        giaBan = sc.nextFloat();
        loiNhuan = giaBan - giaMua;
    }

    void output() {
        System.out.printf("%s %s %s %.2f\n", maHang, tenHang, nhomHang, loiNhuan);
    }
}

public class sxmathang {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MATHANG.in"));
        int n = sc.nextInt();
        Vector<MatHang> v = new Vector<>();
        for (int i = 0; i < n; i++) {
            MatHang x = new MatHang();
            x.input(sc);
            v.add(x);
        }
        Collections.sort(v, new Comparator<MatHang>() {
            @Override
            public int compare(MatHang a, MatHang b) {
                if (a.loiNhuan < b.loiNhuan)
                    return 1;
                return -1;
            }
        });
        for (int i = 0; i < n; i++)
            v.get(i).output();
        sc.close();
    }
}
