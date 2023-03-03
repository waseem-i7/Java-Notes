package JavaNotes.BasicConcepts;


import java.util.Scanner;

public class StringProgram {
    public static void main(String[] args) {
        
        //To take input from keyword
        //java.util.Scanner sc = new java.util.Scanner(System.in);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Name");
        String name = sc.nextLine();
        /* 
         * To print the str variable
        */
        System.out.println("Hello,"+name+" Have a Nice Day");
    }
}
