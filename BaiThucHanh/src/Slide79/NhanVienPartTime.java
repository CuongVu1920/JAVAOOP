package Slide79;

public class NhanVienPartTime extends NhanVien{
    private int gioLamViec;

    public NhanVienPartTime(String ten, int gioLamViec){
        this.ten = ten;
        this.gioLamViec = gioLamViec;
    }
    @Override
    public String loaiNhanVien(){
        return "Nhan Vien Part Time! ";
    }
    public void tinhLuong(){
        luong = Lopconfigs.LUONG_NHAN_VIEN_PART_TIME_MOI_GIO*gioLamViec;
    }
}
