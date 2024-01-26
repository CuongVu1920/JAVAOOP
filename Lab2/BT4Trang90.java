package Lab2;

import java.util.Scanner;

public class BT4Trang90 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int thang;
         System.out.println("nhap thang: ");
         thang = sc.nextInt();
        


        switch (thang) {
            case 1:
                System.out.println("Day la thang 1 ");
                break;
            case 2:
                System.out.println(" Day la thang 2 ");
                break;
            case 3:
                System.out.println("Day la thang 3");
                break;
            case 4:
                System.out.println("Day la thang 4 ");
                break;
            case 5:
                System.out.println("Day la thang 5 ");
                break;
            case 6:
                System.out.println("Day la thang 6");
                break;
            case 7:
                System.out.println("Day la thang 7");
                break;
            case 8:
                System.out.println(" Day la thang 8");
                break;
            case 9:
                System.out.println(" Day la thang 9");
            case 10:
                System.out.println(" Day la thang 10");
            case 11:
                System.out.println(" Day la thang 11");
            case 12:
                System.out.println(" Day la thang 12");
            default:
                System.out.println("Nhap sai roi!! hay nhap lai so tu 1->12");
                break;
        }
        sc.close();

    }
}


