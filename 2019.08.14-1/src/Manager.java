import java.util.ArrayList;
import java.util.Objects;

public class Manager {
    private ArrayList<String> list;

    public Manager() {
        list = new ArrayList<>();
    }

    public boolean add(String name) {
        Objects.requireNonNull(name);
//        if (name == null) {
//            throw new IllegalNameException("Name cannot be null");
//        }
        return list.add(name);
    }
}
