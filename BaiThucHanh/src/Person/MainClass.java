package Person;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("Test NV Full Time");
        EmployeeF ef = new EmployeeF();
        ef.nhap1();
        ef.tinhLuong();
        ef.in1();
        
        System.out.println("Test NV Part Time");
        EmployeeP ep = new EmployeeP();
        ep.nhap1();
        ep.tinhLuong();
        ep.in1();
    }
}
