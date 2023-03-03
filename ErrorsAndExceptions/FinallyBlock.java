package JavaNotes.ErrorsAndExceptions;

public class FinallyBlock {

    public static int greet(){
        try{
            int a = 50;
            int b= 2;
            int c = a/b;
            return c;

        }catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("Function End");
        }
        return -1;
    }


    public static void main(String[] args) {
//        int result = greet();
//        System.out.println(result);

//        int a = 7;
//        int b = 9;
//        while (true){
//            try{
//                System.out.println("Division Result = "+a/b);
//            }catch (Exception e){
//                System.out.println(e);
//                break;
//            }
//            finally {
//                System.out.println("I am finally for value of b = "+b);
//            }
//            b--;
//            System.out.println("");
//        }

        try {
            System.out.println(5/0);
        }
        finally {
            System.out.println("Yes this is finally");
        }

    }
}
