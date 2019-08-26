import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestFileIO {

    public static void main(String[] args) throws IOException {
        String str = "Hello wrong!";
//        FileWriter fw= new FileWriter("test.txt");//создает файл если его нет
//        и перезаписывает в него строку через write если нет разрешения на добавление
//        FileWriter fw= new FileWriter("test.txt",true);//дает разрешение на добавление текста в файл
//        fw.write(str);
//        fw.close();

        FileReader fr = new FileReader("test.txt");
        BufferedReader br = new BufferedReader(fr);
        str = br.readLine();
        br.close();
        System.out.println(str);
    }
}
