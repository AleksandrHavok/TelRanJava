package Repeat;

public class TestWrapper {
    public static void main(String[] args) {
        //Integer i = new Integer(10);
        Integer i = 10;
        int res = 100 + i;
        i = null;
        //res = 100+ i;

        Integer a =20;
        Integer b=20;
        //до 127 сравнивается внутреннее поле, т.к. идет кэширование данных.
        System.out.println(a==b);
        int c = 20;
        System.out.println(a==c);
        a = 200;
        b = 200;
        c = 200;
        //распаковка и сверка значений внутренних полей
        System.out.println(a > b);
        //распаковка и сверка
        System.out.println(a < b);
        //после 127 идет отмена кэширования данных, потому сравниваются ссылки
        //в данном случае ссылки разные, т.к. 2 объекта integer, будет false
        System.out.println(a == b);
        //в данном случае ссылается на целочисленное int в обоих случаях, потому будет true
        System.out.println(a == c);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        //Перевод из String в Integer.
        //Падает с NumberFormatException если введено не число
        //Например "1A00"d упадет, "1000" нет
        System.out.println(Integer.parseInt("123"));
        System.out.println(Integer.valueOf(231));
        System.out.println(Integer.min(19,20));
        //компаратор, если левое больше, вернет 1, если равны 0, если правое больше, то вернет -1
        System.out.println(Integer.compare(10,25));
        System.out.println("---------------");

        double d=15.6;
        System.out.println(Double.MAX_VALUE);

        int i1= Integer.MAX_VALUE;
        i1+=1;
        //произойдет переполнение, уйдем в отрицательные значения Integer
        System.out.println(i1);

        double d1 = Double.parseDouble("56.87");
        System.out.println(d1);

        System.out.println("---------------");
        //любая операция с бесконечностью - будет бесконечность,
        //если NaN то будет NaN
        System.out.println(0.0/0);
        d1=0.0/0;
        d1=d1*100;
        System.out.println(d1);
        System.out.println(Double.isInfinite(d1));
        System.out.println(Double.isNaN(d1));
        //в дабл можно положить NaN и Infinity
        d1=Double.parseDouble("NaN");
        System.out.println(d1);
        d1=Double.parseDouble("Infinity");
        System.out.println(d1);

        System.out.println("---------------");
        boolean bool = true;
        //всегда вернет false кроме написания true
        System.out.println(Boolean.parseBoolean("abc"));
        System.out.println(Boolean.parseBoolean("true"));
        System.out.println(Boolean.compare(false,true));

        System.out.println("---------------");
        Character ch='A';
        //проверка на попадание в диапазон цифр
        System.out.println(Character.isDigit(ch));
        //проверка на то является ли символ строчным или прописным
        System.out.println(Character.isLowerCase('A'));
        System.out.println(Character.isUpperCase('A'));
    }

}
