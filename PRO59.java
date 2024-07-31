/**
 * 59. WAP to check whether 2 singly linked lists are same or not.
 */

public class PRO59 {
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();

        l1.insertAtEnd(10);
        l1.insertAtEnd(20);
        l1.insertAtEnd(30);

        LinkedList l2 = new LinkedList();

        l2.insertAtEnd(10);
        l2.insertAtEnd(20);
        l2.insertAtEnd(30);

        System.out.println(isSameLinkedList(l1, l2));
    }

    public static boolean isSameLinkedList(LinkedList l1, LinkedList l2) {
        Node current1 = l1.head;
        Node current2 = l2.head;

        while (current1 != null && current2 != null) {
            if (current1.data != current2.data) {
                return false;
            }
            current1 = current1.next;
            current2 = current2.next;
        }

        return current1 == null && current2 == null;
    }
}

// class Node {
// int data;
// Node next;

// Node(int data) {
// this.data = data;
// this.next = null;
// }
// }

// class LinkedList {
// Node head;

// public void insertAtEnd(int data) {
// Node newNode = new Node(data);

// if (head == null) {
// head = newNode;
// } else {
// Node current = head;

// while (current.next != null) {
// current = current.next;
// }

// current.next = newNode;
// }
// }

// public void DisplayList() {
// if (head == null) {
// System.out.println("List is Empty.");
// return;
// }

// Node current = head;

// while (current != null) {
// System.out.print(current.data + "-->");
// current = current.next;
// }
// System.out.println("null");
// }
// }
