package JavaNotes.AdvanceJava;

/**
 * This class is to demonstrate what javadoc is and how it is used in the java industry
 * This is <i>italic</i> word<p>this is a new paragraph</p>
 * @author waseem
 * @version 0.1
 * @since 2000
 * @see <a href="https://docs.oracle.com/en/java/javase/14/docs/api/index.html">Java Docs</a>
 * @see <a href="https://docs.oracle.com/en/java/javase/14/docs/api/index.html" target="_blank">Java Docs</a>
 */
public class GenerateDocs {

    /**
     *This is a method to two number
     * @param a This is the first number to add
     * @param b This is the second number to add
     * @return Sum of two numbers as an integer
     * @throws Exception if a is 0
     * @deprecated This method is deprecated please use + Operator
     */
    public int add(int a,int b) throws Exception{
        if (a==0){
            throw new Exception();
        }
        return a+b;
    }

    /**
     *This is main method
     * @param args These are arguments supplied to the command line
     */
    public static void main(String[] args) {
        System.out.println("This is my main method");
    }
}
