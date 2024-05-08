package List;

import java.util.Scanner;


public class Person {
    public String FullName;
    public String PersonID;

    public void nhapThongTin(){
        Scanner sc = new Scanner(System.in);
        System.out.println("PersonID: ");
        PersonID = sc.nextLine();
        System.out.println("FullName: ");
        FullName = sc.nextLine();
    
    }

    public void inThongTin(){
        System.out.println("PersonID: " + PersonID);
        System.out.println("FullName: " + FullName);
    }
    
}
