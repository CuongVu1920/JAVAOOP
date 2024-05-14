package BaiTapChuong3.BaiTapTruuTuong;

public class Car implements HangXe {
    public void ten(){
        System.out.println("Car Camry");
    }
    public void gia(){
        System.out.println("1.1 ty vnd");
    }
    public void soluongbanra(){
        System.out.println("1000");
    }
    public static void main(String[] args) {
        Car ty = new Car();
        ty.ten();
        ty.gia();
        ty.soluongbanra();
    }
}