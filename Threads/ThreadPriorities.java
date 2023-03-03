package JavaNotes.Threads;


class MyThread extends Thread{

    public MyThread(String name){
        super(name);
    }

    public void run(){
        while (true){
            System.out.println("Thank you "+this.getName());
        }
    }
}


public class ThreadPriorities {
    public static void main(String[] args) {

        //Ready Queue : T1 T2 T3 T4

        MyThread t1 = new MyThread("Thread1");
        MyThread t2 = new MyThread("Thread2");
        MyThread t3 = new MyThread("Thread3");
        MyThread t4 = new MyThread("Thread4");
        MyThread t5 = new MyThread("Thread5 (Most Important)");
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.NORM_PRIORITY);
        t5.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        System.out.println("The id of the thread t1 is "+t1.getId());
        System.out.println("The name of the thread t1 is "+t1.getName());
        System.out.println("The id of the thread t2 is "+t2.getId());
        System.out.println("The name of the thread t2 is "+t2.getName());

    }
}

