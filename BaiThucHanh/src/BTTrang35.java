import java.util.Scanner;

public class BTTrang35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap a: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a >b){
            System.out.println(" a lon hon b: " + a);
        }else{
            System.out.println(" b lon hon a: " + b);
        }
        sc.close();
}}
