package HinhHoc;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("------------------------------------");
        HinhTron ht = new HinhTron();
        ht.xuatTen();
        ht.nhapBanKinh();
        ht.tinhChuVi();
        ht.tinhDienTich();
        ht.inChuVi();
        ht.inDienTich();

        System.out.println("----------------------------------------");
        HinhTru hinhtru = new HinhTru();
        hinhtru.xuatTen();
        hinhtru.nhapChieuCao();
        hinhtru.tinhTheTich();
        hinhtru.inTheTich();
        System.out.println("------------------------------------------");
        HinhChuNhat hcn = new HinhChuNhat();
        hcn.xuatTen();
        hcn.nhapChieuDai();
        hcn.nhapChieuRong();
        hcn.tinhChuVi();
        hcn.inDienTich();
        hcn.inChuVi();
        hcn.inDienTich();

        System.out.println("------------------------------");
        HinhVuong hv  = new HinhVuong();
        hv.xuatTen();
        hv.nhapCanh();
        hv.tinhChuVi();
        hv.tinhDienTich();
        hv.inChuVi();
        hv.inDienTich();
    }
}
