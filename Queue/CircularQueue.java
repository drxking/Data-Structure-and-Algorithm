package Queue;

public class CircularQueue {
    private int[] arr = new int[5];
    private int front = -1;
    private int rear = -1;
    private int max = 5;

    void enqueue(int inp) {

        if ((this.rear + 1) % this.max == this.front) {
            System.out.println("The Queue is Empty! Cannot insert: " + inp);
            return;
        }
        if (this.front == -1) {
            this.front = 0;
            this.rear = 0;
            arr[rear] = inp;
            System.out.println(this.front + " " + this.rear);
            return;
        }
        this.rear = (this.rear+1) % this.max;
        this.arr[this.rear] = inp;
        System.out.println(this.front + " " + this.rear);

    }

    void dequeue() {

        if (this.front == -1) {
            System.out.println("Queue is Empty!");
            return;
        }
        if (this.front == this.rear) {
            this.arr[this.front] = 0;
            this.front = -1;
            this.rear = -1;
            System.out.println(this.front + " " + this.rear);
            return;
        }

        this.arr[this.front] = 0;
        this.front = (this.front+1) % this.max;
        System.out.println(this.front + " " + this.rear);
    }

    void printElementsInQueue() {

        for (int i = 0; i < this.max; i++) {
            System.out.printf("[%d]   ", this.arr[i]);
        }

        System.out.print("\n");
    }
}
