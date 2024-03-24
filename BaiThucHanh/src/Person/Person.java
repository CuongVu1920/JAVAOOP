package Person;

import java.util.Scanner;

public class Person {
    public String ten;
    public String tuoi;
    public String gioiTinh;

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ten: ");
        ten = sc.nextLine();
        System.out.println("nhap tuoi: ");
        tuoi = sc.nextLine();
        System.out.println("nhap gioi tinh: ");
        gioiTinh = sc.nextLine();
    }
    public void xuat(){
        System.out.println("Ten la: " + ten);
        System.out.println("tuoi: " + tuoi);
        System.out.println("gioi Tinh: " + gioiTinh);
    }
}
