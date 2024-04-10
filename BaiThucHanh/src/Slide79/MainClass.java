package Slide79;

public class MainClass {
    public static void main(String[] args) {
        NhanVienFullTime sep = new NhanVienFullTime("Tran Van Sep!");
        sep.setLoaiChucVu(Lopconfigs.NHAN_VIEN_SEP);

        NhanVienFullTime linh1 = new NhanVienFullTime("Nguyen Van Linh");
        NhanVienFullTime linh2 = new NhanVienFullTime("Nguyen Xuan Huy", 3);
        linh1.setLoaiChucVu(Lopconfigs.NHAN_VIEN_LINH);
        linh2.setLoaiChucVu(Lopconfigs.NHAN_VIEN_LINH);
        //Cong ty dang thue 1 nhan vien thoi vu
        NhanVienPartTime pt = new NhanVienPartTime("Phan thi thoi vu", 240);

        sep.tinhLuong();
        linh1.tinhLuong();
        linh2.tinhLuong();
        pt.tinhLuong();

        //in thong tin
        sep.xuatThongTin();
        linh1.xuatThongTin();
        linh2.xuatThongTin();
        pt.xuatThongTin();
    }
}
