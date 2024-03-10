package Shapes;

import java.util.Scanner;

public class HinhChuNhat {
    public float dai;
    public float rong;
    public float cv;
    public float dt;

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("chieu dai hinh chu nhat: ");
        dai = sc.nextFloat();
        System.out.println("chieu rong hinh chu nhat: ");
        rong = sc.nextFloat();
    }
    
    
    
    
    public void tinhChuVi(){
        cv = 2*(dai + rong);
    }

    public void tinhDienTich(){
        dt = dai*rong;
    }
    public void inChuVi(){
        System.out.println("Chu vi Hinh Chu Nhat: " + cv);
    }
    public void inDienTich(){
        System.out.println("Dien tich Hinh chu nhat: " + dt);
    }
}
