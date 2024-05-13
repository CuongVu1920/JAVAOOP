package ArraysList;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DanhSachSinhVien dssv = new DanhSachSinhVien();
        int luaChon = 0;
        do{
            System.out.println("MENU----------------------------------");
            System.out.println("Vui long lua chon chuc nang: ");
            System.out.println("1. Them sinh vien vao danh sach. /n");
            System.out.println("2. In danh sach sinh vien ra man hinh. /n ");
            System.out.println("3. Kiem tra danh sach co rong hay khong. /n");
            System.out.println("4. Lay ra so luong sinh vien trong danh sach. /n");
            System.out.println("5. Lam rong danh sach sinh vien. /n");
            System.out.println("6. Kiem tra sinh vien co ton tai trong danh sach hay khong, dua tren ma sinh vien. /n");
            System.out.println("7. Xoa mot sinh vien ra khoi danh sach dua tren ma sinh vien. /n");
            System.out.println("0. Thoat khoi chuong trinh");
            luaChon = sc.nextInt();
            sc.nextLine();

            if(luaChon ==1){
                //1. them sinh vien vao danh sach
                System.out.println("Nhap ma sinh vien: ");
                String maSinhVien = sc.nextLine();
                System.out.println("Nhap ho va ten: ");
                String hoVaTen = sc.nextLine();
                System.out.println("Nhap nam sinh: ");
                int namSinh = sc.nextInt();
                System.out.println("Nhap diem trung binh: "); float diemTrungBinh = sc.nextFloat();
                SinhVien sv = new SinhVien(maSinhVien, hoVaTen, namSinh, diemTrungBinh);
                dssv.themSinhVien(sv);

            } else if(luaChon ==2){
                //2. In danh sach sinh vien
                dssv.inDanhSachSinhVien();;

            }else if(luaChon ==3){
                //3. Kiem tra danh sach co rong hay khong.
                System.out.println("Kiem tra danh sach rong: " + dssv.kiemTraDanhSachRong());
            }else if(luaChon ==4){
                //4. Lay ra so luong sinh vien trong danh sach
                System.out.println("So luong sinh vien hien tai: " + dssv.laySoLuongSinhVien());
            }else if(luaChon ==5){
                //5. Lam rong danh sach sinh vien.
                dssv.lamRongDanhSach();
                
            }else if(luaChon ==6){
                //6. Kiem tra sinh vien co ton tai trong danh sach hay khong, dua tren ma sinh vien
                System.out.println("Nhap ma sinh vien: ");
                String maSinhVien = sc.nextLine();
                SinhVien sv = new SinhVien(maSinhVien);
                System.out.println("Kiem tra sinh vien co trong danh sach: " + dssv.kiemTraTonTai(sv));
            }else if(luaChon ==7){
                //7. Xoa mot sinh vien ra khoi danh sach dua tren ma sinh vien
                System.out.println("Nhap ma sinh vien: ");
                String maSinhVien = sc.nextLine();
                SinhVien sv = new SinhVien(maSinhVien);
                System.out.println("Xoa sinh vien trong danh sach: " + dssv.xoaSinhVien(sv));
            }
        }while(luaChon != 0 );
    }
}