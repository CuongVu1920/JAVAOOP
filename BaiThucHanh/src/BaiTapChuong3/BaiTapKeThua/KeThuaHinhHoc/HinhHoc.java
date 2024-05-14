package BaiTapChuong3.BaiTapKeThua.KeThuaHinhHoc;

public class HinhHoc {
    public final float Pi = 3.14f;
    public String ten;
    public float ChuVi;
    public float DienTich;
    public HinhHoc(){
        ten = "Hinh";
        ChuVi=0;
        DienTich=0;     
    }
    public void xuatTen(){
        System.out.print("\nTen hinh hoc : "+ten);
    }
    public void inChuVi(){
        System.out.print("\nChu vi = "+ChuVi);
    }
    public void inDienTich(){
        System.out.print("\nDien tich = "+DienTich);
    }
}