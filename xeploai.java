
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class xeploai {

    public static String chuanHoa(String ten) {
        String[] a = ten.trim().toLowerCase().split("\\s+");
        String s = "";
        for (String i : a) {
            s += i.substring(0, 1).toUpperCase() + i.substring(1) + " ";
        }
        return s.trim();
    }

    public static float tinhDiem(int d1, int d2, int d3) {
        return (float) (d1 * 0.25 + d2 * 0.35 + d3 * 0.4);
    }

    public static String xepLoai(float d) {
        if (d >= 8) {
            return "GIOI";
        } else if (d >= 6.5) {
            return "KHA";
        } else if (d >= 5) {
            return "TRUNG BINH";
        } else {
            return "KEM";
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("BANGDIEM.in"));
        int n = sc.nextInt();
        List<SinhVien> l = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            String ma = String.format("SV%02d", i + 1);
            String ten = chuanHoa(sc.nextLine());
            float d = tinhDiem(sc.nextInt(), sc.nextInt(), sc.nextInt());
            String xl = xepLoai(d);

            l.add(new SinhVien(ma, ten, d, xl));
        }
        Collections.sort(l);
        for (SinhVien i : l) {
            System.out.println(i);
        }
    }

}

class SinhVien implements Comparable<SinhVien> {

    private String ma;
    private String ten;
    private float diem;
    private String xepLoai;

    public SinhVien(String ma, String ten, float diem, String xepLoai) {
        this.ma = ma;
        this.ten = ten;
        this.diem = diem;
        this.xepLoai = xepLoai;
    }

    @Override
    public String toString() {
        return String.format("%s %s %.2f %s", ma, ten, diem, xepLoai);
    }

    @Override
    public int compareTo(SinhVien o) {
        if (diem > o.diem) {
            return -1;
        } else {
            return 1;
        }
    }

}