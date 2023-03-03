package JavaNotes.Oops.BasicConcepts;

class Circle{
    private static int radius = 5;

    static public void area(){
        System.out.println(Math.PI*radius*radius);
    }

}
public class StaticKeyword {

    public static void main(String[] args) {

        Circle.area();
    }
}
