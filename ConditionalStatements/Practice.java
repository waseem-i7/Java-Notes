package JavaNotes.ConditionalStatements;

import java.text.DateFormatSymbols;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        
        //Question 1
        // int a= 10;
        // if(a=11)
        //     System.out.println("I am 11");
        // else
        //    System.out.println("I am not 11");  
        
        //Question 2
        // Scanner x=new Scanner(System .in);
        // System.out.println("enter ur 3 sub marks");
        // int a=x.nextInt();
        // int b=x.nextInt();
        // int c=x.nextInt();
        // int t=(a+b+c);
        // int p=t/3;
        // if(p>=40&& a>=33 && b>=33 && c>=33){
        //     System.out.println("Pass");
        // }
        // else{
        //     System.out.println("fail");
        // }
        
        //Question 3
        // Scanner sc=new Scanner(System.in);
        // System.out.println("enter ur salary"); 
        // int income=sc.nextInt(); //1200000
        // float tax = 0;

        // if(income <= 250000){
        //     tax =  0;
        // }
        // else if(income >250000 && income<=500000){
        //     tax = tax + 0.05f*(income-250000);
        // }
        // else if (income>500000&&income<=1000000){
        //     tax =tax + 0.05f*(500000-250000);
        //     tax = tax +0.2f*(income-500000);
        // }
        // else if(income>1000000){
        //     tax = tax + 0.05f*(500000-250000);
        //     tax = tax + 0.2f*(1000000-500000);
        //     tax = tax + 0.3f*(income-1000000);
        // }
        // System.out.println("tax paid by the employee is : "+tax);

        //Question 4 
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the Number");
        // int a = sc.nextInt();

        // switch(a){
        //     case 1 -> System.out.println("Monday");
        //     case 2 -> System.out.println("Tuesday");
        //     case 3 -> System.out.println("Wednesday");
        //     case 4 -> System.out.println("thursday");
        //     case 5 -> System.out.println("friday");
        //     case 6 -> System.out.println("saturday");
        //     case 7 -> System.out.println("sunday");
        //     default ->System.out.println("Invalid Day");
            
        // }

        //Question 6
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Url");
        String url = sc.nextLine();
        if(url.endsWith(".com")){
            System.out.println("Commercial website");
        }else if(url.endsWith(".org")){
            System.out.println("Organisation website");
        }else if(url.endsWith(".in")){
            System.out.println("Indian website");
        }

}
}
