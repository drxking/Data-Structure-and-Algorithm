package Hello;

public class Animal{
    public String food;
    protected int eyes = 2;

    public void eat() {
        System.out.println("Eating Food");
    }

    String getFood() {
        return this.food;
    }

    void setFood(String food) {
        if (food == "fool") {
            System.out.println("Invalid Word");
        } else {
            this.food = food;
        }
    }

}

// default - package vitra
// public - jaa bata ni paiyo
// protected - package vitra default jastai act garxa tra package bahira chai
// extend garna paryo