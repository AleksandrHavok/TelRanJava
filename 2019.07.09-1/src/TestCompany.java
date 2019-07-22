public class TestCompany {
    public static void main(String[] args) {
        Company comp = new Company();
        comp.add(new Person("Vasya", 23));
        comp.add(new Person("Petya", 45));
        comp.add(new Person("Sofya", 25));
        comp.add(new Person("Kolya", 21));
        for(Person p:comp){//может работать только по массиву или методу итератор, соответственно ему нужен итератор из компани
            System.out.println(p);
        }
    }
}
