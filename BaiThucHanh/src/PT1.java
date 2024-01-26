import java.util.Scanner;

public class PT1 {
    public static void main(String[] args) {
        // PTBN : ax + b = 0;
        /* neu a = 0
         *    neu b = 0 => pt vo so nghiem
         *    neu b !=0 => pt vo nghiem
         * neu a khac 0
         * x = -b/a
         */
        double a, b, x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a = ");
        a = sc.nextDouble();
        System.out.println("Nhap b = ");
        b = sc.nextDouble();

      if(a==0){
        if(b==0){
            System.out.println("Phuong trinh co vo so nghiem");
        }else{
            System.out.println("Phuong trinh vo nghiem");
        }
      }else{
        x = -b/a;
        System.out.println("Phuong trinh co nghiem la: " + x);
      }
    
      sc.close();}
}
