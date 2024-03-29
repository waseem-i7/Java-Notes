package JavaNotes.AdvanceJava;

import java.io.FileWriter;
import java.io.IOException;

class MyDeprecated {
    @Deprecated
    void meth1() {
        System.out.println("I am method 1");
    }
}

interface MyInt {
    void display();
}

public class PracticeSet {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        //Question 1
        // Generate Java Docs

        //Question 2
        MyDeprecated d = new MyDeprecated();
        d.meth1();

        //Question 3
        //SuppressWarnings of deprecated method meth1()

        //Question 4
//        MyInt i = () -> System.out.println("I am display");
//        i.display();

        //Question 5
        int i = 19;
        String table = "";
        for (int j = 0; j < 10; j++) {
            table += i + "X"+(j+1) + "=" + i*(j+1);
            table += "\n";
        }
        try {
            FileWriter fileWriter = new FileWriter("MultiplicationTable.txt");
            fileWriter.write(table);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
