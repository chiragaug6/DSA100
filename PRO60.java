// 60. Write a program to implement stack using singly linked list. 

public class PRO60 {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.display();
        s.pop();
        s.display();
        s.peek();
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

class Stack {
    Node top;
    int length;

    public Stack() {
        this.top = null;
        this.length = 0;
    }

    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        length++;
        System.out.println(data + " pushed to stack");
    }

    public void pop() {
        if (top == null) {
            System.out.println("Stack underflow");
            return; // Return -1 to indicate stack underflow
        }
        int data = top.data;
        top = top.next;
        System.out.println(data + " deleted...");
    }

    public void peek() {
        if (top == null) {
            System.out.println("Stack is Empty");
            return;
        }
        System.out.println("peek :" + top.data);
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void display() {
        Node current = top;
        while (current != null) {
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.println("null");
    }
}
