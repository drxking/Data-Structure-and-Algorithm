package Queue;

public class LinearQueue {
    public int[] arr = new int[5];
    private int front = -1;
    private int rear = -1;
    private int max = 5;

    void enqueue(int inp) {
        if (this.front == -1) {
            front = 0;
            this.rear = 0;
            this.arr[this.rear] = inp;
            this.printElementsInQueue();
            return;
        }
        if (this.rear == max - 1) {
            System.out.println("Queue Overflow! Cannot insert value " + inp);
            return;
        }
        this.rear++;
        this.arr[this.rear] = inp;
        this.printElementsInQueue();
    }

    void dequeue() {
        if (this.front == -1) {
            System.out.println("Cannot Dequeue! Queue is Empty");
        }
        if (this.front == this.max) {
            System.out.println("Cannot Dequeue! Queue is Empty");
            return;
        }
        this.front++;
        this.printElementsInQueue();

    }

    void printElementsInQueue() {
        for (int i = 0; i < this.front; i++) {
            System.out.printf("[ ]   ");

        }
        for (int i = this.front; i <= this.rear; i++) {
            System.out.printf("[%d]   ", this.arr[i]);
        }
        for (int i = this.rear + 1; i < 5; i++) {
            System.out.printf("[ ]   ");

        }
        System.out.print("\n");
    }
}
