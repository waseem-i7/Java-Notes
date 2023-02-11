package JavaNotes.Oops.BasicConcepts;

import JavaNotes.BasicConcepts.Intiger;

import java.util.Queue;

class Cylender{
    private int radius;
    private int height;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double Volume(){
        return Math.PI*radius*radius*height;
    }

    public double SurfaceArea(){
        return 2*Math.PI*radius*height*(radius+height);
    }

}

class Cylender1{
    private int radius;
    private int height;

    public Cylender1(int radius,int height){
        this.radius = radius;
        this.height = height;
    }


    public int getRadius() {
        return radius;
    }

    public int getHeight() {
        return height;
    }

    public double Volume(){
        return Math.PI*radius*radius*height;
    }

    public double SurfaceArea(){
        return 2*Math.PI*radius*height*(radius+height);
    }

}

class Rectangle{
    private int length;
    private int breadth;

    public Rectangle(){
        this.length = 4;
        this.breadth = 5;
    }

    public Rectangle(int length,int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }
}

class MySquare{
    private int side;

    public MySquare(){
        this.side = 4;
    }

    public MySquare(int side){
        this.side = side;
    }

    public int getSide() {
        return side;
    }

}

public class PracticeSet1 {

    public static void main(String[] args) {
/*
        //Question 1
        Cylender cylender = new Cylender();
        cylender.setRadius(3);
        cylender.setHeight(10);
        System.out.println(cylender.getRadius());
        System.out.println(cylender.getHeight());

        //Question 2
        System.out.println(cylender.Volume());
        System.out.println(cylender.SurfaceArea());

        //Question 3
        Cylender1 cylender1 = new Cylender1(3,9);
        System.out.println(cylender1.getRadius());
        System.out.println(cylender1.getHeight());
        System.out.println(cylender1.SurfaceArea());
        System.out.println(cylender1.Volume());

        //Question 4
        Rectangle rectangle1 = new Rectangle();
        System.out.println(rectangle1.getBreadth());
        System.out.println(rectangle1.getLength());

        Rectangle rectangle2 = new Rectangle(2,3);
        System.out.println(rectangle2.getBreadth());
        System.out.println(rectangle2.getLength());

        //Question 5
        MySquare mySquare = new MySquare();
        System.out.println(mySquare.getSide());

        MySquare mySquare1 = new MySquare(2);
        System.out.println(mySquare1.getSide());

        */
    }
}
