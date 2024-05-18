package BaiTapChuong4.Map;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExp2 {
    public static void main(String[] args) {
        TreeMap<Integer, Double> treeMap = new TreeMap<>();
        
        //add
        treeMap.put(1, 9d);
        treeMap.put(4, 10.1d);
        treeMap.put(2, 7.2d);
        treeMap.put(8, 20.28d);

        System.out.println("Cac phan tu co trong treeMap: ");
        Set<Map.Entry<Integer, Double>> setTreeMap = treeMap.entrySet();
        System.out.println(setTreeMap);

        //thay the value cua entry có khóa là 4
        //thành 20.11d
        treeMap.replace(4, 20.11d);

        //ngoài ra chúng ta có thể thay thế như sau
        //câu lệnh bên dưới sẽ thay thế entry
        // có key là 2, value là 7.2d thành 7.7d
        treeMap.replace(2, 7.2d, 7.7d);
        System.out.println("Cac phan tu co trong treeMap sau khi thay the: ");
        System.out.println(setTreeMap);
    }
}
