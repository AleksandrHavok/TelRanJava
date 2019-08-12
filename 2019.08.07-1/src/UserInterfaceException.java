@SuppressWarnings("serial")
public class UserInterfaceException extends RuntimeException {
    public UserInterfaceException(String message) {
        super(message);
    }
    public UserInterfaceException(String message,Throwable cause){
        super(message,cause);
    }
}
