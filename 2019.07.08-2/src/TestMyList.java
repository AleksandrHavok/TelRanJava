public class TestMyList {
    public static void main(String[] args) {
        MyList <Integer> list=new MyList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.remove(2);
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        MyList <String> names=new MyList<>();
        names.add("Vasya");
        names.add("Petya");
        names.add("Sasha");
        for (int i=0;i<names.size();i++){
            System.out.println(names.get(i));
        }

        MyList<Person> person = new MyList<>();
        person.add(new Person("Vasya",23,123));
        person.add(new Person("Petya",32,321));
        person.add(new Person("Sasha",23,123));
        for (int i=0;i<person.size();i++){
            System.out.println(person.get(i));
        }

        IList<Integer> ilist=new IntegerListImpl();
    }
}
