package JavaNotes.Oops.Test;

abstract class Parent{

    //abstract method
    abstract void greet1();
    abstract public void greet2();

    //non-abstract method
    public void greet3(){
        System.out.println("Hello");
    }

}
class Child1 extends Parent {
    @Override
    public void greet1() {
        System.out.println("Good Morning");
    }

    @Override
    public void greet2() {
        System.out.println("Good Afternoon");
    }
}


interface Bicycle{
    public static final int a = 45;
    void applyBrake(int decrement);
    void speedUp(int increment);
}
class AvonCycle implements Bicycle {
    public int a =  40;
    void blowHorn(){
        System.out.println("Pee Pee Poo Poo.");
    }
    @Override
    public void applyBrake(int decrement) {
        System.out.println("Applying Brake.");
    }

    @Override
    public void speedUp(int increment) {
        System.out.println("Applying SpeedUp.");
    }
}

public class QuestionNumber4 {
    public static void main(String[] args) {
        /*
          Question 4 : What is Abstraction?
          Answer : Abstraction is a key concept in object-oriented programming that refers
          to the process of hiding implementation details while showing only the essential
          features of an object.

          In Java, it can achieve abstract classes and interfaces.

          1. Abstract Classes :An abstract class is a class that cannot be instantiated and
           may contain one or more abstract methods, which are declared but not implemented.
           Abstract classes can be used to define a template or blueprint for a set of related
           classes, but they cannot be used to create objects directly. Instead, they are
           intended to be subclassed, with the subclasses providing concrete implementations
           of the abstract methods.

          a)A class which is declared as Abstract is known as Abstract class.
          b)it has abstract and non-abstract method.
          c)needs to extended and it's methods implemented.
          d)we can not create object of an abstract class.

          ->Abstract Method : A method which is declared as abstract and does not have implementation
          is known as abstract method.

          2. Interface : Interface in java is blue-print of a class.
          ->it has public , static and final variable by-default
          ->it has public and abstract methods.

        */

    }
}
