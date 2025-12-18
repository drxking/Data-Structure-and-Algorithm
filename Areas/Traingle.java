package Areas;

public class Traingle extends Area {
    public int base;
    public int height;

    Traingle(int base,int height){
        this.base = base;
        this.height = height;
    }

    int area(){
        return(base * height) /2;
    }
}

