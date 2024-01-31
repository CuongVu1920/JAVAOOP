package Lab2;

import java.util.Scanner;

public class BT6Trang95 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do{
            System.out.println("Nhap vao so nguyen n: ");
            n = sc.nextInt();
        }while(n<=0);

        int giaithua = 1;
        for(int i=1; i<=n; i++){
            giaithua = giaithua*i;
        }
        System.out.println("giai thua cua " + n + " la " + giaithua);
        sc.close();
    }
    
}
