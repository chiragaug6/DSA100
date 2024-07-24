// 69. Write a program to remove the duplicates nodes from given sorted Linked List. 
//  Input: 1 → 1 → 6 → 13 → 13 → 13 → 27 → 27 
//  Output: 1 → 6 → 13 → 27

import java.util.HashSet;

public class PRO62 {
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

        ll.DisplayList();

        ll.deleteDuplicatesFromUnsorted();

        ll.DisplayList();
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

    public void deleteDuplicatesFromUnsorted() {
        HashSet<Integer> set = new HashSet<>();

        Node current = head;
        Node previous = null;

        while (current != null) {
            if (set.contains(current.data)) {
                previous.next = current.next;
            } else {
                set.add(current.data);
                previous = current;
            }
            current = current.next;
        }
    }
}
