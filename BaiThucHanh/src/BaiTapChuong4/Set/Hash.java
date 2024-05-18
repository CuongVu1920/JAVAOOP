package BaiTapChuong4.Set;

import java.util.HashSet;
import java.util.Scanner;

public class Hash {
    public static void main(String[] args) {
        HashSet<String> hashSetString = new HashSet<String>();
        Scanner sc = new Scanner(System.in);

        //them phan tu vao hashSetString
        hashSetString.add("Wilson");
        hashSetString.add("Nike");
        hashSetString.add("Volvo");
        hashSetString.add("Kia");
        hashSetString.add("Lenovo");
        hashSetString.add("Lenovo");

        //hien thi cac phan tu trong hashSetString
        System.out.println("Cac phan tu trong hashSetString: "); 
        System.out.println(hashSetString);
        System.out.println("Nhap phan tu can xoa: ");
        String name;
        name = sc.nextLine();
        if(hashSetString.contains(name)){
            hashSetString.remove(name);
            System.out.println("Xoa thanh cong");
            System.out.println("Cac phan tu con lai trong hashSetString: ");
            System.out.println(hashSetString);
        }else{
            System.out.println("Xoa khong thanh cong!");
        }

        sc.close();
    }

}
