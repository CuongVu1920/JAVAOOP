package Person;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("Test nhan vien parttime");
        Part pt = new Part();
        pt.nhapCong();
        pt.tinhLuong();
        pt.xuatThongTin();
    

        System.out.println("Test nhan vien fulltime");
        Full ft = new Full();
        ft.nhapSoNgay();
        ft.tinhLuong();
        ft.xuatThongTin();
    }
}
