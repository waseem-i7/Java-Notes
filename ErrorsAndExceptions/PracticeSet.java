package JavaNotes.ErrorsAndExceptions;

import java.util.Scanner;

class MaxRetriesException extends  Exception{
    @Override
    public String toString() {
        return "Error";
    }

    @Override
    public String getMessage() {
        return "Error";
    }
}



public class PracticeSet {

    public static void Problem5() throws MaxRetriesException{
                int [] marks = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;
        Scanner sc = new Scanner(System.in);
        int index;
        int i = 0;
        while (i<5){

            try{
                System.out.println("Enter the value of index");
                index = sc.nextInt();
                System.out.println("The value of marks[index] is "+marks[index]);
                i++;
                break;
            }catch (Exception e){
                System.out.println("Invalid Index");
                i++;
            }
        }
        if(i>=5){
            try {
                throw new MaxRetriesException();
            }catch (MaxRetriesException e){
                System.out.println(e.getMessage());
            }
        }
    }


    public static void main(String[] args) {
        //Problem 1
//        Syntax Error - int a = 7
//
//        Logical Error
//        int age  = 78;
//        int year_born = 2000-78;
//
//        Exception
//        System.out.println(6/0);


        //Problem 2
//        try{
//            int a = 666/0;
//        }catch (IllegalArgumentException e){
//            System.out.println("HeHe");
//        }catch (ArithmeticException e){
//            System.out.println("HaHa");
//        }

        //Problem 3
//        int [] marks = new int[3];
//        marks[0] = 7;
//        marks[1] = 56;
//        marks[2] = 6;
//        Scanner sc = new Scanner(System.in);
//        int index;
//        int i = 0;
//        while (i<5){
//
//            try{
//                System.out.println("Enter the value of index");
//                index = sc.nextInt();
//                System.out.println("The value of marks[index] is "+marks[index]);
//                i++;
//                break;
//            }catch (Exception e){
//                System.out.println("Invalid Index");
//                i++;
//            }
//        }
//        if(i>=5){
//            System.out.println("Error");
//        }

        //Problem 4
//        int [] marks = new int[3];
//        marks[0] = 7;
//        marks[1] = 56;
//        marks[2] = 6;
//        Scanner sc = new Scanner(System.in);
//        int index;
//        int i = 0;
//        while (i<5){
//
//            try{
//                System.out.println("Enter the value of index");
//                index = sc.nextInt();
//                System.out.println("The value of marks[index] is "+marks[index]);
//                i++;
//                break;
//            }catch (Exception e){
//                System.out.println("Invalid Index");
//                i++;
//            }
//        }
//        if(i>=5){
//            try {
//                throw new MaxRetriesException();
//            }catch (MaxRetriesException e){
//                System.out.println(e.getMessage());
//            }
//        }

        //Problem 5
        try {
            Problem5();
        } catch (MaxRetriesException e) {
            System.out.println(e.getMessage());
        }
    }

}
