import java.io.FileWriter;
import java.io.IOException;

public class HomeWorkWrite
{
    public static void main(String[] args) {

        try {
            FileWriter writer=new FileWriter("C://java/test.txt",true);
            String text="Шамбетова Перизат";
            writer.write(text);

            writer.flush();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
