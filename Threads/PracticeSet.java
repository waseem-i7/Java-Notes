package JavaNotes.Threads;

class practiceThread1 extends Thread{
    @Override
    public void run() {
        super.run();
//        while (true){
//            System.out.println("Good Morning");
////            try {
////                sleep(200);
////            } catch (InterruptedException e) {
////                throw new RuntimeException(e);
////            }
//        }
    }
}
class practiceThread2 extends Thread{
    @Override
    public void run() {
        super.run();
        while (true){
            System.out.println("Welcome");
//            try {
//                sleep(200);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
        }
    }
}

public class PracticeSet {
    public static void main(String[] args) {
      /*  //Question 1
        practiceThread1 th1 = new practiceThread1();
        practiceThread2 th2 = new practiceThread2();
        th1.start();
        th2.start();

        //Question 2
        //use sleep method
        */

        //Question 3
//        practiceThread1 p1 = new practiceThread1();
//        practiceThread2 p2 = new practiceThread2();
//        p1.setPriority(6);
//        p2.setPriority(9);
//        System.out.println(p1.getPriority());
//        System.out.println(p2.getPriority());
//        p1.start();
//        p2.start();

        //Question 4
        practiceThread1 p1 = new practiceThread1();
        System.out.println(p1.getState());
        p1.start();
        System.out.println(p1.getState());

        //Question 5
        System.out.println(Thread.currentThread().getState());

    }
}
