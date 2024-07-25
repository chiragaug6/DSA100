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
    int[] arr;

    ArrayQueue(int size) {
        front = rear = -1;
        this.size = size;
        arr = new int[size];
    }

    // Enqueue operation
    public void enqueue(int val) {
        if (rear == size - 1) {
            System.out.println("Queue is Full.");
            return;
        }

        if (front == -1) {
            front = rear = 0;
            arr[0] = val;
        } else {
            arr[rear + 1] = val;
            rear++;
        }
        size++;
    }

    // Dequeue operation
    public int dequeue() {
        if (size == 0) {
            System.out.println("Queue is Empty.");
            return -1;
        }

        int temp = arr[front];
        front++;
        size--;
        return temp;
    }

    public int peek() {
        if (size == 0) {
            System.out.println("Queue is Empty.");
            return -1;
        }
        return arr[front];
    }

    // Display Queue
    public void display() {
        if (size == 0) {
            System.out.println("Queue is Empty.");
            return;
        } else {
            for (int i = front; i <= rear; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}
