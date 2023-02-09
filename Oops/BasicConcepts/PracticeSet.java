package JavaNotes.Oops.BasicConcepts;

class  MyEmployee{
    int salary;
    String name;

    public void setSalary(int s){
        salary = s;
    }

    public int getSalary(){
        return salary;
    }

    public void setName(String n){
        name = n;
    }

    public String getName(){
        return name;
    }

}

class CellPhone{

    void Ringing(){
        System.out.println("CellPhone is Ringing...");
    }

    void Vibrating(){
        System.out.println("CellPhone is Vibrating...");
    }

    void Calling(){
        System.out.println("CellPhone Calling to Pooja");
    }
}

class Square{
    int side;

    public int Area(){
        return side*side;
    }

    public int Perimeter(){
        return 4*side;
    }
}

class MyRectangle{
    int length,height;

    public int Area(){
        return length*height;
    }

    public int Perimeter(){
        return 2*(length+height);
    }
}

class MyCircle{
    int radius;

    public MyCircle(int radius){
        this.radius = radius;
    }

    public double area(){
        return  Math.PI*radius*radius;
    }
}


class Pubg{

    void Firing(){
        System.out.println("Pooja firing on enemy...");
    }

    void Running(){
        System.out.println("Pooja is Running from enemy...");
    }

    void Hitting(){
        System.out.println("Pooja is Hitting the enemy");
    }
}


public class PracticeSet {
    public static void main(String[] args) {

 /*
        //Question 1

         //Instantiating the object of MyEmployee class
         MyEmployee employee = new MyEmployee();
         //setting the name of employee
         employee.setName("Waseem Idrisi");
         //getting the name of employee
         System.out.println(employee.getName());
        //setting the Salary of employee
        employee.setSalary(23000);
        //getting the salary of employee and then print the salary
        System.out.println(employee.getSalary());

        //Question 2
        CellPhone nokia = new CellPhone();
        nokia.Ringing();
        nokia.Vibrating();
        nokia.Calling();


        //Question 3
        Square square = new Square();
        square.side = 3;
        System.out.println(square.Area());
        System.out.println(square.Perimeter());

        //Question 4
        Rectangle rectangle = new Rectangel();
        rectangle.length = 3;
        rectangle.height = 3;
        System.out.println(square.Area());
        System.out.println(square.Perimeter());


        //Question 5
        Pubg pubg = new Pubg();
        pubg.Firing();
        pubg.Hitting();
        pubg.Running();

        //Question 6
        MyCircle circle1 = new MyCircle(9);
        double area = circle1.area();
        System.out.println(area);
 */
    }
}
