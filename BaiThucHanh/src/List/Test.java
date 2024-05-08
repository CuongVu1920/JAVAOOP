package List;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Person> ArrayListPerson = new ArrayList<Person>();

        for(int i=0; i<5; i++){
            Person ps = new Person();
            ps.nhapThongTin();
            ArrayListPerson.add(ps);

        }
        for(int i=0; i< ArrayListPerson.size(); i++){
            ArrayListPerson.get(i).inThongTin();
        }
    }
}
