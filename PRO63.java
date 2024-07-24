// 63. Write a program to copy a linked list. 

public class PRO63 {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertAtEnd(1);
        ll.insertAtEnd(1);
        ll.insertAtEnd(6);
        ll.insertAtEnd(5);
        ll.insertAtEnd(13);
        ll.insertAtEnd(5);
        ll.insertAtEnd(27);
        ll.insertAtEnd(25);

        System.out.println("origin LL");
        ll.DisplayList();

        LinkedList ans = ll.copyLinkedList();

        System.out.println("Copy LL");
        ans.DisplayList();

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

    public LinkedList copyLinkedList() {
        LinkedList newList = new LinkedList();
        if (head == null) {
            return null;
        }

        Node current = head;
        while (current != null) {
            newList.insertAtEnd(current.data);
            current = current.next;
        }
        return newList;
    }

}
