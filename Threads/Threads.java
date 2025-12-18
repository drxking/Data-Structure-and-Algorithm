package Threads;
public class Threads extends Thread {

    public String name;
    Threads(String name){
        this.name = name;
        System.out.println("Name is "+ this.name);
    }
    public void run(){
        System.out.println("Thread is Running" + this.name);
        doops();
    }

    public void doops(){
        for(int i = 0; i<100;i++){
            System.out.println(i +" "+ this.name + " " + Thread.currentThread().getName());
        }
    }
}
