package Lab4.Bai3;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class DanhSachSinhVien {
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);
    List<SinhVien> danhSachSinhVien = new LinkedList<SinhVien>();
  
    
    //them sinh vien vao danh sach
    while(true){
        System.out.println("Nhap ten sinh vien: ");
        String hoVaTen = sc.nextLine();
        if(hoVaTen.isEmpty()) break;

        System.out.println("Nhap diem cua sinh vien: ");
        double diem = sc.nextDouble();
        sc.nextLine();
        danhSachSinhVien.add(new SinhVien(hoVaTen, diem));
    }
    //dem so luong sinh vien thi lai
    System.out.println(" sinh vien phai thi lai la: ");
    int soLuongThiLai = 0;
    for (SinhVien sinhVien : danhSachSinhVien) {
        if(sinhVien.diem <= 5){
            System.out.println(sinhVien.hoVaTen);
            soLuongThiLai ++;
            
        }
    }
    System.out.println("Tong so sinh vien phai thi lai: " + soLuongThiLai);
    
    System.out.println("Sinh vien co diem cao nhat: ");
    double diemCaoNhat = Double.MIN_VALUE;
    for (SinhVien sinhVien : danhSachSinhVien) {
        if(sinhVien.diem > diemCaoNhat){
            System.out.println(sinhVien.hoVaTen + " " + sinhVien.diem);
        }
    }
    for (SinhVien sinhVien : danhSachSinhVien) {
        if(sinhVien.diem == diemCaoNhat && sinhVien.diem > 5.0){
            System.out.println(sinhVien.hoVaTen + " " + sinhVien.diem);
        }else{
            System.out.println(" ");
        }
    }
    System.out.println("Nhap ten sinh vien can tim la: ");
    String tenTimKiem = sc.nextLine();
    boolean timThay = false;
    for (SinhVien sinhVien : danhSachSinhVien) {
        if(sinhVien.hoVaTen.equals(tenTimKiem)){
            System.out.println("Da tim thay sinh vien: " + sinhVien.hoVaTen);
            timThay = true;
            break;
        }
    }
    if(!timThay){
        System.out.println("Khong tim thay sinh vien!");
    }
        
    
}}
