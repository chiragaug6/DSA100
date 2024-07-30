// 64. Write a program to reverse a linked list. 

public class PRO64 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insertAtEnd(1);
        list.insertAtEnd(1);
        list.insertAtEnd(6);
        list.insertAtEnd(5);
        list.insertAtEnd(13);

        System.out.println("Original List:");
        list.DisplayList();

        // Reverse the list
        list.reverseList();

        System.out.println("Reversed List:");
        list.DisplayList();
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

    public void reverseList() {
        Node curr = head;
        Node prev = null;

        while (curr != null) {
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        head = prev;
    }
}
