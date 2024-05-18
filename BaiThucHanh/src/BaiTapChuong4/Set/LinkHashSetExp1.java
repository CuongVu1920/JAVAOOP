package BaiTapChuong4.Set;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class LinkHashSetExp1 {
    public static void main(String[] args) {
        //them cac phan tu
        Set<String> linkedHashSet = new LinkedHashSet<String>();
        linkedHashSet.add("Java");
        linkedHashSet.add("C++");
        linkedHashSet.add("Java");
        linkedHashSet.add("PHP");
        System.out.println("Cac phan tu trong linkedHashSet: ");
        //hien thi set
        for (String str : linkedHashSet) {
            System.out.println(str);
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap phan tu can xoa");
        String s = sc.nextLine();
        if(linkedHashSet.contains(s)){
            linkedHashSet.remove(s);
            System.out.println("Xoa thanh cong!!");
            System.out.println("linkedHashSet moi la: ");
            for (String str : linkedHashSet) {
                System.out.println(str);
            }
        }else{
            System.out.println("Phan tu " + s + " khong co");
        }
        sc.close();
    }
}
