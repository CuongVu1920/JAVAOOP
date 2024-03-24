package Person;

import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class NhanVien extends Person{
    public String chucVu;
    public String maNhanVien;
    public long luong;

    public void nhapThongTin(){
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ma nhan vien: ");
        maNhanVien = sc.nextLine();
        
    }


    public void xuatThongTin(){
        super.xuat();
        System.out.println("Chuc vu: " + chucVu);
        System.out.println("Ma nhan vien: " + maNhanVien);
        System.out.println("Luong: " + luong);
    }
}
