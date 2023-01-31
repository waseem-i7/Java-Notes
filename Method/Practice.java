package JavaNotes.Method;

public class Practice {
    public static void main(String[] args) {

        int result= sum(10);
        System.out.println(result);
    }

    static int  sum(int n){
        if(n==1){
            return 1;
        }else {
            return n+sum(n-1);
        }
    }

//    static void sum(int n){
//        int result =0;
//        for (int i=1 ; i<=n ; i++){
//            result += i;
//        }
//        System.out.println(result);
//    }



}
