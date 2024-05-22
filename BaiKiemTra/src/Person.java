import java.util.Scanner;

public class Person {
    public String ma;
    public String hoVaTen;
    public String diaChi;
    public Person(String ma, String hoVaTen, String diaChi) {
        this.ma = ma;
        this.hoVaTen = hoVaTen;
        this.diaChi = diaChi;
    }

   public void nhapThongTin(){
    Scanner sc =new Scanner(System.in);
    System.out.println("Nhap ma Person: ");
    String ma = sc.nextLine();
    System.out.println("Nhap ho va ten Person: ");
    String hoVaTen = sc.nextLine();
    System.out.println("Nhap dia chi cua Person: ");
    String diaChi = sc.nextLine();
   }

   public void xuatThongTin(){
    System.out.println("Ma Person: " + ma);
    System.out.println("Ho va ten Person: " + hoVaTen);
    System.out.println("Dia Chi: " + diaChi);
   }

public String getMa() {
    return ma;
}

public void setMa(String ma) {
    this.ma = ma;
}

public String getHoVaTen() {
    return hoVaTen;
}

public void setHoVaTen(String hoVaTen) {
    this.hoVaTen = hoVaTen;
}

public String getDiaChi() {
    return diaChi;
}

public void setDiaChi(String diaChi) {
    this.diaChi = diaChi;
}


   
}
