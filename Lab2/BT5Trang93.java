package Lab2;

import java.util.Scanner;

public class BT5Trang93 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        int n;
        int sum =0;
        do{
            System.out.println("nhap so n: ");
            n = sc.nextInt();
            sum +=n;
        }while(sum<100);
        System.out.println("tong cac so nguyen vua nhap: " + sum);
        sc.close();
    }
}