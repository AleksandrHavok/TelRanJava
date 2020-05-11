package Repeat;

//класс для расчета введенной в конфигуратор арифметической строки
//при вводе в конфигуратор разделение между элементами массива args идет при помощи пробелов
//10 + 2 это массив из трёх элементов
//10+2 - один элемент
public class Calculator {
    public static void main(String[] args) {
        /*TODO
        Калькулятор, передаем в String[] args 2 операнда
        в качестве умножения x вместо *
        +-/x% - 5 операций
        передали 23+23, он выдает:
        23+23=46
        -----------------------------
        вводим 2+2*2=6
        Выражение любой длины без скобок, можно побаловаться со скобками
        ошибки это две операции подряд, например 2++42
         */
        args = calc(args);
        //вывод ответа
        System.out.println(Double.parseDouble(args[0]));
    }

    //метод для определения индекса следующей выполняемой операции
    //индекс определяется исходя из приоритета математической операции
    //для операций с одинаковым приоритетом, выбирается наименьший индекс (т.к. операция должна выполняться раньше)
    static int operationPriority(String[] args) {
        int indx = 0;
        //массив, который будет содержать операции одного приоритета
        int[] operArr;
        if (indexOf(args, "x") > 0 || indexOf(args, "/") > 0 || indexOf(args, "%") > 0) {
            //сортировка высокоприоритетных операций - "x", "/", "%"
            operArr = new int[]{indexOf(args, "x"), indexOf(args, "/"), indexOf(args, "%")};
        } else {
            //сортировка по низкоприоритетным операциям - "+", "-"
            operArr = new int[]{indexOf(args, "+"), indexOf(args, "-")};
        }
        //пузырьковая сортировка по индексам, в порядке уменьшения приоритета
        for (int i = 1; i < operArr.length; i++) {
            for (int j = 0; j < operArr.length - i; j++) {
                if (operArr[j] > operArr[j + 1]) {
                    indx = operArr[j + 1];
                    operArr[j + 1] = operArr[j];
                    operArr[j] = indx;
                }
            }
        }
        //проверка, чтобы точно выбралась ближайшая приоритетная операция и не выбирались индексы операций, которые отсутствуют в выражении
        for (int i = 0; i < operArr.length; i++) {
            if (operArr[i] > 0) {
                return indx = operArr[i];
            }
        }
        return indx;
}

    //метод для расчета введенного выражения
    //записывает результат операции в ячейку первого числа, ячейка операции и второго числа стираются
    //после чего происходит уменьшение и перезаписывание массива
    static String[] calc(String[] args) {
        //валидация массива args
        if (validator(args)) {
            while (args.length != 1) {
                double a = 0, b = 0, tmp = 0;
                int indx = operationPriority(args);
                String symb = args[indx];
                a = Double.parseDouble(args[indx - 1]);
                b = Double.parseDouble(args[indx + 1]);
                switch (symb) {
                    case "+":
                        tmp = a + b;
                        break;
                    case "-":
                        tmp = a - b;
                        break;
                    case "x":
                        tmp = a * b;
                        break;
                    case "/":
                        tmp = a / b;
                        break;
                    case "%":
                        tmp = a % b;
                        break;
                    default:
                        System.out.println("No math operation");
                        break;
                }
                args[indx - 1] = tmp + " ";
                args[indx] = null;
                args[indx + 1] = null;
                String[] tmpArray = new String[args.length - 2];
                for (int i = 0; i < indx; i++) {
                    tmpArray[i] = args[i];
                }
                for (; indx < args.length - 2; indx++) {
                    tmpArray[indx] = args[indx + 2];
                }
                args = tmpArray;
            }
        }
        return args;
    }

    //поиск индекса мат.операции
    static int indexOf(String[] args, String symb) {
        for (int i = 0; i < args.length; i++) {
            if (args[i] != null) {
                if (args[i].equals(symb)) {
                    return i;
                }
            }
        }
        return -1;
    }

    //валидатор массива args
    //проверяет на отсутствие мат. операций по краям массива
    //и что нет нескольких мат. операций подряд
    static boolean validator(String[] args) {
        for (int i = 0; i < args.length; i++) {
            //проверка на то, что введенная в конфигураторе строка не начинается или не заканчивается на математическую операцию
            if (i == 0 || i == args.length - 1) {
                if (args[i].equals("+") || args[i].equals("-") || args[i].equals("x") || args[i].equals("/") || args[i].equals("%")) {
                    System.out.println("Math operation at the end of array!");
                    return false;
                }
                //проверка на то, что подряд не идёт две математических операции типа + +
                if (args[i].equals("+") || args[i].equals("-") || args[i].equals("x") || args[i].equals("/") || args[i].equals("%")) {
                    if (args[i + 1].equals("+") || args[i + 1].equals("-") || args[i + 1].equals("x") || args[i + 1].equals("/") || args[i + 1].equals("%"))
                        System.out.println("Few math operation in a row!");
                    return false;
                }
            }
        }
        //есть требование, что в консоль надо вывести всю введенную в конфигураторе строку,
        //т.к. далее саму строку будем изменять, то чтобы не держать в памяти ее копию, выводим ее сразу до вычислений
        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i] + " ");
        }
        //после арифметического выражения добавляем = чтобы после него вывести ответ
        System.out.print(" = ");
        return true;
    }
}
