package JavaNotes.Threads;

class MyThr extends Thread{
    public MyThr(String name){
        super(name);
    }

    public void run(){
        int i = 34;
        System.out.println("Thank you");
        while (i>0){
            System.out.println("I am a thread");
            i--;
        }
    }
}

class MyThreadRunnable implements Runnable{
    @Override
    public void run() {
        int i = 1;
        while (i<=35){
            System.out.println("I am class implementing  Runnable interface");
            i++;
        }
    }
}

public class ThreadConstructor {
    public static void main(String[] args) {
//        MyThr t1 = new MyThr("Waseem");
//        MyThr t2 = new MyThr("Idrisi");
//        t1.start();
//        t2.start();
//        System.out.println("The id of the thread t1 is "+t1.getId());
//        System.out.println("The name of the thread t1 is "+t1.getName());
//        System.out.println("The id of the thread t2 is "+t2.getId());
//        System.out.println("The name of the thread t2 is "+t2.getName());

        MyThreadRunnable runnable = new MyThreadRunnable();
        Thread th = new Thread(runnable,"Sahil");
        th.start();
        System.out.println("The id of the thread th is "+th.getId());
        System.out.println("The name of the thread th is "+th.getName());
    }
}
