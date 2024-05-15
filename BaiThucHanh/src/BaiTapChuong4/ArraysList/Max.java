package BaiTapChuong4.ArraysList;

import java.util.ArrayList;
import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        ArrayList<Integer> ArrayListInteger = new ArrayList<Integer>();

        Scanner sc = new Scanner(System.in);
        int number; //phan tu cua mang

        System.out.println("Nhap so phan tu cua ArrayList: ");
        int n = sc.nextInt();
        // nhap va them phan tu cho ArrayList
     //tim phan tu lon nhat trong mang su dung phuong compareTo()
        //gia su phan tu lon nhat la phan tu dau tien trong ArrayList
       for(int i = 0; i < n; i++){
        System.out.println("Nhap phan tu thu " + i + ": ");
        number = sc.nextInt();
        ArrayListInteger.add(number);
       }
            // neu ket qua cua phep so sanh nay lon hon 0
            // tuc bien max nho hon phan tu tai vi tri thu i trong ArrayList
            // va do chinh la phan tu lon nhat
          int max = ArrayListInteger.get(0);
          for(int i=1; i < ArrayListInteger.size(); i++){
            if(ArrayListInteger.get(i).compareTo(max) > 0){
                max = ArrayListInteger.get(i);
            }
          }
        System.out.println("Phan tu lon nhat trong ArrayListInteger = " + max);
    }
    
}
