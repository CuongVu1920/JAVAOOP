package BaiTapChuong4.ArraysList;

import java.util.ArrayList;

public class DanhSachSinhVien {
    private ArrayList<SinhVien> danhSach;

    public DanhSachSinhVien(){
        this.danhSach = new ArrayList<SinhVien>();
    }


    public DanhSachSinhVien(ArrayList<SinhVien> danhSach) {
        this.danhSach = danhSach;
    }

    //1. Them danh sach sinh vien
    public void themSinhVien(SinhVien sv){
        this.danhSach.add(sv);
    }
    //2. In danh sach sinh vien
    public void inDanhSachSinhVien(){
        for (SinhVien sinhVien : danhSach) {
            System.out.println(sinhVien);
        }
    }

    //3. Kiem tra sinh vien co rong hay khong
    public boolean kiemTraDanhSachRong(){
       return this.danhSach.isEmpty();
    }
    //4. lay ra so luong sinh vien trong danh sach
    public int laySoLuongSinhVien(){
        return this.danhSach.size();
    }
    //5. lam rong danh sach sinh vien
    public void lamRongDanhSach(){
        this.danhSach.removeAll(danhSach);
    }
    //6. Kiem tra sinh vien co ton tai trong danh sach hay khong, dua tren ma sinh vien.
    public boolean kiemTraTonTai(SinhVien sv){
        return this.danhSach.contains(sv);
    }
    //7. Xoa mot sinh vien ra khoi danh sach dua tren ma sinh vien
    public boolean xoaSinhVien(SinhVien sv){
        return this.danhSach.remove(sv);
    }
   
    }
