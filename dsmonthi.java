import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Vector;

class MonHoc {
    String maMon;
    String tenMon;
    String hinhThucThi;

    void input(Scanner sc) {
        maMon = sc.nextLine();
        tenMon = sc.nextLine();
        hinhThucThi = sc.nextLine();
    }

    void output() {
        System.out.printf("%s %s %s\n", maMon, tenMon, hinhThucThi);
    }
}

public class dsmonthi {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int n = sc.nextInt();
        sc.nextLine();
        Vector<MonHoc> v = new Vector<>();
        for (int i = 0; i < n; i++) {
            MonHoc x = new MonHoc();
            x.input(sc);
            v.add(x);
        }
        Collections.sort(v, new Comparator<MonHoc>() {
            @Override
            public int compare(MonHoc a, MonHoc b) {
                if (a.maMon.compareTo(b.maMon) > 0)
                    return 1;
                return -1;
            }
        });
        for (int i = 0; i < n; i++)
            v.get(i).output();
        sc.close();
    }
}