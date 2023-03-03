package JavaNotes.Oops.Abstraction;


abstract class Pen{
    abstract void write();
    abstract void refill();
}
//abstract class FountainPen extends Pen{
//    void scan(){
//        System.out.println("Scanning...");
//    }
//}
class FountainPen extends Pen{

    @Override
    void write() {
        System.out.println("Write");
    }

    @Override
    void refill() {
        System.out.println("Refill");
    }

    void changeNib(){
        System.out.println("Changing the nib");
    }
}


abstract class Monkey{
    abstract void jump();
    abstract void bite();
}

interface BasicAnimal{
    void eat();
    void sleep();
}

class Human extends Monkey implements  BasicAnimal{

    @Override
    void jump() {
        System.out.println("Jumping");
    }

    @Override
    void bite() {
        System.out.println("Biting");
    }

    @Override
    public void eat() {
        System.out.println("Eating");
    }

    @Override
    public void sleep() {
        System.out.println("Sleeping");
    }

    public void speak(){
        System.out.println("Hello sir!");
    }
}

abstract class TelePhone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}

class SmartTelephone extends TelePhone{

    @Override
    void ring() {
        System.out.println("Ringing...");
    }

    @Override
    void lift() {
        System.out.println("Lifting...");
    }

    @Override
    void disconnect() {
        System.out.println("Disconnecting...");
    }

    void takePick(){
        System.out.println("taking Pick...");
    }
}


interface TVRemote{
    void volumeUp();
    void volumeDown();
}
interface SmartTvRemote extends TVRemote{
    void CastMobileScreen();
}
class TV implements TVRemote{

    @Override
    public void volumeUp() {
        System.out.println("Volume Up");
    }

    @Override
    public void volumeDown() {
        System.out.println("Volume Down");
    }
}

public class PracticeSet {
    public static void main(String[] args) {
/*
        //Question 1 and Question2
        FountainPen fountainPen = new FountainPen();
        fountainPen.changeNib();
        fountainPen.refill();
        fountainPen.write();

        //Question 3
        Human human = new Human();
        human.jump();
        human.bite();
        human.eat();
        human.sleep();
        human.speak();

        //Question 4
        TelePhone telePhone = new SmartTelephone();
        telePhone.disconnect();
        telePhone.lift();
        telePhone.ring();
        //telePhone.takePick(); -->Cannot use takePick method because the reference is telephone
        //which does not have takePick method


        //Question 5
        Monkey monkey = new Human();
        monkey.jump();
        monkey.bite();
        //monkey.speak() --> Cannot use speak method because the reference is monkey does not have speak method

        BasicAnimal lovish = new Human();
        //lovish.speak(); --> error
        lovish.eat();
        lovish.sleep();

        //Question 6 and 7
        TV tv = new TV();
        tv.volumeUp;
        tv.volumeDown;
 */

    }
}
