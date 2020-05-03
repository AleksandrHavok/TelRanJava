package Repeat;

//Немного про то как работают статики и откуда они доступны
public class TestStaticCompany {
    static Person[] arr;
    static int count = 0;
    public static void main(String[] args){
        System.out.println("Static Company main");
        arr = new Person [10];
        add(new Person(123,"",123));
  //       - ошибка компиляции, т.к. метод не статический
    }
    public static void add(Person p){
        arr[count]= p;
    }

    public void test(){
        TestStaticCompany.main(null);
        System.out.println("Static company test");
    }
}
