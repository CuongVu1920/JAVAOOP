package Lab4;

import java.util.LinkedList;
import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> sapXep = new LinkedList<>();
        System.out.println("Nhap n phan tu: ");
        int n = sc.nextInt();
        for(int i = 0; i<n; i++){
            int num = sc.nextInt();
            sapXep.add(num);
        }
        int count = 0;
        int sum = 0;
        for (Integer integer : sapXep) {
            if(integer %2 == 0){
                sum += integer;
                count ++;
            }
        }
        if(count > 0) {
            double avg = (double) sum/count;
            System.out.println("Trung binh cong cua cac so chan la: " + avg);
        }else{
            System.out.println("Khong co so chan trong danh sach");
        }
        }
        
    }

