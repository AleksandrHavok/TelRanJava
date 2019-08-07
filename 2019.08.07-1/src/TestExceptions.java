public class TestExceptions {

    public static void main(String[] args) {
div(10,0);
    }
    public static int div(int a,int b){
        RuntimeException ex=new RuntimeException("My Runtime Ex");
        if (b==0){
//            System.out.println("Divide by zero");
//            return 0;
//            throw new RuntimeException("Divide by zero!");
            throw ex;
        }
        try{

        }
        catch (Exception e){

        }
        return a/b;
    }
}
