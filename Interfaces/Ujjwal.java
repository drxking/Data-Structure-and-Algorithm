package Interfaces;

class Ujjwal extends Sudip implements Person, Suckxam {
    public void walk(String name) {
        System.out.println("walking");
    }

    public void run() {
        System.out.println("Running");
    }

    public void hello() {
        System.out.println("Hello");
    }



    public static void main(String[] args) {
        Ujjwal u1 = new Ujjwal();
        u1.bakchodi();
        u1.hello();
        u1.run();
        u1.walk("Ujjwal");
        u1.talk();
        System.out.println(Suckxam.legs);
        
    }
}
