package Lab2;

import java.util.Scanner;

public class BT12Trang97 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m, n;
        System.out.println("Nhap vao so dong cua ma tran: ");
        m = sc.nextInt();
        System.out.println("nhap vao so cot cua ma tran: ");
        n = sc.nextInt();

        int arr[][] = new int[m][n];
        System.out.println("Nhap cac phan tu cho ma tran: ");
        for(int i=0; i<m;i++){
            for(int j=0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        //gia su phan tu tai vi tri (0,0) la phan tu lon nhat
        int max = arr[0][0];{
            for(int i=0; i<m; i++){
                for(int j=0; j<n; j++){
                    if(arr[i][j] > max){
                        max = arr[i][j];
                    }
                }
            }
            System.out.println("phan tu lon nhat trong mang la: " + max);
            sc.close();
        }
}}
