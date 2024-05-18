package BaiTapChuong4.Map;

import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHashMapExp1 {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
        
        // add
        linkedHashMap.put(1, "Java");
        linkedHashMap.put(3, "C++");
        linkedHashMap.put(2, "PHP");
        linkedHashMap.put(4, "Python");

        // show linkedHashMap before remove
        System.out.println("Before remove: ");
        show(linkedHashMap);

        // remove
        linkedHashMap.remove(2);

        // show linkedHashMap after remove
        System.out.println("After remove: ");
        show(linkedHashMap);
    }

    public static void show(LinkedHashMap<Integer, String> linkedHashMap) {
        Set<Integer> keySet = linkedHashMap.keySet();
        for (Integer integer : keySet) {
            System.out.println(integer + " " + linkedHashMap.get(integer));
        }
    }   
}
