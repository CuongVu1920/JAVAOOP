import java.util.Scanner;

public class Student extends Person{
    public String maSinhVien;
    public double diemTrungBinh;

public Student(String ma, String hoVaTen, String diaChi, String maSinhVien, double diemTrungBinh) {
        super(ma, hoVaTen, diaChi);
        this.maSinhVien = maSinhVien;
        this.diemTrungBinh = diemTrungBinh;
    }

@Override
    public void nhapThongTin(){
        super.nhapThongTin();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma sinh vien: ");
        maSinhVien = sc.nextLine();
        System.out.println("Nhap diem trung binh: ");
        diemTrungBinh = sc.nextDouble();
    }

    @Override
    public void xuatThongTin(){
        super.xuatThongTin();
        System.out.println("Ma sinh vien: " + maSinhVien);
        System.out.println("diem trung binh: " + diemTrungBinh);
    }
        

    

}
