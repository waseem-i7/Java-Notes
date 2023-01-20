package Operators;

import java.text.CharacterIterator;
import java.util.Scanner;

/**
 * Practice
 */
public class Practice {

    public static void main(String[] args) {
        int x =10;
        int y = 6;

        //Question 1
        int result = (x-y)/2;
        System.out.println(result); //2

        //Question 2
        int a =1;
        int b = 3;
        int c =3;
        result = (b*b - 4*a*c)/(2*a);
        System.out.println(result); //-1

        //Question 3
        int v = 4;
        int u =2;
        result = v*v - u*u;
        System.out.println(result); //12

         //Question 4
        int d =5;
        result = a*b-d;
        System.out.println(result);//-2

        //Question 5
        byte x1 = 4;
        short x2 = 6;
        int res = x1+x2;
        System.out.println(res);

        //Question 6
        char ch ='B';
        ++ch;
        System.out.println(ch);

        //Question 7;
        float res1 = 7f/4*9/2;
        System.out.println(res1);

        //Question 8
        char grade = 'A';
        
        char encryped_grade = (char)(grade + 8) ;
        System.out.println(encryped_grade);

        char decrypted_grade = (char)(encryped_grade-8);
        System.out.println(decrypted_grade);

        //Question 9
        int given = 10;
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         boolean bool = n>given;
         System.out.println(bool);

         //Question 10
         int res2 = 7*49/7+35/7;
         System.out.println(res2);

    }
}