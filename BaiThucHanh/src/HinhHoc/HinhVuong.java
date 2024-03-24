package HinhHoc;

public class HinhVuong extends HinhChuNhat{
    public HinhVuong(){
        ten = "Hinh Vuong!";
    }
    public void nhapCanh(){
        super.nhapChieuDai();
        super.nhapChieuRong();
    }

}
