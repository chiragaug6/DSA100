/**
 * 57. Write a menu driven program to implement following operations on the
 * singly linked list.
 *  Insert a node at the front of the linked list.
 *  Display all nodes.
 *  Delete a first node of the linked list.
 *  Insert a node at the end of the linked list.
 *  Delete a last node of the linked list.
 *  Delete a node from specified position.
 */

public class PRO57 {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.insertAtEnd(20);

        ll.DisplayList();

        ll.insertAtFront(10);
        ll.insertAtFront(5);
        ll.insertAtFront(2);

        ll.DisplayList();

        ll.insertAtEnd(50);

        ll.DisplayList();

        ll.deleteFirstNode();

        ll.DisplayList();

        ll.deleteLastNode();

        ll.DisplayList();

        ll.deleteAtPosition(1);

        ll.DisplayList();
    }
}

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

class LinkedList {
    Node head;

    // Insert a node at the front of the linked list.
    public void insertAtFront(int data) {
        Node temp = new Node(data);
        temp.next = head;
        head = temp;
    }

    // Insert a node at the end of the linked list.
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;

            while (current.next != null) {
                current = current.next;
            }

            current.next = newNode;
        }
    }

    // Delete a first node of the linked list.
    public void deleteFirstNode() {
        if (head == null) {
            System.out.println("LinkedList is Empty. No Node to Delete");
        } else {
            head = head.next;
        }
    }

    // Delete a last node of the linked list.
    public void deleteLastNode() {
        if (head == null) {
            System.out.println("LinkedList is Empty. No Node to Delete");
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }

        current.next = null;
    }

    // Delete a node from specified position.
    public void deleteAtPosition(int position) {
        if (head == null) {
            System.out.println("list is Empty...");
            return;
        }

        // delete head node if position is 0
        if (position == 0) {
            head = head.next;
            return;
        }

        Node current = head;
        Node previous = null;
        int currentIndex = 0;

        // Traverse the list to find the node at the given position
        while (current != null && currentIndex < position) {
            previous = current;
            current = current.next;
            currentIndex++;
        }

        // If the position is out of bounds
        if (current == null) {
            System.out.println("Position Out of Range.");
            return;
        }

        // Link the previous node to the next node, skipping the current node
        previous.next = current.next;
    }

    // Display all nodes.
    public void DisplayList() {
        if (head == null) {
            System.out.println("List is Empty.");
            return;
        }

        Node current = head;

        while (current != null) {
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.println("null");
    }
}