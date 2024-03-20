package Person;

public class EmployeeF extends Employee{
    public EmployeeF(){
    }
    void nhap1(){
        super.nhap();
    }
    @Override
    public void tinhLuong() {
        luong = gioLamViec*3;
    }
    void in1(){
        super.in();
    }
    
}
