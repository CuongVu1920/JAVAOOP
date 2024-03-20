package Person;

import java.util.Scanner;

public class Person {
    public String ten;
    public int tuoi;

public Person(){

}
    public void nhapThongTin(){
        System.out.println("Thong tin bao gom:");
        Scanner sc = new Scanner(System.in);
        System.out.print("Ten la: ");
        ten = sc.nextLine();
        System.out.print("Tuoi la: ");
        tuoi = sc.nextInt();
    }
    public void inThongTin(){
        System.out.print("\n Ten la: " + ten );
        System.out.print("\n Tuoi la: " + tuoi );
    }
    
}
