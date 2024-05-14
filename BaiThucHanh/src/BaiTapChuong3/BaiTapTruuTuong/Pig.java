package BaiTapChuong3.BaiTapTruuTuong;

public class Pig extends Animal {
    void sound(){
        System.out.println("Oinkoink");
    }
    void eat(){
        System.out.println("Carrot");
    }
    void pet(){
        System.out.println("Pig is not a pet");
    }
    public static void main(String[] args) {
        Animal pig =new Pig();
        pig.eat();
        pig.sound();
        pig.pet();
    }
}