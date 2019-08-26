import java.io.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class TestConsoleInput {

    public static void main(String[] args) throws IOException {
        PrintStream pw = System.out;
        InputStream is = System.in;
        //        int b = is.read();
//        System.out.println((char)b);

//        byte[] arr = new byte[100];
//        int count = is.read(arr);
//        System.out.println(count);
//        for(int i=0;i<count;i++){
//            char c=(char) arr[i];
//            if (c==10){
//                String str="\\n";
//                System.out.print("["+str+"]");
//            }
//            else{
//                System.out.print("["+c+"]");
//            }
//        }

        InputStreamReader isr=new InputStreamReader(is);
//        if (isr.markSupported()){
//            isr.mark(1);
//        }
        int c=isr.read();
//        isr.reset();
//        char c=(char)isr.read(); так не пишем. ибо не получим -1 никогда, в чар 16 бит. в инте 32.
//        if(c==-1){
//
//        }
        System.out.println((char)c);
        BufferedReader br = new BufferedReader(isr);
        String str= br.readLine();

        for(int i=0;i<str.length();i++){
            System.out.print("["+str.charAt(i)+"]");
        }

        Scanner scan=new Scanner(is);

        int i=scan.nextInt();
        System.out.println(i);
    }

}
