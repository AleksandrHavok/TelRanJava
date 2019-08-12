public class TestExceptions {

    public static void main(String[] args) {
//        div(10, 0);
        try {
            valid1("Vasya23");
            //---любое кол-во строк кода
            System.out.println("Validation success!");
        } catch (NullPointerException ex) {
            System.out.println("Name is null");
        } catch (IllegalArgumentException ex) {
            System.out.println("Name is to short!");
        } catch (RuntimeException ex) {
            System.out.println("Something goes wrong");
        }

//        catch (NullPointerException|IllegalArgumentException ex) {
//           ex.printStackTrace();
//            System.out.println("Valid failed " + ex.getMessage());
//        }
        System.out.println("end of main");
    }

    public static int div(int a, int b) {
        RuntimeException ex = new RuntimeException("My Runtime Ex");
        if (b == 0) {
//            throw new RuntimeException("Divide by zero!");
            throw ex;
        }
        return a / b;
    }

    public static void valid1(String name) {
        if (name == null) {
//            throw new RuntimeException("Name is null");
            throw new NullPointerException("Name is null");
        }
        valid2(name);
    }

    public static void valid2(String name) {
        if (name.length() < 8) {
//            throw new RuntimeException("Name is to short");
            throw new IllegalArgumentException("Name is to short");
        }
        if (!Character.isAlphabetic(name.charAt(0))) {
            throw new RuntimeException("Names can't start from symbols!");
        }
    }
}
