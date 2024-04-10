package Slide79;

public class NhanVienFullTime extends NhanVien{
    private int ngayLamThem;
    private int loaiChucVu;

    public NhanVienFullTime(String ten){
        this.ten = ten;
    }

    public NhanVienFullTime(String ten, int ngayLamThem){
        this.ten = ten;
        this.ngayLamThem = ngayLamThem;
    }

    public void setLoaiChucVu(int loaiChucVu    ) {
        this.loaiChucVu = loaiChucVu;
    }
    @Override
    public String loaiNhanVien(){
        return "Nhan Vien Full Time!";
    }
    public void tinhLuong(){
        luong = Lopconfigs.LUONG_LAM_THEM_MOI_NGAY*ngayLamThem;
    }
}
