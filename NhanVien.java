// Source code is decompiled from a .class file using FernFlower decompiler.
import java.util.Calendar;
import java.util.Scanner;

public class NhanVien {
   private String ma;
   private String hoten;
   private double luong;
   private boolean gtinh;
   private int tuoi;
   private boolean ttrang;

   public NhanVien() {
   }

   public NhanVien(String ma, String hoten, double luong, boolean gtinh, int tuoi) {
      this.ma = ma;
      this.hoten = hoten;
      this.luong = luong;
      this.gtinh = gtinh;
      this.tuoi = tuoi;
      if (gtinh && tuoi > 62) {
         this.ttrang = false;
      } else if (gtinh && tuoi <= 62) {
         this.ttrang = true;
      } else if (!gtinh && tuoi <= 60) {
         this.ttrang = true;
      } else {
         this.ttrang = false;
      }

   }

   public NhanVien(String ma) {
      this.ma = ma;
   }

   public String getMa() {
      return this.ma;
   }

   public void setMa(String ma) {
      this.ma = ma;
   }

   public String getHoten() {
      return this.hoten;
   }

   public void setHoten(String hoten) {
      this.hoten = hoten;
   }

   public double getLuong() {
      return this.luong;
   }

   public void setLuong(double luong) {
      this.luong = luong;
   }

   public boolean isGtinh() {
      return this.gtinh;
   }

   public void setGtinh(boolean gtinh) {
      this.gtinh = gtinh;
   }

   public int getTuoi() {
      return this.tuoi;
   }

   public void setTuoi(int tuoi) {
      this.tuoi = tuoi;
   }

   public int getNamSinh() {
      Calendar c = Calendar.getInstance();
      int y = c.get(1);
      return y - this.tuoi;
   }

   public boolean isTtrang() {
      boolean ttrang = false;
      if (this.gtinh && this.tuoi > 62) {
         ttrang = false;
      } else if (this.gtinh && this.tuoi <= 62) {
         ttrang = true;
      } else if (!this.gtinh && this.tuoi <= 60) {
         ttrang = true;
      } else {
         ttrang = false;
      }

      return ttrang;
   }

   public String toString() {
      String var10000 = this.ma;
      return var10000 + "\t" + this.hoten + "\t" + (this.gtinh ? "Nam" : "Nu") + "\t" + this.tuoi +"\t"+ (this.isTtrang() ? "lam viec" : "nghi");
   }

   public void input() {
      Scanner sc = new Scanner(System.in);
      System.out.print("ma:");
      this.ma = sc.nextLine();
   }
}
