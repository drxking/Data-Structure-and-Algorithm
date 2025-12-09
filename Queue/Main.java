package Queue;

public class Main {
    public static void main(String[] args) {
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
    
    }
}
