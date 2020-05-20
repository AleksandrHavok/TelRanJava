package Repeat;

public class ValidationTest {
    public static void main(String[] args) {
        //System.out.println("Password: ");
        //validPassword(null);
        String email = "aleksanDr@gmail.com";
        String password = "Aa12345~";
        System.out.println("Email: " + email);
        validEmail(email);
        System.out.println("Password: " + password);
        validPassword(password);
    }

    public static boolean validEmail(String email) {
        if (email == null) {
            return false;
        }
        //проверка на пробелы до и после имейла
        if (email.length() != email.trim().length()) {
            return false;
        }
        //проверка на пробел внутри имейла
        if(email.trim().indexOf(" ")>=0){
            return false;
        }
        //проверка на наличие @
        int indx = email.indexOf("@");
        if (indx < 0) {
            return false;
        }
        //проверка на наличие нескольких @
        if (indx != email.lastIndexOf("@")) {
            return false;
        }
        //проверка, что имейл до @ длиной не меньше 3х символов
        if (indx < 3) {
            return false;
        }
        //проврека на то, что после @ есть точка
        if (email.lastIndexOf(".") < indx) {
            return false;
        }
        //проверка на то, что имя домена после точки составляет не меньше 2х символов
        if (email.length() - email.lastIndexOf(".") < 2) {
            return false;
        }
        //проверка на то, что имя почтового сервиса составляет не менее 2х символов,
        //например gmail.
        if (email.lastIndexOf(".") - indx < 2) {
            return false;
        }
        System.out.println("Email is valid!");
        return true;
    }

    /*TODO
    проверка на наличие хотя бы 1 цифры, верхнего и нижнего регистра
    проверка на то, что в пароле не меньше 8 символов
    проверка на наличие недопустимых символовов типа ~,!,$,&
     */
    public static void validPassword(String password) {
        boolean checkSpace = false;
        boolean checkLength = false;
        boolean checkDigit = false;
        boolean checkUpperCase = false;
        boolean checkLowerCase = false;
        boolean checkSpecSymbol = false;
        if (password == null) {
            System.out.println("Password is null!");
        }
        else{
            if (/*(password.length()!=password.trim().length())||*/(password.trim().indexOf(" "))>=0) {
                checkSpace = true;
            }
            if (password.length() >= 8) {
                checkLength = true;
            }
            char[] passToChar = password.toCharArray();
            for (int i = 0; i < passToChar.length; i++) {
                if (Character.isDigit(passToChar[i])) {
                    checkDigit = true;
                }
                if (Character.isLowerCase(passToChar[i])) {
                    checkLowerCase = true;
                }
                if (Character.isUpperCase(passToChar[i])) {
                    checkUpperCase = true;
                }
            }
            String[] specSymb = {"~", "!", "$", "&", "#", "@"};
            for (int i = 0; i < specSymb.length; i++) {
                if (password.contains(specSymb[i])) {
                    checkSpecSymbol = true;
                    break;
                }
            }
        }
        if (checkSpace) {
            System.out.println("Password contains space!");
        }
        if (checkLength) {
            System.out.println("Password contains 8 symbols");
        } else {
            System.out.println("Password require at least 8 symbols!");
        }
        if (checkDigit) {
            System.out.println("Password contains numeric symbol");
        } else {
            System.out.println("Password require at least 1 numeric");
        }
        if (checkUpperCase) {
            System.out.println("Password contains uppercase symbol!");
        } else {
            System.out.println("Password require at least 1 uppercase symbol");
        }
        if (checkLowerCase) {
            System.out.println("Password contains lowercase symbol!");
        } else {
            System.out.println("Password require at least 1 lowercase symbol");
        }
        if (checkSpecSymbol) {
            System.out.println("Password contains special symbol: ~,!,$,&,#,@");
        } else {
            System.out.println("Password require at least 1 special symbol: ~,!,$,&,#,@");
        }
        if (!checkSpace && checkLength && checkDigit && checkUpperCase && checkLowerCase && checkSpecSymbol) {
            System.out.println("Password is valid!");
        } else {
            System.out.println("Password is not valid!");
        }
    }
}

