package Shapes;

import java.util.Scanner;

public class HinhTron {
    public final float PI = 3.14f;
    public float r;
    public float cv;
    public float dt;

    public void nhapBanKinh(){
        System.out.println("Hay nhap vao ban kinh hinh tron: ");
        Scanner sc = new Scanner(System.in);
        r = sc.nextFloat();
    }

    public void tinhChuVi(){
        cv = 2*PI*r;
    }
    public void tinhDienTich(){
        dt = PI*r*r;
    }
    public void inChuVi(){
        System.out.println("Chu vi Hinh Tron: " + cv);
    }
    public void inDienTich(){
        System.out.println("Dien tich Hinh tron: " + dt);
    }
}
