package JavaNotes.Oops.BasicConcepts;


class MyEmployeeClass{
    private int id ;
    private String name;

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

}


public class AccessModifier {
    public static void main(String[] args) {
        MyEmployeeClass employee = new MyEmployeeClass();
        employee.setId(1);
        employee.setName("Waseem");
        System.out.println(employee.getId());
        System.out.println(employee.getName());
    }
}
