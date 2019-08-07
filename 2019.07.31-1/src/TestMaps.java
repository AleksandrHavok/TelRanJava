import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestMaps {
    static HashMap<String,Integer> bag = new HashMap<>();

    public static void main(String[] args) {
        HashMap<Integer,String> names = new HashMap<>();
        names.put(123, "Vasya");
        names.put(321, "Petya");
        names.put(234, "Sofa");

        String name = names.get(123);
        System.out.println(name);

        String oldName = names.put(123, "Anna");
        System.out.println(names.get(123));
        System.out.println(oldName);//замена текущего значения на то что было раньше

        boolean res=names.containsKey(123);//-true есть ключ
        System.out.println(res);
        System.out.println("-------------------");

        String oldValue = names.putIfAbsent(555, "David");//т.к. в 555 нет ассоциации значения, то вернет  null и запишет David
        System.out.println(oldValue);
        oldValue = names.putIfAbsent(555, "Moshe");//ассоциация в 555 есть, потому новое значение не запишет и вернет предыдущее значение
        System.out.println(oldValue);
        System.out.println(names.get(555));
        System.out.println("-------------------");

        name = names.getOrDefault(789, "NoName");//по сути заглушка против NPE
        System.out.println(name);
        System.out.println(names);
        System.out.println(names.get(789));
        System.out.println("-------------------");
        addProduct("Tomato");
        addProduct("Potata");
        addProduct("Tomato");
        addProduct("Bread");
        addProduct("Tomato");
        System.out.println(bag);
        System.out.println("-------------------");
        displayCharactesCount("aaabcdbadcvbdavs");
        System.out.println("-------------------");
        Set<Integer> keys = names.keySet();//возвращает набор Set ключей которые содержатся в мапе
        System.out.println(keys);
        System.out.println("-------------------");
        for(Integer i : keys) {
            if(i == 234) {
                keys.remove(i);//удаляет значение из set и соответственно убираем значение из мапы
                break;
            }
        }
        System.out.println(names);
        System.out.println("-------------------");
        System.out.println("-------------------");
        Collection<String> values = names.values();//возвращает коллекцию Collection значений
        System.out.println(values);

        /*
        todo
        Удалять ключи можно с затиранием значения
        Вьюха- ссыль либо на лист/коллекцию (сет ключ/значение)
        Entry-интерфейс, в в котором можно сразу добавить пару ключ значение
        В сете не повторяются значения (?)
         */
        Set<Entry<Integer,String>> entries = names.entrySet();
        System.out.println(names);
        for(Entry<Integer,String> entry : entries) {
            entry.setValue("NoName");
//			System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        System.out.println(names);
    }

    static void addProduct(String name) {
        Integer count = bag.get(name);
        if(count == null) {
            count = 0;
        }
        bag.put(name, ++count);
    }

    public static void displayCharactesCount(String str) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0; i < str.length(); i++) {
            Character curr = str.charAt(i);
//			Integer count = map.getOrDefault(curr, 0);
//			map.put(curr, ++count);
            map.merge(curr, 1, (a,b) ->a+b);
            /* curr-ключ в мапе
            a- текущее значение ключа в мапе, если ключ уже есть
            b- новое значение для ключа
            если приходит ключ, который уже есть в мапе, то выполняем действие из функции remappingFunction
            */
        }
        System.out.println(map);
    }

}