package Abstract;

public class MayBay extends PhuongTienDiChuyen{
    private String loaiNhienLieu;

    public MayBay( String loaiNhienLieu, HangSanXuat hangSanXuat) {
        super("May Bay", hangSanXuat);
        this.loaiNhienLieu = loaiNhienLieu;
        this.hangSanXuat = hangSanXuat;
    }

    public String getLoaiNhienLieu() {
        return loaiNhienLieu;
    }

    public void setLoaiNhienLieu(String loaiNhienLieu) {
        this.loaiNhienLieu = loaiNhienLieu;
    }

    @Override
    public double layVanToc() {
 
        return 500;
    }
    
    

    
    
}