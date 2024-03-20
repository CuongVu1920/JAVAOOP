package Person;

import java.util.Scanner;

public class Employee extends Person{
    public float luong;
    public float gioLamViec;

    public Employee(){

    }
    void nhap(){
        super.nhapThongTin();
        Scanner sc = new Scanner(System.in);
        System.out.print("Gio lam viec: ");
        gioLamViec = sc.nextFloat();
        
    }
    public void tinhLuong(){
        System.out.println("Luong la: " + luong);

    }
    void in(){
        super.inThongTin();
        System.out.println("\n So gio lam viec: " + gioLamViec);
        System.out.println(" luong la: " + luong);
    }
    
}
