package JavaNotes.Oops.Polymorphism;

class Base{
    public void meth1(){
        System.out.println("I am meth1 of class Base");
    }
    public void meth2(){
        System.out.println("I am meth2 of class Base");
    }
}

class Derived extends Base{

    @Override
    public void meth2(){
        System.out.println("I am override meth2 of class Derived class");
    }

    public void meth3(){
        System.out.println("I am meth3 of class Derived");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {

//        Base b = new Base();
//        b.meth1();
//        b.meth2();

        Derived d = new Derived();
        d.meth1();
        d.meth2();  //method overriding
        d.meth3();

    }
}
