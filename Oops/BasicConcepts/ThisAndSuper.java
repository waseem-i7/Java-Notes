package JavaNotes.Oops.BasicConcepts;

class EkClass{
    int a;
//    EkClass(int v){
//        a= v;
//    }
    EkClass(){
        System.out.println("I am a constructor of EkClass.");
        this.a= a;
    }
    EkClass(int a){
        System.out.println("I am a overloaded constructor of EkClass with value a: "+a);
        this.a= a;
    }
    public int getA() {
        return a;
    }
}

class DoClass extends EkClass{
    DoClass(int c){
        super(c);
        System.out.println("I am a constructor of DoClass.");
    }
}
public class ThisAndSuper {
    public static void main(String[] args) {
         EkClass e = new EkClass(12);
         DoClass d = new DoClass(33);
         e.getA();
    }
}

