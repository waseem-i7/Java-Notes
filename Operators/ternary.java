package Operators;

import java.util.Scanner;

public class ternary {
    public static void main(String[] args) {
        /*
         *  statement1 ? statement2 : statement3;
         */
        

         Scanner sc = new Scanner(System.in);
         System.out.println("Enter a number");
         int a = sc.nextInt();
         int result = a>10 ?  3 : 5;
         System.out.println(result);
    }
}
