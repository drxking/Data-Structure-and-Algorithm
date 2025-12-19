package Areas;

public class Circle extends Area {
    double radius;

    Circle(double radius){
        this.radius = radius;
    }

    double area(){
        return Math.PI * this.radius * this.radius;
    }
}
