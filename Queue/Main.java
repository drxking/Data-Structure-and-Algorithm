package Queue;

public class Main {
    public static void main(String[] args) {
        System.out.println("Linear Queue!!!");
        LinearQueue q1 = new LinearQueue();
        q1.enqueue(11);
        q1.enqueue(12);
        q1.enqueue(13);
        q1.enqueue(14);
        q1.enqueue(15);
        q1.dequeue();
        q1.dequeue();
        q1.dequeue();
        q1.dequeue();
        q1.dequeue();
        q1.dequeue();
    
        System.out.print("\n");
        System.out.println("Circular Queue!!!");

        CircularQueue c1 = new CircularQueue();
        c1.enqueue(11);
        c1.enqueue(12);
        c1.enqueue(13);
     
        c1.dequeue();
        c1.dequeue();
        c1.dequeue();
        c1.dequeue();
        c1.enqueue(27);

        // c1.dequeue();
        // c1.dequeue();
        c1.enqueue(20);
        c1.enqueue(23);
        c1.dequeue();

        c1.printElementsInQueue();
    }
}
