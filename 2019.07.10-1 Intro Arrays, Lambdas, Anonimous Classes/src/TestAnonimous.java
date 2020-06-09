public class TestAnonimous {
    public static void main(String[] args) {
        MyClass c1 = new MyClass();
        c1.display();

        MyClass c2 = new MyClass() {//реализация анонимного класса
            void display() {//переопределяем метод
                System.out.println("My realisation");
            }
        };
        c2.display();
        System.out.println(c2.getClass().getName());
        System.out.println(c1.getClass().getName());


        final int sum=10;// в анонимных классах можно юзать только final переменные

//        sum=100;
        MyInteface my= () -> System.out.println("Do"+ sum);
        my.doSome();
        System.out.println(my.getClass().getName());
    }

    interface MyInteface {
        void doSome();
    }

    static class MyClass {
        void display() {
            System.out.println("MyClass");
        }
    }


}
