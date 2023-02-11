package JavaNotes.Oops.Abstraction;

interface Bicycle{
    int a = 45;
    void applyBrake(int decrement);
    void speedUp(int increment);
}

interface HornBicycle{
    int b = 5;
    void blowHornK3g();
    void blowHornMhn();
}

class AvonCycle implements Bicycle, HornBicycle{
    //public int a =  40;
    void blowHorn(){
        System.out.println("Pee Pee Poo Poo.");
    }
    @Override
    public void applyBrake(int decrement) {
        System.out.println("Applying Brake.");
    }

    @Override
    public void speedUp(int increment) {
        System.out.println("Applying SpeedUp.");
    }

    @Override
    public void blowHornK3g() {
        System.out.println("Kabhi khusi kabhi gum pee pee pee pee");
    }

    @Override
    public void blowHornMhn() {
        System.out.println("Main hoon naa po po po po");
    }
}
public class Interfaces{
    public static void main(String[] args) {
        AvonCycle avonCycle = new AvonCycle();
        avonCycle.applyBrake(1);
        //You can create properties in Interfaces
        System.out.println(avonCycle.a);
        //You cannot modify the properties in Interfaces as they are final
        //avonCycle.a = 24;
        avonCycle.blowHornK3g();
        avonCycle.blowHornMhn();
    }
}
