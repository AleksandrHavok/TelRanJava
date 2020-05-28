package Repeat;

public class TestCompany {
    public static void main(String[] args){
        Company comp = new Company();
        comp.add(new Person("Vasya",23));
        comp.add(new Person("Petya",25));
        comp.add(new Person(12,"Sasha",27));
        comp.add(new Person("Sergey",28));
        //цикл foreach - упрощенный for
        //может работать только по массиву или методу итератора,
        //Пока hasNext() возвращает true, в p пишет, что возвращает next()
        //Соответственно сейчас ему требуется для работы итератор из Company
        for(Person p: comp){
            System.out.println(p);
        }
    }
}
