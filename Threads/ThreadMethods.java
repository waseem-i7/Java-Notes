package JavaNotes.Threads;

class MyThr1 extends Thread{

    public void run(){
        int i=0;
//        while (i<5000){
        while (true){
                System.out.println("Thank you");
                i++;
            try {
                Thread.sleep(455);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}


class MyThr2 extends Thread{

    public void run(){
        int i=0;
        while (i<5000){
            System.out.println("My Thank you");
            i++;
        }
    }
}
public class ThreadMethods {
    public static void main(String[] args) {
        MyThr1 t1 = new MyThr1();
        MyThr2 t2 = new MyThr2();
        t1.start();
//        try {
//            t1.join();
//        } catch (Exception e) {
//            System.out.println(e);
//        }
        t2.start();
    }
}
