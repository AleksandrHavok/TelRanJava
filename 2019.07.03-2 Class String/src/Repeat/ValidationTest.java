package Repeat;

public class ValidationTest {
    public static void main(String[] args) {
        // TODO:
        //проверяем пароль 123\", требуется экранирование символов
        validPassword("123\\\"");
    }

    public static boolean validEmail(String email) {
        if (email == null) {
            return false;
        }
        //проверка на пробелы в имейле
        if (email.length() != email.trim().length()) {
            return false;
        }
        //проверка на наличие @
//        if(!email.contains("@")){
//            return false;
//        }
        int indx = email.indexOf("@");
        if (indx < 0) {
            return false;
        }
        //проверка на наличие нескольких @
        if (indx != email.lastIndexOf("@")) {
            return false;
        }
        //провека, что имейл длинной не меньше 3х символов
        if (indx < 3) {
            return false;
        }
        //проверка на то, что после @ есть точка
        if (email.lastIndexOf(".") < indx) {
            return false;
        }
        //проверка на то, что имя домена после точки составляет не меньше 2х символов
        if (email.length() - email.lastIndexOf(".") < 2) {
            return false;
        }
        //проверка на то, что имя почтового сервиса составляет не менее 2х символов,
        //например gmail
        if (email.lastIndexOf(".") - indx < 2) {
            return false;
        }
        return true;
    }

    public static void validPassword(String password) {
        System.out.println(password.length());
    }
}
