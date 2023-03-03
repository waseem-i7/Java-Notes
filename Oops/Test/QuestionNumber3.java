package JavaNotes.Oops.Test;
//Super Class
class Animal1{
    public void Eating(){
        System.out.println("Animal is Eating");
    }
    public void Walking(){
        System.out.println("Animal is Walking");
    }
}
//Sub Class
class Dog1 extends Animal1{
    @Override
    public void Walking(){
        System.out.println("Dog is Walking");
    }
}

public class QuestionNumber3 {
    public static void main(String[] args) {
        /*
          Question 3 : What is Inheritance?
          Inheritance : Inheritance is a fundamental concept in object-oriented programming
          that allows one class to inherit properties and behaviors from another class. In Java,
          a class can inherit from another class using the extends keyword.

          The class that is being inherited from is called the superclass or parent class,
          while the class that is inheriting from it is called the subclass or child class.
          The subclass can access all the non-private properties and methods of the superclass,
          as well as define its own properties and methods.

          The main benefit of inheritance is that it allows code to be reused and organized
          in a hierarchical manner. For example, if you have several classes that share common
          properties and methods, you can define those properties and methods in a superclass
          and then have the other classes inherit from it. This can help reduce code duplication
          and make your code more maintainable and easier to understand.

          In Java, inheritance also supports method overriding, which means that a subclass can
          provide its own implementation of a method that is already defined in its superclass.
          This allows the subclass to customize the behavior of the inherited method to meet its
          specific needs.

        */
        //Method Overriding
        Dog1 dog = new Dog1();
        dog.Walking();
        dog.Eating();
    }
}
