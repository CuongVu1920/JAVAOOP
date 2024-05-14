package BaiTapChuong3.BaiTapTruuTuong;

public class Cat extends Animal {
    void sound(){
        System.out.println("Meowmeow");
    }
    void eat(){
        System.out.println("Fish ");
    }
    void pet(){
        System.out.println("Cat is a pet");
    }
    public static void main(String[] args) {
        Animal cat = new Cat();
        cat.sound();
        cat.eat();
        cat.pet();
    }
}