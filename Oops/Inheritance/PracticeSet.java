package JavaNotes.Oops.Inheritance;

class Circle{
    public int radius;

    Circle(int r){
        System.out.println("I am circle parameterized constructor");
        this.radius = r;
    }

    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}
class Cylinder extends Circle{
    public int height;

    Cylinder(int r,int h){
        super(r);
        System.out.println("I am cylinder parameterized constructor");
        this.height = h;
    }

    public double volume(){
        return Math.PI*this.radius*this.radius*this.height;
    }
}

class Rectangle{
    public int length;
    public int breadth;

    Rectangle(int length,int breadth){
        System.out.println("I am rectangle parameterized constructor");
        this.length = length;
        this.breadth = breadth;
    }

    public double area(){
        return this.length*this.breadth;
    }
}
class Cuboid extends Rectangle{
    public int height;

    Cuboid(int length,int breadth,int height){
        super(length,breadth);
        System.out.println("I am Cuboid parameterized constructor");
        this.height = height;
    }

    public double volume(){
        return length*breadth*height;
    }
}

public class PracticeSet {
    public static void main(String[] args) {

/*
        //Problem 1
        Circle circle = new Circle(12);
        Cylinder cylinder = new Cylinder(10,20);

        //Problem 2
        Rectangle rectangle = new Rectangle(2,3);
        System.out.println(rectangle.area());
        Cuboid cuboid = new Cuboid(2,3,4);
        System.out.println(cuboid.volume());


        //Problem 3
        Circle circle = new Circle(12);
        Cylinder cylinder = new Cylinder(10,20);
        System.out.println(circle.area());
        System.out.println(cylinder.volume());

        //Problem 4
        Create getters and setters for problem2

        //Problem 5
        what is the order of constructor execution for the following inheritance hierarchy
        Base -> Derived1 -> Derived2

        Derived2 obj = new Derived2();
        which constructors will be executed and in what order?

        Answer -> order of constructor execution is - Base->Derived1->Derived2

 */

    }
}
