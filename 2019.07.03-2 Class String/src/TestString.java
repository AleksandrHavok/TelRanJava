public class TestString {
    public static void main(String[] args) {
        String str = "Hello";
        String str1 = "Hello";
        String str2 = new String("Hello");

        System.out.println(str1 == str2);//false т.к. стр2 создан в явном виде как новый,
        // то объект то ссылка отличается от случаев сравнения стр и стр1
        System.out.println(str1.equals(str2));//true
        str1 = " HeLLo";
        System.out.println(str.equals(str1));//false
        System.out.println(str.equalsIgnoreCase(str1));//true, игнорируем регистр сравнивая только символы
        // (работает через офсет между регистрами в аскии)
        System.out.println(str.length());
        int i = str.indexOf("l");
        System.out.println(i);
        i = str.lastIndexOf("l");
        System.out.println(i);
        i = str.indexOf("l", 4);//если не находим вернет -1
        System.out.println(i);
        System.out.println("----------------------");
        str = "           Hello         ";
        String trimmed = str.trim();
        System.out.println(trimmed);
        System.out.println(str.length());
        System.out.println(trimmed.length());
        str = "    ";
        System.out.println(str.trim());
        str = "           Hello         ";
        str1 = trimmed.toLowerCase();
        System.out.println(str1);
        str1 = trimmed.toUpperCase();
        System.out.println(str1);
        System.out.println(str1);
        System.out.println("How low?");
        System.out.println("----------------------");
        char c = trimmed.charAt(2);
        System.out.println(c);
        str1 = str.substring(11);//вернуть строку начиная с какого-то элемента
        System.out.println(str1);
        str1 = str.substring(11, 16);
        System.out.println(str1);
        char[] arr = str1.toCharArray();
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }
        System.out.println("----------------------");
        str = "";
        System.out.println(str.isEmpty());
        str = "054352362";
        System.out.println(str.startsWith("054"));//проверка с чего начинается строка (префикс)
        System.out.println(str.startsWith("352", 3));//проверка на префикс с конкретной позиции
        System.out.println(str.endsWith("62"));//проверка на суффикс
        System.out.println("054352362".equals(str));

        str = "Hello world";
        System.out.println(str.split(" ")[0]);
        System.out.println(str.split(" ")[1]);
        str = "Hello world, i'm developer!";
        String[] arr1 = str.split(" ");//равносильно toCharArray но работает дольше
        System.out.println(arr1.length);
        for (int j = 0; j < arr1.length; j++) {
            System.out.println(arr1[j]);
        }

        str = "Helloworld";
        arr1 = str.split(" ");
        System.out.println(arr1.length);
        arr1 = "   Hello World       ".split(" ");//убирает пробелы между слов и в конце
        System.out.println(arr1.length);
        arr1 = " Hello  ".split(" ");//убирает пробелы только в конце
        System.out.println(arr1.length);
        System.out.println("----------------------");
        String[] tmp = new String[100000];
        for (int j = 0; j < tmp.length; j++) {
//            tmp[j]=j+"";
            tmp[j] = String.valueOf(j);//можно использовать способ сверху(конкатенация), но правильнее исп valueOf
            // т.к. превращаем напрямую примитив в строку
        }
        String res = "";
        long start = System.currentTimeMillis();
        for (int j = 0; j < tmp.length; j++) {
            res = res + tmp[j];
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);

        StringBuilder sb = new StringBuilder();//Для циклов клеит в разы быстрее, чем прямая конкатенация
        //Без цикла лучше использовать простую конкатенацию вида + + + + 
        start = System.currentTimeMillis();
        for (int j = 0; j < tmp.length; j++) {
            sb.append(tmp[j]);
        }
        end = System.currentTimeMillis();
        System.out.println(end - start);
        System.out.println("----------------------");
        int num = 12345;
        str = String.valueOf(num);
        sb = new StringBuilder(str);
        sb.reverse();
        num = Integer.parseInt(sb.toString());
        System.out.println(num);
    }
}
