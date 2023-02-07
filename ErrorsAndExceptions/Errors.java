package JavaNotes.ErrorsAndExceptions;

import java.util.Scanner;

public class Errors {
    public static void main(String[] args) {

        /*
        * No Matter how smart we are, errors are our constant companions with practice, we keep
        * getting better at finding & correcting them
        *
        * There are three types of errors in java
        * 1.Syntax errors
        * 2.Logical errors
        * 3.Runtime errors->Also called Exceptions!
        */

/*
        Syntax Error
        int a == 5;
        int b = 6   //Error: no semi-colon!
        c = 5;      //Error: c not declared!
*/

 /*       Logiacal Error;
        Write a program to print all prime numbers between 1 to 10;
        System.out.println(2);
        for (int i =1 ; i<5 ; i++){
            System.out.println(2*i+1);
        }*/

        //Runtime Error
        int k ;
        Scanner sc = new Scanner(System.in);
        k= sc.nextInt();
        System.out.println("Integer Part of 1000 divided by k is "+1000/k); //produce a runtime error
    }
}
