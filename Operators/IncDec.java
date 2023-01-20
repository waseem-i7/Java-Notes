package Operators;

import java.util.Scanner;

/**
 * IncDec
 */
public class IncDec {

    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.println("enter a no");
        int a=x.nextInt();
        int b=++a;
        b=--a;
        System.out.println(b);
    }
}