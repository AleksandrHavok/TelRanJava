import java.util.Map;
import java.util.TreeMap;

public class TestTreeMap {

    public static void main(String[] args) {
        TreeMap<Integer,String> map=new TreeMap<>();
        System.out.println(map.put(123, "Vasya"));
        System.out.println(map.put(345, "Petya"));
        System.out.println(map.put(222, "Sofa"));

        System.out.println(map);
        System.out.println(map.put(123,"David"));
        System.out.println(map);
        System.out.println("------------------");

        Map<Integer,String> subMap = map.subMap(100, 300);
        System.out.println(subMap);
    }
}
