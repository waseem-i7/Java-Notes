package JavaNotes.Oops.Inheritance;

class Base{
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I am in base and setting x now");
        this.x = x;
    }
}

class Derived extends Base{
    int y ;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        System.out.println("I am in derived and setting y now");
        this.y = y;
    }
}
public class Inheritance {
    public static void main(String[] args) {
        //Creating an object of base class
        Base b = new Base();
        b.setX(4);
        System.out.println(b.getX());

        //Creating an object of derived class
        Derived d = new Derived();
        d.setX(10);
        System.out.println(d.getX());
        d.setY(12);
        System.out.println(d.getY());
    }
}
