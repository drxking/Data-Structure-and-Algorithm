package Areas;

public class Rectangle extends Area {

    public int length;
    public int breadth;

    Rectangle(int length,int breadth){
        this.length = length;
        this.breadth = breadth;
    }


    int area() {
        return length * breadth;
    }

}

