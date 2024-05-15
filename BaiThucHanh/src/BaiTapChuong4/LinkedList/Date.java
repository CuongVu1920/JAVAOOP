package BaiTapChuong4.LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class Date {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //khai bao 1 danh sach lien ket
        //luu tru cac thang trong nam
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("Thang 1");        
        linkedList.add("Thang 2");
        linkedList.add("Thang 3");
        linkedList.add("Thang 4");
        linkedList.add("Thang 5");
        linkedList.add("Thang 6");
        linkedList.add("Thang 7");
        linkedList.add("Thang 8");
        linkedList.add("Thang 9");
        linkedList.add("Thang 10");
        linkedList.add("Thang 11");
        linkedList.add("Thang 12");

        System.out.println("Nhap vao chi so cua phan tu can lay: ");
        int index = sc.nextInt();
        // kiem tra neu chi so lon hon hoac bang 0
        // va nho hon kich thuoc cua LinkedList - 1 thi moi lay
        // nguoc lai thong bao loi;
        if(index < 0 || index > (linkedList.size() -1)){
            System.out.println("chi so can lay phai lon hon 0 va nho hon "  +  (linkedList.size()-1));
        }else{
            // truy cap phan tu co chi so index trong linkedList
            // vi linkedList có kiểu là String
            // nên các phần tử con của cũng có kiểu dữ liệu là String
            String node = linkedList.get(index);
            System.out.println("Phan tu co chi so = " + index + " trong linkedList la " + node);
        }
        //truy cap phan tu dau tien trong danh sach
        //su dung phuoc thuc getFirst
        String firstNode = linkedList.getFirst();

        //truy cap phan tu dau tien trong danh sach
        //su dung phuoc thuc getLast
        String lastNode = linkedList.getLast();
        System.out.println("Phan tu dau tien trong danh sach la: " + firstNode );
        System.out.println("Phan tu cuoi cung trong danh sach la: " + lastNode);

    }
}
