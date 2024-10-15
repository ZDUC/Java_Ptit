import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class tinhtienphong {

    public static String chuanHoa(String ten) {
        String[] a = ten.trim().toLowerCase().split("\\s+");
        String s = "";
        for (String i : a) {
            s += i.substring(0, 1).toUpperCase() + i.substring(1) + " ";
        }
        return s.trim();
    }

    public static long tinhNgay(Date d1, Date d2) {
        long cnt = d2.getTime() - d1.getTime();
        return cnt / (24 * 60 * 60 * 1000) + 1;
    }

    public static long tinhTien(String sp, long soNgay, long ps) {
        long s = 0L;
        switch (sp.charAt(0)) {
            case '1':
                s = 25;
                break;
            case '2':
                s = 34;
                break;
            case '3':
                s = 50;
                break;
            case '4':
                s = 80;
                break;
            default:
                break;
        }
        return s * soNgay + ps;
    }

    public static void main(String[] args){
        try{
            FileReader file = new FileReader("KHACHHANG.in");
            BufferedReader bf = new BufferedReader(file);
            // Scanner sc = new Scanner(new File("KHACHHANG.in"));
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            // int n = sc.nextInt();
            int n = Integer.parseInt(bf.readLine());
            List<KhachHang> l = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                String ma = String.format("KH%02d", i + 1);
                // sc.nextLine();
                String ten = chuanHoa(bf.readLine());
                String sp = bf.readLine().trim();
                Date d1 = sdf.parse(bf.readLine());
                Date d2 = sdf.parse(bf.readLine());
                long soNgay = tinhNgay(d1, d2);
                long ps = Long.parseLong(bf.readLine());
                long tien = tinhTien(sp, soNgay, ps);
                l.add(new KhachHang(ma, ten, sp, soNgay, tien));
            }
            Collections.sort(l);
            for (KhachHang i : l) {
                System.out.println(i);
            }

        }
        catch (IOException e){
            System.out.println("SuZeAI");
        }
        catch (ParseException e){
            System.out.println("szasf");
        }
    }

}
class KhachHang implements Comparable<KhachHang> {

    private String ma, ten, sp;
    private long soNgay, tien;

    public KhachHang(String ma, String ten, String sp, long soNgay, long tien) {
        this.ma = ma;
        this.ten = ten;
        this.sp = sp;
        this.soNgay = soNgay;
        this.tien = tien;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + sp + " " + soNgay + " " + tien;
    }
    @Override
    public int compareTo(KhachHang o) {
        if (tien > o.tien) {
            return -1;
        } else {
            return 1;
        }
    }

}