package JavaNotes.Loops;

import java.util.Scanner;

public class continueLoop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int user_input ;
        while (true){
            System.out.println("Enter a number");
            user_input = sc.nextInt();
            System.out.println("Number Entered By User is "+user_input);
            if (user_input==0){
                break;
            }
        }
        System.out.println("Program End!");
    }
}
