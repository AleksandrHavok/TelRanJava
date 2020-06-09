package Repeat;

public class VariableAppl2 {

    public static void main(String[] args) {
        System.out.print("Hell world!\n");
        System.out.println("whoa");
        byte b0 = 127;
        b0++;
        System.out.println(b0);
        short s = 13000;
        System.out.println(s);
        int i = 100500;
        System.out.println(i);
        long l = 10_000_000_000l;//добавляем L и расширяем диапазон с 4 байт до 8
        System.out.println(l);
        double a0 = 3.14159265;
        //любое float Java считает 8 байтовым, при переводе в 4 байта
        //оно не влезает и надо дописать f, чтобы чисто поместилось
        float pi1 = 3.14159265f;
        float pi = (float) a0;
        double exp = 2.718281828;
        System.out.println(a0);
        System.out.println(pi1);
        System.out.println(pi);
        System.out.println(exp);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Double.MAX_VALUE);
        System.out.println(Float.MAX_VALUE);
        boolean check = exp <= a0;
        System.out.println(check);
        double res0 = max(5, 6);
        System.out.println(res0);
        /*Ниже будем вызывать методы*/
        System.out.println("---------------------------");
        int z = sign(5);
        System.out.println(z);

        char c = 'A';
        System.out.println(c + 1);
        int a = 1;
        int b = a++ + ++a;
        System.out.println(a);
        System.out.println(b);
        double res = min(5, 6);
        System.out.println(res);
        String str = "Hello";
        System.out.println(str);
        str = 1 + 2 + "var =" + 3 + 4;
        System.out.println(res);

        calc(5, 0, "*");
        tumbalalayka();
        System.out.println("---------------------------");
        //Ниже будут массивы

        int arr[] = {2, 3, 5, 7, 11, 13, 17, 19};
        System.out.println("Length= " + arr.length);
        printArray(arr);
        System.out.println("---------------------------");
        int[] arr1=new int[5];
        printArray(arr1);
        System.out.println("---------------------------");
        int x=arr1[arr1.length-1];
        System.out.println(x);
        System.out.println("---------------------------");
        x=sumArray(arr);
        System.out.println("Sum array elements= "+ x);
        System.out.println("---------------------------");
        fillArray(arr1,10,20);
        printArray(arr1);
    }

    public static int sign(double x) {
        return x > 0 ? 1 : x < 0 ? -1 : 0;//тернарный оператор ветвления
    }

    public static double max(double a, double b) {
        return a > b ? a : b;
    }

    public static double min(double a, double b) {
        boolean check = a > b;
        if (check) {
            return b;
        } else {
            return a;
        }
    }


    public static void calc(double x, double y, String oper) {
        switch (oper) {
            case "+":
                System.out.println(x + y);
                break;
            case "-":
                System.out.println(x - y);
                break;
            case "*"://проваливаемся в следующий case, т.к. нет break;
            case "X":
                System.out.println(x * y);
                break;
            case ("/"):
                System.out.println(x / y);
            default:
                System.out.println("Wrong operation!");
                break;
        }
    }

    public static void tumbalalayka() {
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
        System.out.println("GO!");
    }

    private static void printArray(int[] arr){
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    private static int sumArray(int[] arr){
        int res=0;
        for (int i=0;i<arr.length;i++){
            res += arr[i];
        }
        return res;
    }
    /*способ заполнения массива от min включительно, до max не включительно
    min=10,max=20 это от 10 до 19 соответственно
    */
    public static void fillArray(int[] arr,int min,int max){
        for(int i=0; i<arr.length;i++){
            arr[i]=(int)(min+Math.random()*(max-min));
        }
    }


}

