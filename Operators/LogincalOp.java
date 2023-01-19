package Operators;

public class LogincalOp {
    public static void main(String[] args) {
        /*
         * Logical operators
         * !,&&,||
         */

         boolean result = !true;
         System.out.println(result);

         result = !(5>3);
         System.out.println(result);

         result = (3>2) && (4>3);
         System.out.println(result);

         result = (4>2) || (5>10);
         System.out.println(result);
    }
}
