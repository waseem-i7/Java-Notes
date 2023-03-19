package JavaNotes.AdvanceJava;

import java.util.ArrayList;

class MyGeneric<T1, T2>{
    int val;
    private T1 t1;
    private T2 t2;

    public MyGeneric(int val, T1 t1, T2 t2) {
        this.val = val;
        this.t1 = t1;
        this.t2= t2;
    }

    public T2 getT2() {
        return t2;
    }

    public void setT2(T2 t2) {
        this.t2 = t2;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public T1 getT1() {
        return t1;
    }

    public void setT1(T1 t1) {
        this.t1 = t1;
    }
}

public class JavaGenerics {

    public static void main(String[] args) {
        //Without Java Generics :
//        ArrayList myArrayList = new ArrayList();
//        myArrayList.add(10);  //Integer value
//        myArrayList.add("Waseem Bhai!"); //String value
//        myArrayList.add(20.4); //Double value
//        myArrayList.add(new Scanner(System.in));
//        int a = (int) myArrayList.get(0);
//        System.out.println(a);
//        System.out.println(myArrayList);


        // With Java Generics :
        //ArrayList<Integer> myArrayList = new ArrayList();
        //ArrayList<int> myArrayList = new ArrayList(); --this will produce an error
        //myArrayList.add(10);  //Integer value
       // myArrayList.add("Harry Bhai!"); //String value
       // myArrayList.add(20.4); //Double value
       // System.out.println(myArrayList);

        //Without Java Generics :
//        ArrayList myArrayList = new ArrayList();
//        myArrayList.add(10);  //Integer value
//        myArrayList.add("Harry Bhai!"); //String value
//        myArrayList.add(20.4); //Double value
//        int x = (int)myArrayList.get(1);
//        System.out.println(x);



            MyGeneric<String, Integer> g1 = new MyGeneric<>(23, "MyString is my string ", 45);
            String str = g1.getT1();
            Integer int1 = g1.getT2();
            System.out.println(str + int1);


    }
}
