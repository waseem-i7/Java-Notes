package JavaNotes.ConditionalStatements;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        // 0 rock , 1 paper , 2 scissor

        System.out.println("Enter 0 for rock , 1 for paper and 2 for scissor");
        Scanner sc = new Scanner(System.in);
        int userInput = sc.nextInt();
        System.out.println("User input "+userInput);


        Random random = new Random();

        int computerInput = random.nextInt(3);
        System.out.println("Computer input "+computerInput);

        if (userInput == computerInput){
            System.out.println("Draw");
        }else if ((userInput==0 && computerInput==2) || (userInput==1 && computerInput==0) || (userInput==2 && computerInput==1)){
            System.out.println("User win");
        }else {
            System.out.println("Computer win");
        }
    }
}
