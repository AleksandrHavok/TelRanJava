public class ValidationTest {

    public static void main(String[] args) {
        String email = "aleksanDr@gmail.com";
        String password = "Aa12345~";
//        String password = "";
//        String password = null;
        System.out.println("Email: " + email);
        System.out.println(validEmail(email));
        System.out.println("Password: " + password);
        validPassword(password);
    }

    public static boolean validEmail(String email) {
        if (email == null) {
            return false;
        }
        if (email.length() != email.trim().length()) {//проверка на пробелы при вводе мейла
            return false;
        }
        if (email.trim().indexOf(" ") >= 0) {//проверка на наличие пробелы внутри имейла
            return false;
        }
        int indx = email.indexOf("@");//проверка на расположение @
        if (indx < 0) {//наличие @
            return false;
        }
        if (indx != email.lastIndexOf("@")) {//проверка на наличие нескольких @
            return false;
        }
        if (indx < 3) {//проверка что перед @ должно быть 3 символа минимум
            return false;
        }
        if (email.lastIndexOf(".") < indx) {// проверка что после @есть .
            return false;
        }
        if (email.length() - email.lastIndexOf(".") < 2) {//проверка что от . в конце есть 2 символа для ввода домена
            return false;
        }
        if (email.lastIndexOf(".") - indx < 2) {//проверка что между точкой и индексом есть символы, вроде  @gmail.
            return false;
        }
        return true;
    }

    public static void validPassword(String password) {
        //Password is null check
        if (password == null) {
            System.out.println("Password require 8 symbols");
            System.out.println("Password require special symbols ~,-,# or !");
            System.out.println("Password require at least one lower letters");
            System.out.println("Password require at least one upper letters");
            System.out.println("Password reqired at least one digits");
            System.out.println("Password is not valid");
        } else {
            //Password Length check
            int checkLength = -1;
            if (password.length() < 8) {
                System.out.println("Password require 8 symbols");
            } else {
                checkLength = 1;
                System.out.println("Password contains 8 symbols");
            }
            //Special Symbols check
            String[] specSymb = {"~", "-", "#", "!"};
            int checkSpecSymb = -1;
            for (int j = 0; j < specSymb.length; j++) {
                checkSpecSymb = password.indexOf(specSymb[j]);
                if (checkSpecSymb >= 0) {
                    break;
                }
            }
            if (checkSpecSymb >= 0) {
                System.out.println("Password contains special symbols ~,-,# or !");
            } else {
                System.out.println("Password require special symbols ~,-,# or !");
            }
            //Letters & digits check
            char[] letterDigitSymb = password.toCharArray();
            int checkUpperSymb = -1;
            int checkLowerSymb = -1;
            int checkDigitSymb = -1;
            for (int i = 0; i < password.length(); i++) {
                if (Character.isUpperCase(letterDigitSymb[i])) {
                    checkUpperSymb = i;
                }
                if (Character.isLowerCase(letterDigitSymb[i])) {
                    checkLowerSymb = i;
                }
                if (Character.isDigit(letterDigitSymb[i])) {
                    checkDigitSymb = i;
                }
            }
            if (checkUpperSymb >= 0) {
                System.out.println("Password contains at least one upper letters");
            } else {
                System.out.println("Password require at least one upper letters");
            }
            if (checkLowerSymb >= 0) {
                System.out.println("Password contains at least one lower letters");
            } else {
                System.out.println("Password require at least one lower letters");
            }
            if (checkDigitSymb >= 0) {
                System.out.println("Password contains at least one digit");
            } else {
                System.out.println("Password require at least one digit");
            }
            //Validation of password
            if (checkDigitSymb >= 0 && checkLowerSymb >= 0 && checkUpperSymb >= 0 && checkSpecSymb >= 0 && checkLength >= 0) {
                System.out.println("Password is valid");
            } else {
                System.out.println("Password is not valid");
            }
        }
    }
}
