package JavaNotes.Loops;

import java.util.Scanner;

public class BasicPatterns {

    public static void main(String[] args) {

        //Question 1
        // int n = 4; //rows
        // int m= 5; // columns
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=m ; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println("");
        // } 


        //Question 2
        //  int n = 5; //rows
        //  for(int i=1; i<=n; i++){
        //      for(int j=1;j<=i ; j++){
        //          System.out.print("*");
        //      }
        //      System.out.println("");
        //  }

        //Question 3
 /*   int n = 4;
    int m = 5;

    //outer loop
    for(int i = 1 ; i<=n ; i++){
        //inner loop
        for(int j=1 ; j<=m ; j++){
            //cell->(i,j)
            if(i==1 || j==1 || i==n || j==m){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
        }
        System.out.println("");
    }*/

        //Question 4
        /*int n = 4;
        //outer loop
        for (int i = n; i >= 1; i--) {
            //inner loop
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }*/

        /*int n = 4;
        //outer loop
        for (int i = 1; i <=n; i++) {
            //inner loop
            for (int j = 1; j <= n+1-i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }*/

        //Question 5
        /*int n = 4;
        //outer loop
        for (int i = 1; i <=n; i++) {

            //inner loop for print the spaces
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            //inner loop for print the stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println("");
        }
*/

       /* Q.6) print the pattern
         1
         12
         123
         1234
         12345

        int n = 5 ;
        for(int i=1 ; i<=n ; i++){
            for(int j=1 ; j<=i ; j++){
                System.out.print(j);
            }
            System.out.println();
        }*/

      /* Q.7 print the pattern
         12345
         1234
         123
         12
         1
        int n = 5;
        for(int i=n ; i>=1 ; i--){
            for(int j=1 ; j<=i ; j++){
                System.out.print(j);
            }
            System.out.println();
        }*/


/*
        Q.8 print the pattern
         1
         2 3
         4 5 6
         7 8 9 10
         11 12 13 14 15

        int n= 5;
        int k=1;
        for(int i=1 ; i<=n ; i++){
            for(int j=1 ; j<=i ; j++){
                System.out.print(k+" ");
                k++;
            }
            System.out.println("");
        }
*/


//        Q.9 print the pattern
//         1
//         01
//         101
//         0101
//         10101
        int n = 5;

        for(int i=1 ; i<=n ; i++){
            for(int j=1; j<=i ; j++){
                int sum = i+j;
                if(sum%2 == 0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }



        //Break
        /*Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <=n; i++) {
            if(i == 11){
                break;
            }
            System.out.println(i);
        }*/

        //Continue
       /* Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <=n; i++) {
            if(i == 11){
                continue;
            }
            System.out.println(i);
        }*/



    }
}
