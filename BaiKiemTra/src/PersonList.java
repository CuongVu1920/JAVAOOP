import java.util.LinkedList;
import java.util.List;

public class PersonList {
    List<Person> PersonList = new LinkedList<>();

    public void themPerson(Person ps){
        PersonList.add(ps);
    }
    public void xoaPerSon(){
        PersonList.removeAll(PersonList);
    }

   public void hienThiThongTin(){
    for (Person person : PersonList) {
        System.out.println(person);
    }
   }

  public boolean suaThongTin(String maSinhVien, Person psm){
    for (Person person : PersonList) {
        if(person.getMa().equals(psm)){
            person.setHoVaTen(psm.getHoVaTen());
            person.setDiaChi(psm.getDiaChi());
            return true;
        }
        }
        return false;
    }
  }

