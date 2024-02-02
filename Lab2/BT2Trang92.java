package Lab2;

import java.util.Scanner;

public class BT2Trang92 {
    public static void main(String[] args) {
          Scanner sc =new Scanner(System.in);
        int n;
        do{
            System.out.println("Nhap 1 so nguyen duong ");
            n = sc.nextInt();
        }while(n<=0);
        if(n%2==0){
            System.out.println("So "+n+" la so chan ");
        }else{
            System.out.println("So "+n+" la so le ");
        }
        sc.close();
    }
}
