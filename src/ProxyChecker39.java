import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;

public class ProxyChecker39 {
    private String ip;
    private int port;

    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("C://java/ip.txt");
            int i;
            String socket = "";
            while ((i = fis.read()) != -1) {
                if (i == 13) continue;
                else if (i == 10) {
                    String ip = socket.split(":")[0];
                    String port = socket.split(":")[1];
                    System.out.println("IP:" + ip + "port:" + port);
                    checkProxy(ip,Integer.parseInt(port));
                /*    Thread thread =new Thread(new Runnable() {
                        @Override
                        public void run() {
                            checkProxy(ip,Integer.parseInt(port));
                        }
                    });
                   thread.start();*/
                /*   MyThread thread1= new MyThread(ip, Integer.parseInt(port)) {

                        };
                   thread1.start();
*/


                    Thread thread2 = new Thread(new MyRunnableClass());

                    thread2.start();

                    socket = "";
                } else {
                    socket += (char) i;
                }
            }
        } catch (IOException e) {

        } throw new RuntimeException();
    }
    public static void checkProxy (String  ip, int port){

        try {
            Proxy proxy=new Proxy(Proxy.Type.HTTP,new InetSocketAddress(ip,port));
            URL url = new URL("https://vozhzhaev.ru/test.php");
            URLConnection connection = url.openConnection(proxy);
            InputStream is = connection.getInputStream();
            int i;
            while ((i = is.read()) != -1) {
                System.out.print((char) i );

            }

        } catch (IOException e) {
            System.out.println( ip +"NE RABOTAET");

        }
    }
    static class MyRunnableClass implements Runnable{
        String task;


        public MyRunnableClass() {
        }

        @Override
        public void run() {
            String ip=null;
            int port=0;
            try {
                Proxy proxy=new Proxy(Proxy.Type.HTTP,new InetSocketAddress(ip,port));
                URL url = new URL("https://vozhzhaev.ru/test.php");
                URLConnection connection = url.openConnection(proxy);
                InputStream is = connection.getInputStream();
                int i;
                while ((i = is.read()) != -1) {
                    System.out.print((char) i );

                }

            } catch (IOException e) {
                System.out.println( ip +"NE RABOTAET");

            }

        }
    }


    static   class MyThread extends Thread{

        String ip;
        int port;

        public MyThread(String ip, int parseInt) {

        }
    }
    public void MyThread (String ip, int port){
        this.ip=ip;
        this.port= port;
    }
}

