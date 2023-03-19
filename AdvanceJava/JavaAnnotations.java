package JavaNotes.AdvanceJava;

class Phone {
    public void showTime() {
        System.out.println("Time is 12:00AM");
    }
}

class NewPhone extends Phone {
    @Override
    public void showTime() {
        System.out.println("Time is 4:pm");
    }
    @Deprecated
    public int sum(int a, int b){
        return a+b;
    }
}

@FunctionalInterface
interface myFunctionalInterface{
    void thisMethod1();
    //void thisMethod2();
}



public class JavaAnnotations {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        NewPhone phone = new NewPhone();
        phone.showTime();
        phone.sum(2,3);
    }
}
