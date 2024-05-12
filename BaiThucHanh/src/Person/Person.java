package Person;

public class Person {
    public String name ;
    public String gender;
    public String age;
    public Person(){
        name = "Vu Viet Cuong";
        gender = "Nam";
        age = "20";
    }
    public void in(){
        System.out.println(name+" gioi tinh "+gender+" "+age+" tuoi");
    }
    public void in(String ten, String gioitinh, String tuoi){
        System.out.println(ten+" gioi tinh "+gioitinh+ " "+tuoi+" tuoi");
    }
}
