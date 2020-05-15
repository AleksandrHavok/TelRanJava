package Repeat;

public class TestString {
    public static void main(String[] args) {
        String str = "Hello";
        String str1 = "Hello";
        String str2 = new String("Hello");

        //вернет false, т.к. str2 создано в явном виде как новый,
        //соответственно ссылка в отличии от сравнения str и str1 будет отличаться
        System.out.println(str1 == str2);
        //вернет true, т.к. сравнивает объекты
        System.out.println(str1.equals(str2));
        str1 = " HeLlO";
        //false
        System.out.println(str.equals(str1));
        //true, игнорироуем регистр, сравниваем только символы
        //работает через офсет между регистрами в ASCII
        System.out.println(str.equalsIgnoreCase(str1));
        System.out.println("--------------");

        System.out.println(str.length());
        //поиск по индексу
        int i = str.indexOf("l");
        System.out.println(i);
        i = str.lastIndexOf("l");
        System.out.println(i);
        //поиск начиная с определенного индекса, если не найдет - вернет -1
        i = str.indexOf("l", 4);
        System.out.println(i);
        System.out.println("--------------");
        str = "              Hello           ";
        //обрезаем пробелы
        String trimmed = str.trim();
        System.out.println(trimmed);
        System.out.println(str.length());
        System.out.println(trimmed.length());
        str = "        ";
        System.out.println(str.trim());
        str = "              Hello           ";
        //перевод в нижний регистр
        str1 = trimmed.toLowerCase();
        System.out.println(str1);
        //перевод в верхний регистр
        str1 = trimmed.toUpperCase();
        System.out.println(str1);
        System.out.println("----------------");

        //выводим символ из нашей строки по порядковому номеру
        char c = trimmed.charAt(1);
        System.out.println(c);
        //вернуть строку начаиная с элемента Х:
        str1 = str.substring(11);
        System.out.println(str1);
        str1 = str.substring(11, 16);
        System.out.println(str1);
        char[] arr = str1.toCharArray();
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k]);
        }
        System.out.println();
        System.out.println("----------------");
        //проверка на то, что строка пуста, вернет true
        str = "";
        System.out.println(str.isEmpty());
        str = "2358624";
        //проверка с чего начинается строка (префикс)
        System.out.println(str.startsWith("35"));
        System.out.println(str.startsWith("23"));
        //проверка на префикс с конкретной позиции:
        System.out.println(str.startsWith("58", 2));
        //проверка на суффикс:
        System.out.println(str.endsWith("24"));
        System.out.println("2358624".equals(str));
        System.out.println("----------------");

        //разбивает строку на элеменеты массива ориентируюясь на введенную строку.
        str = "Hello, how low?";
        System.out.println(str.split(" ")[0]);
        System.out.println(str.split(" ")[2]);
        System.out.println(str.split(",")[1]);

        //равносильно toCharArry, только работает дольше
        str = "Hello? Hello? Hello? How low?";
        String[] arr1 = str.split(" ");
        //вернет ссылку на массив вместо его вывода
        System.out.println(arr1);
        //выводим массив
        for (int j = 0; j < arr1.length; j++) {
            System.out.println(arr1[j]);
        }

        str = "Helloworld";
        arr1 = str.split(" ");
        //т.к. только 1 слово в массиве, по заданному условию, то вернет, что в массиве 1 элемент:
        System.out.println(arr1.length);
        //уберет 1 пробел между слов и все в конце
        //если в начале нет слова, а только пробелы, то не уберет
        arr1 = "Hello     Hello       ".split(" ");
        //вернет 6 элементов, 2 слова и 4 пробела между ними.
        System.out.println(arr1.length);
        //вернет 3 элемента, 2 пробела в начале и слово
        arr1 = "  Hello   ".split(" ");
        System.out.println(arr1.length);
        System.out.println("----------------");

        String[] tmp = new String[100000];
        for (int j = 0; j < tmp.length; j++) {
            //конкатенация строк
            //tmp[j]=j+"";
            //можно использовать конкатенацию (способ выше), но правильнее использовать
            //valueOf, т.к. превращает примитив напрямую в строку
            tmp[j] = String.valueOf(j);
        }
        //сравнение скорости конкатенации и valueOf.
        String res = "";
        long start = System.currentTimeMillis();
        for (int j = 0; j < tmp.length; j++) {
            res = res + tmp[j];
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);

        start = System.currentTimeMillis();
        for (int j = 0; j < tmp.length; j++) {
            tmp[j] = String.valueOf(j);
        }
        end = System.currentTimeMillis();
        System.out.println(end - start);

        //для циклов лучше использовать StringBuilder, т.к. в разы быстрее, чем прямая конкатенация
        //без цикла лучше использовать конкатенацию вида + + + +
        StringBuilder sb = new StringBuilder();
        start = System.currentTimeMillis();
        for (int j = 0; j < tmp.length; j++) {
            sb.append(tmp[j]);
        }
        end = System.currentTimeMillis();
        System.out.println(end - start);
        System.out.println("----------------");

        int num = 12345;
        str = String.valueOf(num);
        sb = new StringBuilder(str);
        //пустить символы в обратном порядке
        sb.reverse();
        num = Integer.parseInt(sb.toString());
        System.out.println(num);

    }
}