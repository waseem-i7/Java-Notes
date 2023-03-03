package JavaNotes.Oops.Test;

class  Cal{
    public void sum(int a , int b){
        System.out.println("sum is "+(a+b));
    }
    public void sum(int a , int b,int c){
        System.out.println("sum is "+(a+b+c));
    }
    public void sum(int a , int b,int c,int d){
        System.out.println("sum is "+(a+b+c+d));
    }
}

//Super Class
class Animal{
    public void Eating(){
        System.out.println("Animal is Eating");
    }
    public void Walking(){
        System.out.println("Animal is Walking");
    }
}
//Sub Class
class Dog extends Animal{

    @Override
    public void Walking(){
        System.out.println("Dog is Walking");
    }
}

public class QuestionNumber2 {

    public static void main(String[] args) {

        /*
           Question 2 : What is Polymorphism?
           Answer : Polymorphism in java is the ability of an object to take many forms.
           In Java, polymorphism is achieved through method overriding and method overloading.

           1. Method Overloading : Method overloading is when a class has multiple methods
           with the same name, but different parameters. The methods must have different
           parameter lists, but they can have different return types. When a method is called,
           Java determines which method to execute based on the number and types of arguments
           passed to it.

           2.Method Overriding :Method overriding is when a subclass provides its own implementation
            of a method that is already defined in its superclass. The subclass method must have the
             same name, return type, and parameters as the superclass method. When the subclass method
              is called on an object of the subclass, the subclass method is executed instead of the
              superclass method.

         */

        //Method Overloading
        Cal obj1 = new Cal();
        obj1.sum(1,2);
        obj1.sum(1,2,3);
        obj1.sum(1,2,3,4);

        //Method Overriding
        Dog dog = new Dog();
        dog.Walking();
        dog.Eating();


    }
}
