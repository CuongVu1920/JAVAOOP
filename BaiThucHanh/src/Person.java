public class Person {
    public String ten;
    public String gioiTinh;
    public int tuoi;

    public Person(){
        ten = "CuongVu";
        gioiTinh = "Nam";
        tuoi = 20;
    }

    public void in(){
        System.out.println(ten + " - " + gioiTinh + " - " + tuoi);
    }
    public void in(String name, String gender, double age){
        System.out.println(name + " - "  + gender + " - " + age);
    }
}
