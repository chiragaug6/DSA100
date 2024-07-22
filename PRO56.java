/**
 * 56. Write a program to implement a node structure for singly linked list.
 * Read the data in a node, print the node.
 */
public class PRO56 {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.insertAtEnd(10);
        ll.insertAtEnd(20);
        ll.insertAtEnd(30);
        ll.insertAtEnd(40);
        ll.insertAtEnd(50);

        ll.printList();
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

class LinkedList {
    Node head;

    public void insertAtEnd(int data) {
        Node temp = new Node(data);

        if (head == null) {
            head = temp;
        } else {
            Node current = head;

            while (current.next != null) {
                current = current.next;
            }

            current.next = temp;
        }
    }

    public void printList() {
        Node current = head;

        while (current != null) {
            System.out.print(current.data + "-->");
            current = current.next;
        }
    }
}