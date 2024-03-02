import java.util.Scanner;

public class Student {
    public String hoTen;
    public String maSinhVien;
    public String khoa;
    public String gioiTinh;
    public int namSinh;
    public int tuoi;

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ho ten sinh vien: ");
        hoTen = sc.nextLine();
        System.out.println("Ma sinh vien: ");
        maSinhVien = sc.nextLine();
        System.out.println("Khoa: ");
        khoa = sc.nextLine();
        System.out.println("Gioi tinh cua sinh vien: ");
        gioiTinh = sc.nextLine();
        System.out.println("Nam sinh: ");
        namSinh = sc.nextInt();
        sc.close();
    }

    public int tinhTuoi(){
        tuoi = 2024 - namSinh;
        return tuoi;
    }
    public void in(){
        System.out.println("Ho ten sinh vien: " + hoTen);
        System.out.println("Ma sinh vien: " + maSinhVien);
        System.out.println("Khoa: " + khoa);
        System.out.println("Gioi tinh cua sinh vien: " + gioiTinh);
        System.out.println("nam Sinh: " + namSinh);
        System.out.println("Tuoi: " + tuoi);
    }
    public static void main(String[] args) {
        Student st = new Student();
        st.nhap();
        st.tinhTuoi();
        st.in();
    }
}
