
/**
 * Write a menu driven program to implement following operations on the Stack
 * using an Array
 *  PUSH, POP, DISPLAY
 *  PEEP, CHANGE
 */

import java.util.Scanner;

public class PRO38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Stack stack = new Stack(10);
        int choice;

        do {
            System.out.println("------Perfrom Stack Oprations----");
            System.out.println("Select 1. Push");
            System.out.println("Select 2. POP");
            System.out.println("Select 3. Display");
            System.out.println("Select 4. Peep");
            System.out.println("Select 5. Peep");
            System.out.println("Select 6. Chnage");
            System.out.println("Select 7. Exit");
            System.out.print("Select Option ::");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter value to push");
                    int val = sc.nextInt();
                    stack.push(val);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    stack.display();
                    break;
                case 4:
                    System.out.println(stack.peek());
                    break;
                case 5:
                    System.out.print("Enter Index ::");
                    int index = sc.nextInt();
                    System.out.println(stack.peep(index));
                    break;
                case 6:
                    System.out.print("Enter Index ::");
                    index = sc.nextInt();
                    System.out.print("Enter value ::");
                    int elem = sc.nextInt();
                    stack.chnage(index, elem);
                    break;

                default:
                    System.out.println("Thank You...");
                    break;
            }

        } while (choice != 7);

        sc.close();
    }
}

class Stack {
    private int[] stack;
    private int top;
    protected int size;

    Stack(int size) {
        this.size = size;
        this.top = -1;
        stack = new int[size];
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(int elem) {
        // check overflow condition
        if (isFull()) {
            System.out.println("Stack overFlow");
        } else {
            stack[++top] = elem;
        }
    }

    public void pop() {
        // check underflow condition
        if (isEmpty()) {
            System.out.println("stack underflow.");
        } else {
            System.out.println(stack[top] + " Poped.");
            top--;
        }
    }

    public int peek() {
        // return top element
        if (top > -1 && top < size) {
            return stack[top];
        }

        return -1;
    }

    public int peep(int index) {
        if (isEmpty() || index > top || index < 0) {
            System.out.println("invalid index for this options");
        } else {
            return stack[index];
        }

        return -1;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
        } else {
            System.out.println("************stack Elements************");
            for (int i = top; i >= 0; i--) {
                System.out.println("Stack Elem : " + stack[i]);
            }
        }
    }

    public void chnage(int index, int value) {
        if (isEmpty() || index > top || index < 0) {
            System.out.println("invalid index for this options");
        } else {
            stack[index] = value;
            System.out.println("value change successfully.");
        }
    }
}
