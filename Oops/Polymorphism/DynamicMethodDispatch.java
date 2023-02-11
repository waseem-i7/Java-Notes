package JavaNotes.Oops.Polymorphism;

class Phone{
    public void showTime(){
        System.out.println("Time is 8 am");
    }

    public void on(){
        System.out.println("Turning on Phone...");
    }
}

class SmartPhone extends Phone{
    public void music(){
        System.out.println("Playing music");
    }

    public void on(){
        System.out.println("Turning on SmartPhone...");
    }
}
public class DynamicMethodDispatch {
    public static void main(String[] args) {

       /* //Scenario 1
        Phone phone = new Phone();
        phone.showTime();
        phone.on();

        //Scenario 2
        SmartPhone smartPhone = new SmartPhone();
        smartPhone.showTime();
        smartPhone.on();
        smartPhone.music();
        */

        //Scenario 3
        Phone obj = new SmartPhone(); //Allowed
        obj.on();    //here SmartPhone on method will be run ,it is known as dynamic method dispatch , it is runtime polymorphism
        //obj.music(); //Not Allowed

        //Scenario 4
        //SmartPhone obj1 = new Phone(); // Not Allowed
    }
}
