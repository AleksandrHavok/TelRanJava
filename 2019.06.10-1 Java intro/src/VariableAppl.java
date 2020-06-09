public class VariableAppl {


    public static void main(String[] args) {
//        System.out.print("hello world!\n");
//        System.out.println("whoa");
//        byte b = 127;
//        b++;
//        System.out.println(b);
//        short s = 10000;
//        System.out.println(s);
//        int i = 100500;
//        System.out.println(i);
//        long l = 10_000_000_000l;//добавляя l мы расширяем диапазон с 4 байт до 8
//        System.out.println(l);
//        double a = 3.14159265;
//        //float pi=3.14159265;//любое число float джава априори считает 8 байтовым, при переводе в 4 байта оно не влезает и необходимо дописать f, чтобы число поместилось
//        float pi = (float) a;
//        double exp = 2.718281828;
//        System.out.println(a);
//        System.out.println(pi);
//        System.out.println(exp);
//        System.out.println(Long.MAX_VALUE);
//        System.out.println(Double.MAX_VALUE);
//        System.out.println(Float.MAX_VALUE);
//        boolean check = exp <= a;
//        System.out.println(check);
//        double res = max(5, 6);
//        System.out.println(res);
//        int z=sign(5);
//        System.out.println(z);

//        char c = 'A';
//        System.out.println(c + 1);
//        int a = 1;
//        int b = a++ + ++a;
//        System.out.println(a);
//        System.out.println(b);
//        double res = min(5, 6);
//        System.out.println(res);
//        String str = "Hello";
//        System.out.println(str);
//        str = str + " world";
//        System.out.println(str);
//        str = 1 + 2 + "var =" + 3 + 4;
//        System.out.println(str);
//        calc(5, 0, "/");

        haharin();
        System.out.println("===============");


        int arr[] = {2, 3, 5, 7, 11, 13, 17, 19};
        System.out.println("Length= " + arr.length);
        printArray(arr);
        System.out.println("===============");
        int[] arr1 = new int[5];
        printArray(arr1);
        System.out.println("===============");
        int x = arr1[arr1.length - 1];
        System.out.println(x);
        System.out.println("===============");
        x = sumArray(arr);
        System.out.println("Sum array numbers= "+x);
        System.out.println("===============");
        fillArray(arr1,10,20);
        printArray(arr1);
    }

    private static int sumArray(int[] arr) {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            res += arr[i];
        }
        return res;
    }

    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }


    public static double max(double a, double b) {
        return a > b ? a : b;
    }

    public static int sign(double x) {
        return x > 0 ? 1 : x < 0 ? -1 : 0;
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
            case "*":
            case "X":
                System.out.println(x * y);
                break;
            case "/":
                System.out.println(x / y);
                break;
            default:
                System.out.println("Wrong operation");
                break;
        }
    }

    public static void haharin() {
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
        System.out.println("GO!");
    }
public static void fillArray(int[] arr,int min,int max){
        for (int i=0;i<arr.length;i++){
            arr[i]=(int)(min+Math.random()*(max-min+1));
        }
}
}