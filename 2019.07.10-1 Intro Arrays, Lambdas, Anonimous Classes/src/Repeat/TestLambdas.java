package Repeat;

//Введение в лямбда выражения
//Лямбда выражения - упрощенная запись анонимного класса,
//который реализует функциональный интерфейс
public class TestLambdas {
    public static void main(String[] args) {
//        First f = (value) -> System.out.println(value);
//        f.add("Hello");
        First f = new First() {
            @Override
            public void add(String str) {
                System.out.println(str);
            }
        };
        //Лямбда выражение состоит из списка аргументов в скобках и тела после ->
        //Если в теле всего 1 строка, то можно опустить {/*body*/};
        First f1 = (value) ->System.out.println(value);
        f.add("Hello");
        //В случае, если в метое всего 1 аргумент и для него не требуется объявление типа,
        //то скобки также можно опустить
        Second s = value ->System.out.println(value);
        s.remove(16);
        Third t = i ->{
            for(;i<21;){
                i++;
            }
            return i;
        };
        System.out.println(t.doSome(5));
    }

    //Функциональный интерфейс - интерфейс, в котором объяевлен
    //только один абстрактный метод
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
