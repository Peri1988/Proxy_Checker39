public class MultyThread {
    public static void main(String[] args) {
   /* MyThread thread1= new MyThread();
         thread1.task=" mytye";
        MyThread thread2= new MyThread();
         thread2.task=" stirka";
        MyThread thread3= new MyThread();
         thread3.task=" pylesos";
         thread1.start();
        thread2.start();
        thread3.start();*/

       /* Thread thread1 =new Thread(new MyRunnableClass("mytye"));
        Thread thread2 = new Thread(new MyRunnableClass("stirka"));
        Thread thread3 = new Thread(new MyRunnableClass("pylesosit"));
        thread1.start();
        thread2.start();
        thread3.start();*/

        Thread thread1=new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println( "Mytye -vypolnen na " + i + "%");
                }
            }
        });
        Thread thread2=new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println( "Stirka -vypolnen na " + i + "%");
                }
            }
        });

        Thread thread3=new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println( "Pylesosit -vypolnen na " + i + "%");
                }
            }
        });
        thread1.start();
        thread2.start();
        thread3.start();

    }
}
class  MyRunnableClass implements Runnable{
    String task;

    public MyRunnableClass(String task) {
        this.task = task;
    }

    public MyRunnableClass() {
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(task + " -vypolnen na " + i + "%");
        }
    }
}

class MyThread extends Thread {
    String task;

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(task + " -vypolnen na " + i + "%");
        }}}