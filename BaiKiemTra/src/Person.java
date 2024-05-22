import java.util.Scanner;

public class Person {
    public String maSinhVien;
    public String hoVaTen;
    public double diem;
    public Person(String maSinhVien, String hoVaTen, double diem) {
        this.maSinhVien = maSinhVien;
        this.hoVaTen = hoVaTen;
        this.diem = diem;
    }

   public void nhapThongTin(){
    Scanner sc =new Scanner(System.in);
    System.out.println("Nhap ma sinh vien: ");
    String maSinhVien = sc.nextLine();
    System.out.println("Nhap ho va ten sinh vien: ");
    String hoVaTen = sc.nextLine();
    System.out.println("Nhap diem cua sinh vien: ");
    double diem = sc.nextDouble();
   }

   public void xuatThongTin(){
    System.out.println("Ma sinh vien: " + maSinhVien);
    System.out.println("Ho va ten sinh vien: " + hoVaTen);
    System.out.println("Diem cua sinh vien: " + diem);
   }
}
