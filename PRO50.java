/**
 * 50. Write a menu driven program to implement following operations on the
 * Queue using an Array
 * ENQUEUE
 * DEQUEUE
 * DISPLAY
 */

public class PRO50 {
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(10);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);

        queue.display();

        queue.dequeue();
        queue.dequeue();

        queue.display();
    }
}

class ArrayQueue {
    int front, rear;
    int size;
    int[] queue;

    ArrayQueue(int size) {
        front = rear = -1;
        this.size = size;
        queue = new int[size];
    }

    // check if QUEUE isFull
    public boolean isFull() {
        return rear == size - 1;
    }

    // check if Queue ifEmpty
    public boolean isEmpty() {
        return front == -1 || front > rear;
    }

    // Enqueue operation
    public void enqueue(int element) {
        if (isFull()) {
            System.out.println("Queue is Full.");
            return;
        }

        // move front pointer for first insertion
        if (front == -1) {
            front = 0;
        }

        // increment rear and set element
        queue[++rear] = element;
        System.out.println(element + " enqueued.");
    }

    // Dequeue operation
    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty.");
            return;
        }

        System.out.println(queue[front] + " dequeued.");
        front++;
    }

    public void peek() {
        if (isEmpty()) {
            System.out.println("Queue is Empty.");
            return;
        }

        System.out.println(queue[front] + " At Peek.");
    }

    // Display Queue
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is Empty.");
            return;
        } else {
            for (int i = front; i <= rear; i++) {
                System.out.print(queue[i] + " ");
            }
            System.out.println();
        }
    }
}
