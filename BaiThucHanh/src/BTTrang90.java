import java.util.Scanner;

public class BTTrang90 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        String chuoi;
        char kyTu;
        System.out.println("nhap vao chuoi bat ky: ");
        chuoi = sc.nextLine();
        System.out.println("Cac ky tu co trong chuoi la: ");
        for(int i=0; i < chuoi.length(); i++){
            kyTu = chuoi.charAt(i);
            System.out.println(kyTu);
        }
        sc.close();
    }

}
