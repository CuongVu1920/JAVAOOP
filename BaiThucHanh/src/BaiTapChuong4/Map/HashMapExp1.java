package BaiTapChuong4.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExp1 {
    public static void main(String[] args) {
        // khai bao 1 HashMap co ten la HashMap
        // kieu du lieu của key và value là String
        HashMap<String, String> hashMap = new HashMap<>();

        //them value vào trong hashMap với key tương ứng
        // sử dụng phương thức put()
        // đổi số thứ nhất trong put là key có kiểu là String
        // và đổi số thứ hai là value có kiểu là String
        hashMap.put("CSLT", "Co so lap trinh");
        hashMap.put("C++", "C++");
        hashMap.put("C#", "C Sharp");
        hashMap.put("PHP", "PHP");
        hashMap.put("Java ", "Java");

        //tạo 1 set có tên là setHashMap
        // chứa toàn bộ các entry (vừa key vừa value) của hashMap
        Set<Map.Entry<String, String>> setHashMap = hashMap.entrySet();
        
        System.out.println("Cac entry co trong setHashMap: ");
        System.out.println(setHashMap);
    }
}
