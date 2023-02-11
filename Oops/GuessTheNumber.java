package JavaNotes.Oops;

import java.util.Random;
import java.util.Scanner;

class Game{
    public int number ;
    public int inputNumber;
    public int noOfGuesses=0;

    Game(){
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }
    void takeUserInput(){
        System.out.println("Guess the number, please Enter it");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
    }
    boolean isCorrectNumber(){
        noOfGuesses++;
        if (inputNumber == number){
            System.out.format("Yes you guessed it right, it was %d\nyou guessed it in %d attempts",number,noOfGuesses);
            return true;
        }
        else if (inputNumber<number){
            System.out.println("Too low...");
        }else {
            System.out.println("Too high");
        }
        return false;
    }
}

public class GuessTheNumber {
    public static void main(String[] args) {
        /*
        Create a class Game, which allows a user to play "Guess th Number"
        Game once, Game should have the following methods:
        1.Constructor to generate the random number
        2.takeUserInput() to take a user input of number
        3. isCorrectNumber() to detect whether the number entered by the user is true
        4. getter and setter for noOfGuesses
        Use properties such as noOfGuesses(int) , etc to get this task done!
         */

        Game game = new Game();
        boolean b = false;
        while (!b){
            game.takeUserInput();
            b=game.isCorrectNumber();
        }

    }
}
