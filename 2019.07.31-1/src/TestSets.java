import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TestSets {

    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();
        System.out.println(names.add("Vasya"));
        System.out.println(names.add("Petya"));
        System.out.println(names.add("Anna"));
        System.out.println(names.add("Vasya"));
        System.out.println(names.size());

        for(String str : names) {
            System.out.println(str);
        }

        System.out.println("Vasya".hashCode());
        System.out.println("Petya".hashCode());
        System.out.println("Anna".hashCode());

        System.out.println(names.remove("Vasya"));
        System.out.println(names.contains("Anna"));
        names.clear();

        names.add("Alla");
        names.add("Anna");
        names.add("Alex");
        names.add("Sofa");
        names.add("Vasya");
        names.add("Petya");

//		boolean flag = true;
//		while(flag) {
//			flag = false;
//			for(String name : names) {
//				if(name.startsWith("A")) {
//					names.remove(name);
//					flag = true;
//					break;
//				}
//			}
//		}

//		Iterator<String> itr = names.iterator();
//		while(itr.hasNext()) {
//			if(itr.next().startsWith("A")) {
//				itr.remove();
//			}
//		}

        names.removeIf(name -> name.startsWith("A"));

        for(String str : names) {
            System.out.println(str);
        }

        LinkedHashSet<String> names2 = new LinkedHashSet<>();
        names2.add("Vasya");
        names2.add("Petya");
        names2.add("Anna");
        System.out.println("------------");
        for(String str : names2) {
            System.out.println(str);
        }

        TreeSet<String> names3 = new TreeSet<>();
        names3.add("Vasya");
        names3.add("Petya");
        names3.add("Anna");
        System.out.println("---------------");
        for(String str : names3) {
            System.out.println(str);
        }

        TreeSet<Person> persons = new TreeSet<>();
        persons.add(new Person(123,"Vasya",23));
        persons.add(new Person(111,"Petya",32));
        persons.add(new Person(123,"Anna",27));
        persons.add(new Person(234,"Vasya",32));
        for(Person p : persons) {
            System.out.println(p);
        }
    }

}