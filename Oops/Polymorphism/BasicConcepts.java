package JavaNotes.Oops.Polymorphism;


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

class MySmartPhone extends MyCellPhone implements MyWifi, MyCamera {

    @Override
    public void takeSnap() {
        System.out.println("Taking Snap...");
    }

    @Override
    public void recordVideo() {
        System.out.println("Recording Video...");
    }

//    @Override
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
        System.out.println("Connecting to network..."+network);
    }

    public void Calling(){
        System.out.println("Calling Now...");
    }
}

public class BasicConcepts {
    public static void main(String[] args) {
        MyCamera cam1 = new MySmartPhone(); //This is a smartphone but, use it as a camera
        //cam1.getNetworks();  -->Not allowed
        //cam1.connectToNetwork("Tesla5G"); -->Not allowed
        //cam1.Calling(); -->Not allowed
        //cam1.takeSnap();
        //cam1.recordVideo();
        //cam1.record4KVideo();

        MySmartPhone s = new MySmartPhone();
        s.takeSnap();
        s.recordVideo();
        s.record4KVideo();
        for (String item : s.getNetworks()) {
            System.out.println(item);
        }
        s.connectToNetwork("Tesla5G");
        s.callNumber(639560479);
        s.pickCall();
        s.Calling();
    }
}
