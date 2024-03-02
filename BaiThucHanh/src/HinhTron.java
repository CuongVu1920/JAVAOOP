import java.util.Scanner;

public class HinhTron {
    public float banKinh;
    public float dienTich;
    public float chuVi;
    public final float PI = 3.14f;

    public void nhapBanKinh(){
        Scanner sc = new Scanner(System.in);
        System.out.println("R = ");
        banKinh = sc.nextFloat();
        sc.close();
    }

    public void tinhDienTich(){
        dienTich = PI*banKinh*banKinh;
    }
    public void tinhChuVi(){
        chuVi = 2*PI*banKinh;
    }
    public void inDienTich(){
        System.out.println("Dien Tich = " + dienTich);
    }
    public void inChuVi(){
        System.out.println("Chu Vi = " + chuVi);
    }
    public static void main(String[] args) {
        HinhTron ht = new HinhTron();
        ht.nhapBanKinh();
        ht.tinhDienTich();
        ht.tinhChuVi();
        ht.inDienTich();
        ht.inChuVi();
    }
    

}
