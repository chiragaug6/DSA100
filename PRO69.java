// 69. Write a program to remove the duplicates nodes from given sorted Linked List. 
//  Input: 1 → 1 → 6 → 13 → 13 → 13 → 27 → 27 
//  Output: 1 → 6 → 13 → 27

public class PRO69 {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.insertAtEnd(1);
        ll.insertAtEnd(1);
        ll.insertAtEnd(6);
        ll.insertAtEnd(13);
        ll.insertAtEnd(13);
        ll.insertAtEnd(13);
        ll.insertAtEnd(27);
        ll.insertAtEnd(27);

        ll.DisplayList();

        ll.deleteDuplicatesFromSorted();

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

    public void deleteDuplicatesFromSorted() {
        Node temp = head;

        while (temp.next != null) {
            if (temp.data == temp.next.data) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }
    }
}
