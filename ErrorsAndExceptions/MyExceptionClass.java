package JavaNotes.ErrorsAndExceptions;

import java.util.Scanner;

class MyException extends Exception{
    @Override
    public String getMessage() {
        return "I am getMessage()";
    }

    @Override
    public String toString() {
        return "I am toString()";
    }
}

class MaxAgeException extends Exception{
    @Override
    public String toString() {
        return "Age cannot be greater than 125";
    }

    @Override
    public String getMessage() {
        return "Make Sure that the value of age entered is correct";
    }
}

class RadiusNegativeException extends Exception{
    @Override
    public String getMessage() {
        return "Radius cannot be Negative";
    }
}


public class MyExceptionClass {
    public static void main(String[] args) {
//        int a ;
//        Scanner sc  = new Scanner(System.in);
//        a = sc.nextInt();
//        if (a<9){
//            try {
//                throw new MyException();
//                //throw new ArithmeticException("This is an exception");
//            } catch (Exception e) {
//                System.out.println(e.getMessage());
//                System.out.println(e.toString());
//                System.out.println(e);
//                System.out.println("Finished");
//            }
//            System.out.println("Yes Finished");
//        }else {
//            System.out.println("number is greater than 9");
//        }

        int age ;
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter your age ");
        age = sc.nextInt();
        if (age>125){
            try {
                throw new MaxAgeException();
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println(e.toString());
            }

        }else {
            System.out.println("Age is Correct");
        }
    }
}
