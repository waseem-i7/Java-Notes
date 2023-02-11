package JavaNotes.Oops.Abstraction;

abstract class Parent{
    public Parent(){
        System.out.println("I am Constructor of Base Class");
    }

    public void sayHello(){
        System.out.println("Hello");
    }

    abstract public void greet1();
    abstract public void greet2();
}

class Child1 extends Parent{
    @Override
    public void greet1() {
        System.out.println("Good Morning");
    }

    @Override
    public void greet2() {
        System.out.println("Good Afternoon");
    }
}

abstract class Child2 extends Parent{
    public void th(){
        System.out.println("I am good");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        //Parent p = new Parent();  -->error
        Child1 child1 = new Child1();
        //Child2 child2 = new Child2();  -->error
    }
}
