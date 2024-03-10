package Shapes;

public class MainClass {
    public static void main(String[] args) {
       HinhTron ht = new HinhTron();
      HinhChuNhat hcn = new HinhChuNhat(); 
       System.out.println("Tinh hinh tron: ");
       ht.nhapBanKinh();
       ht.tinhChuVi();
       ht.tinhDienTich();
       ht.inChuVi();
       ht.inDienTich();
       
       System.out.println("----------------------------");
       System.out.println("Tinh hinh chu nhat: ");
       hcn.nhap();
       hcn.tinhChuVi();
       hcn.tinhDienTich();
       hcn.inChuVi();
       hcn.inDienTich();
       
       
    }
}
