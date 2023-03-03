package JavaNotes.ErrorsAndExceptions;

class NegativeRadiusException extends Exception{
    @Override
    public String toString() {
        return "Radius cannot be negative";
    }

    @Override
    public String getMessage() {
        return "Radius cannot be negative";
    }
}


public class ThrowAndThrows {

    public static double area(int r) throws NegativeRadiusException{
        if (r<0){
            throw new NegativeRadiusException();
        }
        double result = Math.PI*r*r;
        return result;
    }

    public static int divide(int a , int b) throws ArithmeticException{
        //Made By Waseem
        int result = a/b;
        return result;
    }

    public static void main(String[] args) {
        //Pooja - uses divide function created by Harry
//        try{
//            int c = divide(6,0);
//            System.out.println(c);
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//        }




        try {
            double ar = area(-6);
            System.out.println(ar);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
