package Operators;

public class BitwiseOp {
    public static void main(String[] args) {
        /* 
         * Bitwise OR |
         * Bitwise AND &
         * Bitwise NOT ~
         * Bitwise XOR ^
         * Right shift
         * Left shift
         */

         int a = 23 | 56;
         System.out.println(a);

         int b = 23 & 56;
         System.out.println(b);

         int c = ~5;
         System.out.println(c);

         int d = 23 ^ 56;
         System.out.println(d);

         int e = 56>>2;
         System.out.println(e);

         int f = 56<<3;
         System.out.println(f);

    }
}
