package JavaNotes.Threads;

class MyThread1 extends Thread{
    @Override
    public void run() {
        int i = 0 ;
        super.run();
        while (i<100){
            i++;
            System.out.println("My Thread1 for Cooking ");
            System.out.println("I am Happy! ");
        }
    }
}

class MyThread2 extends Thread{
    int i = 0;
    @Override
    public void run() {
        super.run();
        while (i<100){
            i++;
            System.out.println("My Thread2 for Chatting with her ");
            System.out.println("I am Sad! ");
        }
    }
}

public class ThreadbyExtendingThreadClass {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();

        t1.start();
        t2.start();
    }
}
