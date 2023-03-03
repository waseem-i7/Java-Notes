package JavaNotes.Oops.Test;

class Student{
    //Variables
    private String name ;
    private String rollNo;

    //Methods
    public String getName() {
        return name;
    }
    public void setName(String name) {
        if (!name.isEmpty()){
            this.name = name;
            System.out.println("Name is "+this.name);
        }else {
            System.out.println("Name can't be Empty");
        }
    }
    public String getRollNo() {
        return rollNo;
    }
    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }
}

public class QuestionNumber5 {
    public static void main(String[] args) {
        /*
         Question 5 : What is Encapsulation?
         Answer : Encapsulation is a fundamental concept in object-oriented programming
         that refers to the process of hiding implementation details and protecting the
         data of an object from external interference. In Java, encapsulation is achieved
         by declaring instance variables as private and providing public methods for accessing
         and modifying them.

         By declaring instance variables as private, they cannot be accessed or modified directly
         by code outside of the class. Instead, public getter and setter methods are provided,
         which allow external code to access and modify the state of the object in a controlled
         and safe manner. This protects the data from being modified accidentally or maliciously,
         and ensures that the object is always in a valid state.

        */

        Student student = new Student();
        student.setName("Pooja");
    }
}
