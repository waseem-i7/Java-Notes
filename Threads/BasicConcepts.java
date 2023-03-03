package JavaNotes.Threads;

class Loop1{
    void meth1(){
        int i = 0;
        while (i<10){
            System.out.println("Printing from loop1 "+i);
            i++;
        }
    }
}

class Loop2{
    void meth2(){
        int i = 0;
        while (i<10){
            System.out.println("Printing from loop2 "+i);
            i++;
        }
    }
}
public class BasicConcepts {
    public static void main(String[] args) {

        Loop1 loop1 = new Loop1();
        Loop2 loop2 = new Loop2();

        loop1.meth1();
        loop2.meth2();
    }
}
