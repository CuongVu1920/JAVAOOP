package Lab2;

import java.util.Scanner;

public class BT9Trang96 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao mot chuoi: ");
        String s = sc.nextLine();

        int demchuthuong = 0;
        int demchuhoa = 0;
        int demso = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isLowerCase(c)) {
                demchuthuong++;
            } else if (Character.isUpperCase(c)) {
                demchuhoa++;
            } else if (Character.isDigit(c)) {
                demso++;
            }
        }

        System.out.println("so ky tu thuong: " + demchuthuong);
        System.out.println("so ky tu viet hoa: " + demchuhoa);
        System.out.println("ky tu so: " + demso);

        
        sc.close();
    }
}
