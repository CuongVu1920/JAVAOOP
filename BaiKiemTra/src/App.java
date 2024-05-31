public class App {
    public static void main(String[] args) throws Exception {
        Person ps = new Student("123", "Cuong Vu", "Ha Noi", "2221050692", 7.0);
        ps.nhapThongTin();
        ps.xuatThongTin();
        PersonList psl = new PersonList();
        psl.themPerson(ps);
        psl.xoaPerSon();
        psl.suaThongTin(null, ps);
        psl.hienThiThongTin();

    }
}
