package Lab2;

import java.util.Scanner;

public class BT8Trang95 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan tu: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            System.out.println("phan phan tu thu " + i);
            arr[i] = sc.nextInt();
        }

        double sum = 0;
        for(int i=0; i<n; i++){
            sum += arr[i];
        }
        sum = sum/n;
        System.out.println("trung binh cong cua " + n + " la: " + sum);
        sc.close();
    }
    
    }
