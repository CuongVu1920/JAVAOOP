package Person;

public class EmployeeP extends Employee{
    public EmployeeP(){
    }
    void nhap1(){
        super.nhap();
    }
    @Override
    public void tinhLuong() {
        luong = gioLamViec*2;
    }
    void in1(){
        super.in();
    }
    
    
}
