package JavaNotes.Oops.Abstraction;

interface sampleInterface{
    void meth1();
    void meth2();
}

interface sampleInterface1{
    void meth5();
    void meth6();
}

interface childSampleInterface extends sampleInterface,sampleInterface1{
    void meth3();
    void meth4();
}

class MySampleClass implements  childSampleInterface{

    @Override
    public void meth1() {
        System.out.println("meth1");
    }

    @Override
    public void meth2() {
        System.out.println("meth2");
    }

    @Override
    public void meth3() {
        System.out.println("meth3");
    }

    @Override
    public void meth4() {
        System.out.println("meth4");
    }

    @Override
    public void meth5() {
        System.out.println("meth5");
    }

    @Override
    public void meth6() {
        System.out.println("meth6");
    }
}

public class InheritanceInInterfaces {
    public static void main(String[] args) {
        MySampleClass obj = new MySampleClass();
        obj.meth1();
        obj.meth2();
        obj.meth3();
        obj.meth4();
        obj.meth5();
        obj.meth6();
    }
}
