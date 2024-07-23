// 61. Write a program to implement queue using singly linked list. 

public class PRO61 {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);

        queue.display();

        queue.dequeue();
        queue.dequeue();

        queue.peek();

        queue.display();
    }
}

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Queue {
    Node front;
    Node rear;

    Queue() {
        this.front = null;
        this.rear = null;
    }

    public void enqueue(int data) {
        Node newNode = new Node(data);

        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        System.out.println(data + " enqueued to queue.");
    }

    public void dequeue() {
        if (front == null) {
            System.out.println("underflow. queue is Empty.");
            return;
        }
        int temp = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        System.out.println(temp + " dequeue from queue.");
    }

    public void peek() {
        if (front == null) {
            System.out.println("Queue is Empty.");
            return;
        }

        System.out.println("peek :" + front.data);
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void display() {
        if (front == null) {
            System.out.println("Queue is Empty.");
            return;
        }

        Node curr = front;

        while (curr != null) {
            System.out.print(curr.data + "-->");
            curr = curr.next;
        }
        System.out.println("null");
    }
}
