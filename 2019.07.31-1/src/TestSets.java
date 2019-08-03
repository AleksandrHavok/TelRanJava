import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TestSets {

    public static void main(String[] args) {
        HashSet<String> names= new HashSet<>();
        System.out.println(names.add("Vasya"));
        System.out.println(names.add("Petya"));
        System.out.println(names.size());
        for(String str:names){
            System.out.println(str);
        }
        System.out.println("--------");
        System.out.println("Vasya".hashCode());
        System.out.println("Petya".hashCode());
        System.out.println("Anna".hashCode());
        System.out.println("--------");
        System.out.println(names.remove("Petya"));
        System.out.println(names.remove("Anna"));
        names.clear();
        System.out.println("--------");
        names.add("Alex");
        names.add("Alla");
        names.add("Vasya");
        names.add("Sofa");
        names.add("Anna");
        names.add("Petya");
//
//        boolean flag=true;
//        while(flag) {
//            flag=false;
//            for (String name : names) {
//                if (name.startsWith("A")) {
//                    names.remove(name);
//                    flag=true;
//                    break;
//                }
//            }
//        }
        names.removeIf(name->name.startsWith("A"));
        for(String str:names){
            System.out.println(str);
        }
        System.out.println("----------");
        LinkedHashSet<String> names2=new LinkedHashSet<>();//тоже самое что выше, но сохраняет порядок добавления
        names2.add("Vasya");
        names2.add("Petya");
        names2.add("Anna");

        for(String str:names2){
            System.out.println(str);
        }
        System.out.println("----------");
        TreeSet<String> names3=new TreeSet<>();
        names3.add("Vasya");
        names3.add("Petya");
        names3.add("Anna");

        for(String str:names3){
            System.out.println(str);
        }
        System.out.println("----------");
        TreeSet<Person> persons = new TreeSet<>();
        persons.add(new Person(123,"Vasya",23));
        persons.add(new Person(311,"Petya",35));
        persons.add(new Person(123,"Anna",29));
        persons.add(new Person(223,"Vasya",27));
        for (Person p:persons){
            System.out.println(p);
        }

    }
}
