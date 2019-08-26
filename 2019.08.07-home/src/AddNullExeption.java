@SuppressWarnings("serial")
public class AddNullExeption extends RuntimeException {

    public AddNullExeption(String args){
        if (args==null) {
            System.out.println("TRY TO ADD NULL!");

        }
    }
}