import java.io.IOException;

public class TestLayerException {
    public static void main(String[] args) {
inputData("Hello");
    }

    public static void inputData(String data) {
        try {
            validateAndSave(data);
        } catch (BusinessException ex) {
            throw new UserInterfaceException("Save data error! Run app as Administrator!",ex);
        }
    }

    public static void validateAndSave(String data) {
        try {
            save(data);
        } catch (FileAccessDeniedException ex) {
throw new BusinessException("Save error",ex);
        }
    }

    public static void save(String data) {
        try {
            writeToFile(data);
        } catch (IOException e) {
            throw new FileAccessDeniedException("File system permission denied!",e);
        }
    }

    public static void writeToFile(String data) throws IOException {
        throw new IOException("File access denied error!");
    }
}
