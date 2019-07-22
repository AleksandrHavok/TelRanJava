public class TestLambdas {
    public static void main(String[] args) {
//        First f = (value) -> System.out.println(value);
//        f.add("Hello");
        First f=new First() {
            @Override
            public void add(String str) {
                System.out.println(str);
            }
        };
        First f1=(value)-> System.out.println(value);
        f.add("Hello");
        Second s=(value)-> System.out.println(value);
        s.remove(10);

        Third t1=(i) -> {
            for(;i<10;){
                i++;
            }
            return i;
        };
        System.out.println(t1.doSome(5));
    }

    //fun  interface работает только если в интерфейсе ровно 1 абстрактный метод
    @FunctionalInterface
    interface First {
        void add(String str);

    }

    @FunctionalInterface
    interface Second {
        void remove(int i);
    }

    @FunctionalInterface
    interface Third {
        int doSome(int i);
    }
}
