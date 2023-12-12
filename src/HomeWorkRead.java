
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class HomeWorkRead {
    public static void main(String[] args) {
        try {
            FileReader reader=new FileReader("C://java/test.txt");
            int c;
            while ((c= reader.read())!=-1){
                System.out.print((char)c);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
