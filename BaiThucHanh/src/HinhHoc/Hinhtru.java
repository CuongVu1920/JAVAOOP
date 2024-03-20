package HinhHoc;

import java.util.Scanner;

public class Hinhtru extends HinhTron {
    public float chieuCao;

    public Hinhtru(){
        ten = "Hinh Tru";
    }
    public void nhapChieuCao(){
        System.out.println("Chieu cao =");
        Scanner sc = new Scanner(System.in);
        chieuCao = sc.nextFloat();
       
    }
    public void tinhTheTich(){
        
        theTich = Pi * banKinh*banKinh*chieuCao;
    }
}
