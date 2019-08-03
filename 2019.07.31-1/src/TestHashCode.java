public class TestHashCode {
    public static void main(String[] args) {
        Object obj=new Object();
        int code=obj.hashCode();
        System.out.println(code);//начинается с 31, затем плюсует хэшкоды всех переменных
        // Объекты равные по хэшкоду не обязательно одинаковы по equals, разные по хэшкоду объекты точно не equals


    }
}
