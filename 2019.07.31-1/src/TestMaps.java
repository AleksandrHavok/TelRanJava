import java.util.HashMap;

public class TestMaps {
    public static void main(String[] args) {
        HashMap<Integer,String> names=new HashMap<>();
        names.put(123,"Vasya");
        names.put(321,"Petya");
        names.put(234,"Sofa");

        String name=names.get(321);
        System.out.println(name);
        name=names.get(888);
        System.out.println(name);

        String oldname=names.put(123,"Zamena");
        System.out.println(oldname);//замена текущего значения на то что было раньше
        boolean res=names.containsKey(123);//-true есть ключ
        System.out.println(res);

        String oldValue= names.putIfAbsent(555,"David");
        System.out.println(oldValue);
        oldValue=names.putIfAbsent(555, "Moshe");
        System.out.println(oldValue);
    }
}
