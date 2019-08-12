public class TestCheckedException {
    public static void main(String[] args) {
        try {
            div(30, 0);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.println("End of main");
    }

    private static int div(int a, int b) throws Exception{
        if (b==0){
            throw new Exception("Divide by zero");
        }
        return a/b;
    }
}
