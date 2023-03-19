package JavaNotes.AdvanceJava;

interface AnonymousInterface{
    void meth1();
    void meth2();
}
class AnonymousClass implements AnonymousInterface{

    public void display(){
        System.out.println("Hello");
    }
    @Override
    public void meth1() {
        System.out.println("I am meth1");
    }
    @Override
    public void meth2() {
        System.out.println("I am meth2");
    }
}


@FunctionalInterface
interface AnonymousInterface1{
    void meth1(int a);
}
class Mwi implements AnonymousInterface1{
    @Override
    public void meth1(int a) {
        System.out.println("This is meth1");
    }
}


public class JavaLambdaFunctions {

    public static void main(String[] args) {
        //Anonymous Class
//        AnonymousClass obj = new AnonymousClass();
//        AnonymousInterface obj = new AnonymousClass();
//        obj.meth1();
//        AnonymousInterface obj = new AnonymousInterface() {
//            @Override
//            public void meth1() {
//                System.out.println("I am meth1");
//            }
//            @Override
//            public void meth2() {
//                System.out.println("I am meth2");
//            }
//        };
//        obj.meth1();


        //Lambda Expressions
//        AnonymousInterface1 obj = new Mwi();
//        obj.meth1();
        AnonymousInterface1 obj = (a)->{System.out.println("I am Method 1 this Lambda "+a);};
        obj.meth1(2);
    }
}
