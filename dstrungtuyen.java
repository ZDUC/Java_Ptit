import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.*;

class ThiSinh implements Comparable<ThiSinh> {
    private String maThiSinh, hoTen;
    public float d, dUuTien;

    ThiSinh(String maThiSinh, String hoTen, float d1, float d2, float d3) {
        this.maThiSinh = maThiSinh;
        this.hoTen = hoTen;
        this.d = d1 * 2 + d2 + d3;
        if (maThiSinh.charAt(2) == '1')
            dUuTien += 0.5;
        else if (maThiSinh.charAt(2) == '2')
            dUuTien += 1;
        else
            dUuTien += 2.5;
        d += dUuTien;
    }

    public String getD() {
        if (d == (int) d)
            return Integer.toString((int) d);
        return Float.toString(d);
    }
    
    public String getDUuTien() {
        if (dUuTien == (int) dUuTien)
            return Integer.toString((int) dUuTien);
        return Float.toString(dUuTien);
    }

    @Override
    public String toString() {
        return maThiSinh + " " + hoTen + " " + getDUuTien() + " " + getD();
    }

    @Override
    public int compareTo(ThiSinh o) {
        if (this.d > o.d)
            return -1;
        else if (this.d < o.d)
            return 1;
        else
            return this.maThiSinh.compareTo(o.maThiSinh);
    }
}

public class Lazygarde {

    public static String chuanHoa(String s) {
        s = s.trim().toLowerCase().replaceAll("\\s+", " ");
        for (int i = 0; i < s.length(); i++) {
            if (i == 0 || s.charAt(i - 1) == ' ') {
                s = s.substring(0, i) + Character.toUpperCase(s.charAt(i)) + s.substring(i + 1);
            }
        }
        return s;
    }

    public static void main(String[] args) throws IOException, ParseException {
        Scanner sc = new Scanner(new File("THISINH.in"));
        int n = sc.nextInt();
        List<ThiSinh> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String maThiSinh = sc.next();
            sc.nextLine();
            String hoTen = chuanHoa(sc.nextLine());
            float d1 = sc.nextFloat();
            float d2 = sc.nextFloat();
            float d3 = sc.nextFloat();
            list.add(new ThiSinh(maThiSinh, hoTen, d1, d2, d3));
        }
        Collections.sort(list);
        int chiTieu = sc.nextInt();
        float diemChuan = list.get(chiTieu - 1).d;
        System.out.println(diemChuan);
        for (ThiSinh thiSinh : list) {
            System.out.print(thiSinh);
            if(thiSinh.d >= diemChuan)
                System.out.println(" TRUNG TUYEN");
            else
                System.out.println(" TRUOT");
        }
        sc.close();
    }
}