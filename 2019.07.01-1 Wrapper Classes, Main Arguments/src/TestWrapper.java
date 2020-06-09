public class TestWrapper {

    public static void main(String[] args) {
        Integer i = new Integer(10);
        i=10;
        int res=1010+i;
//        i=null;
        res=100+i;

        Integer a=20;
        Integer b=20;
        System.out.println(a==b);//до 127 сравнивается внутреннее поле, т.к. идет кэширование данных.
        int c=20;
        System.out.println(a==c);
        a=200;
        b=200;
        c=200;
        System.out.println(a==c);
        System.out.println(a==b);//после 127 идет отмена кэширования данных, поэтому сравниваются ссылки
        System.out.println(a>b);//распаковка и сверка значений внутренних полей
        System.out.println(a<b);//распаковка и сверка

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        System.out.println(Integer.parseInt("123"));//Перевод из стринга в интеджер. Падает с NumberFormatException если введено не число
        //Например "1А00"d упадет, "1000" нет
        System.out.println(Integer.valueOf(312));
        System.out.println(Integer.min(19,20));
        System.out.println(Integer.compare(10, 25));//Если левое больше получаем 1, если равны 0, если правое больше -1

        double d=15.6;
        System.out.println(Double.MAX_VALUE);

        int i1=Integer.MAX_VALUE;
        i1+=1;
        System.out.println(i1);

        double d1=Double.parseDouble("56.87");
        System.out.println(d1);

        System.out.println(0.0/0);// любая операция с инфинити- инфинити, если НаН- то будет НаН
        d1=0.0/0;
        d1=d1*100;
        System.out.println(d1);
        System.out.println(Double.isInfinite(d1));
        System.out.println(Double.isNaN(d1));
        //в дабл можно положить НаН и инфинити
        d1= Double.parseDouble("NaN");
        System.out.println(d1);
        d1= Double.parseDouble("Infinity");
        System.out.println(d1);

        boolean bool= true;
        System.out.println(Boolean.parseBoolean("abc"));//всегда возвращает фолс кроме написания true
        System.out.println(Boolean.parseBoolean("true"));
        System.out.println(Boolean.compare(false, true));

        Character ch='A';
        System.out.println(Character.isDigit(ch));// проверка на попадание в идапазон цифр
        System.out.println(Character.isLowerCase('A'));
        System.out.println(Character.isUpperCase('A'));
    }
}
