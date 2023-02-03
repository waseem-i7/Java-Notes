package JavaNotes.AccessModifiers1;

public class AccessModifierClass {
    public int x = 5;
    protected int y = 45;
    int z = 6;
    private int a = 78;

    public void meth1(){
        System.out.println("The value of x is "+x);
        System.out.println("The value of y is "+y);
        System.out.println("The value of z is "+z);
        System.out.println("The value of a is "+a);
    }
}
