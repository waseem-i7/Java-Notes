package JavaNotes.Method;

public class BasicConcept {

    public static void main(String[] args) {

//        int result = logic(6,3);  //Function calling
//        System.out.println(result);

//        System.out.println(sum(6,4));
//        System.out.println(sum(1,2));
//        System.out.println(sum(1,2,3));
//        System.out.println(sum(1,2,3,4));
//        System.out.println(sum(1,2,3,4,5,6));


    }

//    static int sum(int a,int b,int ...arr){
//        int result = 0 ;
//        for (int element : arr){
//            result = result+element;
//        }
//        return a+b+result;
//    }

     static int logic(int a, int b){ //function definition
        int c;
        if (a>b){
           c = a-b;
        }else {
            c=b-a;
        }
        return  c;
    }

//    static void sum(int a,int b){
//        System.out.println(a+b);
//    }
//
//    static int sum(int a,int b,int c){
//        return a+b+c;
//    }
//
//    static void sum(int a,int b,int c,int d){
//        System.out.println(a+b+c+d);
//    }

}
