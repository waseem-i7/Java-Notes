package JavaNotes.Method;

public class Recursion {

    //print1To100(5)
    //print1To100(4)+5
    //print1To100(3)+4+5
    //print1To100(2)+3+4+5
    //print1To100(1)+2+3+4+5
    //print1To100(0)+1+2+3+4+5
    static void printNumbers(int n){
        if (n>0){
            printNumbers(n-1);
            System.out.println(n);
        }
    }

    static int fib(int n ){
        if (n==1){
            return 0;
        }else if (n==2){
            return 1;
        }else {
            return fib(n-1)+fib(n-2);
        }
    }

    static int factorial(int n){
        if (n==0 || n==1){
            return 1;
        }else {
            return n*factorial(n-1);
        }
    }

    public static void main(String[] args) {
        //printNumbers(5);
        //System.out.println(fib(8));
        //System.out.println(factorial(10));
    }
}
