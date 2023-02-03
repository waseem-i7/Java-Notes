package JavaNotes.AccessModifiers;
import JavaNotes.AccessModifiers1.AccessModifierClass;


//class C1{
//    public int x = 5;
//    protected int y = 45;
//    int z = 6;
//    private int a = 78;
//
//    public void meth1(){
//        System.out.println("The value of x is "+x);
//        System.out.println("The value of y is "+y);
//        System.out.println("The value of z is "+z);
//        System.out.println("The value of a is "+a);
//    }
//}

class  Basic extends AccessModifierClass{

     void math2(){
         System.out.println(x); //It is accessible because it is public
         System.out.println(y); //It is accessible because it is protected
//         System.out.println(z); //It is not accessible because it is default
//         System.out.println(a); //It is not accessible because it is private
     }
}



public class BasicConcepts {
    public static void main(String[] args) {
//        C1 c = new C1();
//        System.out.println(c.x);
//        System.out.println(c.y);
//        System.out.println(c.z);
//        //System.out.println(c.a);

//        AccessModifierClass am = new AccessModifierClass();
//        System.out.println(am.x);
//        System.out.println(am.y); //we cannot access because it is protected in different package
//        System.out.println(am.z); //we cannot access because it is Default
//        System.out.println(am.a); //we cannot access because it is private
    }
}
