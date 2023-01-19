package Operators;

import java.util.Scanner;

public class Odd_even {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");

        int x = sc.nextInt();

        if(x%2 == 0){
            System.out.println(x+" is Even Number");
        }else{
            System.out.println(x+" is Odd Number");
        }
    }
}
