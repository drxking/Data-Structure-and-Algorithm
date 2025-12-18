package Basics;

public class AccessModifier {
    public String name;

    public void setName(String name){
        String[] data = name.split("[0-9]{1,3}");
        System.out.println(data[0]+" " + data[1] );
        this.name = data[0];
    }
    public String getName(){
        return this.name;
    }
}