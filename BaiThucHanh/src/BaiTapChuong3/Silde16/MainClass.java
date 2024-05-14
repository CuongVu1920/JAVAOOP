package BaiTapChuong3.Silde16;

import Person.Student;

public class MainClass {
    public static void main(String[] args) {
       Employee nv = new Employee();
       nv.nhap();
       nv.in();
       Person ps = new Person();
       ps.in();
       Student st = new Student();
       st.nhap();
       st.tinhTuoi();
       st.in();
       HinhChuNhat hcn =new HinhChuNhat();
       hcn.nhap(2, 5);
       hcn.tinhtoan();  
       hcn.in();
       HinhTron ht = new HinhTron();
       ht.nhap();
       ht.tinhChuVi();
       ht.tinhdienTich();
       ht.in();
    }

}
