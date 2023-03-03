package JavaNotes.Oops.Abstraction;

interface MyCamera{
    void takeSnap();
    void recordVideo();
    private void greet(){
        System.out.println("Good Morning...");
    }
    default void record4KVideo(){
        greet();
        System.out.println("Recording in 4k...");
    }

    static void filter(){
        System.out.println("Filtering the Image");
    }
}

interface MyWifi{
    String[] getNetworks();
    void connectToNetwork(String network);
}

class MyCellPhone{
    void callNumber(int phoneNumber){
        System.out.println("Calling "+phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting... ");
    }
}

class MySmartPhone extends MyCellPhone implements MyWifi, MyCamera{

    @Override
    public void takeSnap() {
        System.out.println("Taking Snap...");
    }

    @Override
    public void recordVideo() {
        System.out.println("Recording Video...");
    }

//    public void record4KVideo(){
//        System.out.println("Recording in 4k in My SmartPhone...");
//    }

    @Override
    public String[] getNetworks() {
        System.out.println("Getting List of Networks");
        String[] networkList = {"Harry","Prashanth","Anjali5G"};
        return networkList;
    }

    @Override
    public void connectToNetwork(String network) {
        System.out.println("Connecting to Network "+network);
    }
}

public class DefaultMethods {
    public static void main(String[] args) {
        MySmartPhone ms = new MySmartPhone();
        ms.takeSnap();
        ms.recordVideo();
        ms.connectToNetwork("Tesla5G");
       // ms.greet(); -->Throws an error!;
        String[] arr = ms.getNetworks();
        for (String item : arr){
            System.out.println(item);
        }

        //Calling Static Method of an Interface
        MyCamera.filter();
    }
}
