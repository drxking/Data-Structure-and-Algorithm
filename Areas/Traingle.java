package Areas;

public class Traingle extends Area {
    public double base;
    public double height;

    Traingle(double base,double height){
        this.base = base;
        this.height = height;
    }

    double area(){
        return(base * height) /2;
    }
}

