package Computer;


public class Computer {
    public String name;
    public int dimension;
    public String layout;
    public String laptopColor;

    public int[] storage = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
    private int pointer = -1;

    Computer(String name, int dimension, String layout, String laptopColor) {
        this.dimension = dimension;
        this.layout = layout;
        this.laptopColor = laptopColor;
        this.name = name;
    }

    public void Display(String inp) {
        System.out.println(this.name + " is Displaying: " + inp);
    }

    public void Store(int inp) {
        if (this.pointer == -1) {
            this.pointer++;
            storage[pointer] = inp;
            System.out.println("The Data is inserted at " + pointer);
            return;
        }
        if (this.pointer == storage.length - 1) {
            System.out.println("Storage Full! Cannot Load Data");
            return;
        }

        pointer++;
        storage[pointer] = inp;
        System.out.println("The Data is inserted at " + pointer);

    }
    public int getData(int index){
        return this.storage[index];
    }

    public void updateStore(int index, int inp){
        if(index < 0 || index > (this.storage.length-1)){
            System.out.println("Please Enter Valid Index");
            return;
        }
        this.storage[index] = inp;
    }
}
