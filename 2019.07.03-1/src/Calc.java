public class Calc {
    public static void main(String[] args) {
        if (args.length == 3) {
            String oper = args[1];
            double a = Double.parseDouble(args[0]);
            double b = Double.parseDouble(args[2]);
            switch (oper) {
                case "+":
                    System.out.println(a + "+" + b + " = " + (a + b));
                    break;
                case "-":
                    System.out.println(a + "-" + b + " = " + (a - b));
                    break;
                case "x":
                    System.out.println(a + "x" + b + " = " + (a * b));
                    break;
                case "/":
                    System.out.println(a + "/" + b + " = " + (a / b));
                    break;
                case "%":
                    System.out.println(a + "%" + b + " = " + (a % b));
                    break;
                default:
                    System.out.println("wrong operation");
            }
        }
    }
}
