package HinhHoc;

import java.util.Scanner;

public class HinhTron extends HinhHoc{
    public float banKinh;

    public HinhTron(){
        ten = "Hinh tron";
    }

    public void nhapBanKinh(){
        System.out.println("Ban kinh la: ");
        Scanner sc = new Scanner(System.in);
        banKinh = sc.nextFloat();
    
    }

    public void tinhChuVi(){
        chuVi = banKinh*2*Pi;
    }
    public void tinhDienTich(){
        dienTich = banKinh*banKinh*Pi;
    }
}
