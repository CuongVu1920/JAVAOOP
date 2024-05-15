package BaiTapChuong4.LinkedList;

import java.util.LinkedList;

public class Linked {
    public static void main(String[] args) {
        // khai bao 1 LinkedList co ten la list;
        // có kiểu là String

        LinkedList<String> list = new LinkedList<String>();
        // Add objects to list
        list.add("Java");
        list.add("C++");
        list.add("PHP");

        System.out.println("vi du su dung phuong thuc addALL()");
        System.out.println("-----------------------------------");
        // Thêm các phần tử của list vào List A
        LinkedList<String> listA = new LinkedList<String>();
        listA.addAll(list);
        System.out.println("list A: ");
        System.out.println(listA);

        System.out.println("\n vi du su dung phuong thuc retainAll()");
        System.out.println("-----------------------------");
        //Khởi tạo listB
        LinkedList<String> listB = new LinkedList<String>();
        list.add("Java");
        //xóa những phần tử không thuộc list B khỏi list A
        list.removeAll(listB);
        System.out.println("list: " + list);
    }
    public static void show(LinkedList<String> list){
        //show list through for each
        for (String obj : list) {
            System.out.println("\t" + obj + ",");
        }
        System.out.println();
    }
}
