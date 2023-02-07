package JavaNotes.Oops;

class  MyEmployee1{
    private int salary;
    private String name;

    public MyEmployee1(){ //Default Constructor
        this.name = "Supriya";
        this.salary = 50000;
    }

    public MyEmployee1(String name , int salary){
          this.name = name;
          this.salary = salary;
    }

    public int getSalary(){
        return salary;
    }

    public String getName(){
        return name;
    }
}
public class Constructor {
    public static void main(String[] args) {

//        MyEmployee1 e1 = new MyEmployee1();
//        e1.setName("waseem");
//        e1.setSalary(12000);
//        System.out.println(e1.getName());
//        System.out.println(e1.getSalary());

        MyEmployee1 e2 = new MyEmployee1("Pooja",500000);
        System.out.println(e2.getName());
        System.out.println(e2.getSalary());
    }
}
