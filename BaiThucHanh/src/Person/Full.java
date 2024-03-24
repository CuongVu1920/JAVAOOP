package Person;

import java.util.Scanner;

public class Full extends NhanVien{
    public long soNgayLamViec;
    public Full(){
        chucVu = "Nhan Vien Fulltime!!";
        luong = 50000;
    }
    public void nhapSoNgay(){
        super.nhapThongTin();
        Scanner sc = new Scanner(System.in);
        System.out.println("So ngay lam viec: ");
        soNgayLamViec = sc.nextLong();
    }
    public void tinhLuong(){
        luong = soNgayLamViec*luong;
    }
}
