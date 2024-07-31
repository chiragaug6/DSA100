/**
 * 58. Write a program to count the number of nodes in a singly circularly
 * linked list.
 * 
 */

public class PRO58 {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.insertAtFront(50);
        ll.insertAtFront(40);
        ll.insertAtFront(30);
        ll.insertAtFront(20);

        System.out.println(countNodes(ll.head));
    }

    static int countNodes(Node head) {
        if (head == null) {
            return 0;
        }

        int count = 0;
        Node current = head;

        while (current != null) {
            count++;
            current = current.next;
        }

        return count;
    }
}
