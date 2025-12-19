package Areas;

public class Rectangle extends Area {

    public double length;
    public double breadth;

    Rectangle(double length,double breadth){
        this.length = length;
        this.breadth = breadth;
    }


    double area() {
        return length * breadth;
    }

}