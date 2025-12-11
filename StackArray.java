import java.util.Scanner;

public class StackArray {

    int max = 5;
    int[] stack = new int[max];
    int top = -1;

    // Push operation
    void push(int value) {
        if (isFull()) {
            System.out.println("Stack Overflow!");
            return;
        }
        stack[++top] = value;
        System.out.println(value + " pushed into stack");
    }

    // Pop operation
    int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow!");
            return -1;
        }
        return stack[top--];
    }

    // Check empty
    boolean isEmpty() {
        return top == -1;
    }

    // Check full
    boolean isFull() {
        return top == max - 1;
    }

    // Display stack
    void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }

        System.out.print("Stack: ");
        for (int i = top; i >= 0; i--)
            System.out.print(stack[i] + " ");

        System.out.println();
    }

    public static void main(String[] args) {

        StackArray s = new StackArray();

        s.push(10);
        s.push(20);
        s.push(30);

        s.display();

        System.out.println("Popped: " + s.pop());

        s.display();
    }
}
