import java.util.Arrays;

/**
 * 51. Write a menu driven program to implement following operations on a
 * circular queue using an Array
 * Insert
 * Delete
 * Display all elements of the queue
 */

public class PRO51 {
    public static void main(String[] args) {
        CircularQueue cq = new CircularQueue(5);
        cq.insert(10);
        cq.insert(20);
        cq.insert(30);
        cq.insert(40);
        cq.insert(50);

        cq.display();
        cq.delete();
        cq.delete();

        cq.display();

        cq.insert(60);

        cq.display();

        System.out.println(Arrays.toString(cq.arr));
    }
}

class CircularQueue {
    int front, rear;
    int size;
    int[] arr;

    CircularQueue(int capacity) {
        front = rear = -1;
        size = 0;
        arr = new int[capacity];
    }

    // check if Queue isFull
    public boolean isFull() {
        return size == arr.length;
    }

    // check if Queue isEmpty
    public boolean isEmpty() {
        return size == 0 || front == -1;
    }

    // Insert
    public void insert(int element) {
        if (isFull()) {
            System.out.println("Queue is Full!");
            return;
        }

        if (isEmpty()) {
            front = rear = 0;
            arr[0] = element;
        } else if (rear < arr.length - 1) {
            arr[++rear] = element;
        } else if (rear == arr.length - 1) {
            rear = 0;
            arr[0] = element;
        }
        size++;
    }

    // Delete
    public int delete() {
        if (isEmpty()) {
            System.out.println("Queue is Empty!");
            return -1;
        } else {
            int temp = arr[front];
            if (front == arr.length - 1) {
                front = 0;
            } else {
                front++;
            }
            size--;
            return temp;
        }

    }

    // Display all elements of the queue
    public void display() {
        if (size == 0) {
            System.out.println("Queue is Empty!");
            return;
        } else if (front <= rear) {
            for (int i = front; i <= rear; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        } else { // rear<front
            for (int i = front; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }

            for (int i = 0; i <= rear; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}
