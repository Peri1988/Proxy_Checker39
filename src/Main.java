import javax.imageio.IIOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            FileInputStream fis=new FileInputStream("C://java/test1.txt");
            int i;
            while ((i=fis.read())!=-1){
                System.out.print((char) i);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        /*  String text="\nHello world";
        try {
            FileOutputStream fos=new FileOutputStream("C://java/test1.txt", true);
            byte [] buffer=text.getBytes();
            fos.write(buffer);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/



    }
}
 /*  try {

           FileWriter writer= new FileWriter("C://java/test.txt",true);
           String text= " Hello mummy";
           writer.write(text);
           writer.append('\n');
           writer.append('H');
           writer.flush();
           } catch (IOException e) {
           throw new RuntimeException(e);
           }*/


/*
  try (FileReader reader = new FileReader("C://java/test.txt")) {
          int a;
          while ((a = reader.read()) != -1) {
          System.out.print( (char)a);
          }


          } catch (IOException e) {
          throw new RuntimeException(e);
          }*/
