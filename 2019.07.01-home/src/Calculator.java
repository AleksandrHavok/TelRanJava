public class Calculator {
    public static void main(String[] args) {
        /*TODO
        Калькулятор, передаем в String[] args 2 операнда
        в качестве умножения x вместо *
        +-/*% - 5 операций
        передали 23+23, он выдает:
        23+23=46
        -----------------------------
        вводим 2+2*2=6
        Выражение любой длины без скобок, можно побаловаться со скобками
        ошибки это две операции подряд, например 2++42
         */
        if (validArr(args) == true) {
            while (args.length != 1) {
                int indxMult = indexOf(args, "x");
                int indxDiv = indexOf(args, "/");
                int indxMod = indexOf(args, "%");
                if (indxMult > 0 || indxDiv > 0 || indxMod > 0) {
                    args = mathOperations(args, indxMult, indxDiv, indxMod, "x");
                    indxMult = indexOf(args, "x");
                    indxDiv = indexOf(args, "/");
                    indxMod = indexOf(args, "%");
                    args = mathOperations(args, indxDiv, indxMult, indxMod, "/");
                    indxMult = indexOf(args, "x");
                    indxDiv = indexOf(args, "/");
                    indxMod = indexOf(args, "%");
                    args = mathOperations(args, indxMod, indxMult, indxDiv, "%");
                } else {
                    int indxSum = indexOf(args, "+");
                    int indxDiff = indexOf(args, "-");
                    if (indxSum > 0 || indxDiff > 0) {
                        args = mathOperations(args, indxSum, indxDiff, -1, "+");
                        indxSum = indexOf(args, "+");
                        indxDiff = indexOf(args, "-");
                        args = mathOperations(args, indxDiff, indxSum, -1, "-");
                    }
                }
            }
            System.out.println(Double.parseDouble(args[0]));
        }
    }

    static String[] mathOperations(String[] args, int indxCurrentOperator, int indxSamePriorityOperator1, int indxSamePriorityOperator2, String symb) {
        if (indxCurrentOperator > 0) {
            if ((indxSamePriorityOperator1 < 0 || indxCurrentOperator < indxSamePriorityOperator1) &&
                    (indxSamePriorityOperator2 < 0 || indxCurrentOperator < indxSamePriorityOperator2)) {
                args = calc(args, symb, indxCurrentOperator);
            }
        }
        return args;
    }

    static String[] calc(String[] args, String symb, int indx) {
        double a = 0, b = 0, tmp = 0;
        a = Double.parseDouble(args[indx - 1]);
        b = Double.parseDouble(args[indx + 1]);
        switch (symb) {
            case "+": {
                tmp = a + b;
                break;
            }
            case "-": {
                tmp = a - b;
                break;
            }
            case "x": {
                tmp = a * b;
                break;
            }
            case "/": {
                tmp = a / b;
                break;
            }
            case "%": {
                tmp = a % b;
                break;
            }
            default: {
                System.out.println("Not math operation");
                break;
            }
        }
        args[indx - 1] = " " + tmp;
        args[indx] = null;
        args[indx + 1] = null;
        String[] tmpArr = new String[args.length - 2];
        for (int i = 0; i < indx; i++) {
            tmpArr[i] = args[i];
        }
        for (; indx < args.length - 2; indx++) {
            tmpArr[indx] = args[indx + 2];
        }
        args = tmpArr;
        return args;
    }

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

    static boolean validArr(String[] args) {
        for (int i = 0; i < args.length; i++) {
            if (i == 0 || i == args.length - 1) {
                if (args[i].equals("+") || args[i].equals("-") || args[i].equals("x") || args[i].equals("/") || args[i].equals("%")) {
                    System.out.println("Math operation on ends of array");
                    return false;
                }
            }
            if (args[i].equals("+") || args[i].equals("-") || args[i].equals("x") || args[i].equals("/") || args[i].equals("%")) {
                if (args[i + 1].equals("+") || args[i + 1].equals("-") || args[i + 1].equals("x") || args[i + 1].equals("/") || args[i + 1].equals("%")) {
                    System.out.println("Few math operations in a row");
                    return false;
                }
            }
        }
        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i] + " ");
        }
        System.out.print(" = ");
        return true;
    }
}
