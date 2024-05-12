package Abstract;

public abstract class PhuongTienDiChuyen {
    protected String tenLoaiPhuonTien;
    protected HangSanXuat hangSanXuat;
    public PhuongTienDiChuyen(String tenLoaiPhuonTien, HangSanXuat hangSanXuat) {
        this.tenLoaiPhuonTien = tenLoaiPhuonTien;
        this.hangSanXuat = hangSanXuat;
    }
    public String getTenLoaiPhuonTien() {
        return tenLoaiPhuonTien;
    }
    public void setTenLoaiPhuonTien(String tenLoaiPhuonTien) {
        this.tenLoaiPhuonTien = tenLoaiPhuonTien;
    }
    public HangSanXuat getHangSanXuat() {
        return hangSanXuat;
    }
    public void setHangSanXuat(HangSanXuat hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }
    
    public String layTenHangSanXuat(){
        return this.hangSanXuat.getTenHangSanXuat();
    }
    public void batDau(){
        System.out.println("let go!!!!");
    }
    public void tangToc(){
        System.out.println("pull power!!");
    }
    public void dungLai(){
        System.out.println("Stopppppppppp");
    }
    public abstract double layVanToc();

    

    
}