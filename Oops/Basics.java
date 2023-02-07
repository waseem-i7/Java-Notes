package JavaNotes.Oops;

class Employee{  //Defining a custom class
    int id;
    String name;
    int salary;

    void printDetails(){
        System.out.println(id);
        System.out.println(name);
    }

    void getSalary(){
        System.out.println(salary);
    }
}

public class Basics {
    public static void main(String[] args) {

        Employee employee1 = new Employee(); //instantiate an object
        employee1.id = 78;   //setting the value of attributes
        employee1.name = "Waseem" ;
        employee1.salary = 12000;
        employee1.printDetails();
        employee1.getSalary();
        //System.out.println(employee1.salary);

        Employee employee2 = new Employee();
        employee2.id = 88;
        employee2.name = "Supriya" ;
        employee2.salary = 13000;
        employee2.printDetails();
        System.out.println(employee2.salary);
    }
}
