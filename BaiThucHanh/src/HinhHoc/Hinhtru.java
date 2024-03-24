package HinhHoc;

import java.util.Scanner;

public class HinhTru extends HinhTron {
    public float chieuCao;

    public HinhTru(){
        ten = "Hinh Tru!";
    }
   public void nhapChieuCao(){
        super.nhapBanKinh();
        System.out.println("Chieu cao = ");
        Scanner sc = new Scanner(System.in);
        chieuCao = sc.nextFloat();
    }
    public void tinhTheTich(){
        theTich = Pi*banKinh*2*chieuCao;
    }
}
