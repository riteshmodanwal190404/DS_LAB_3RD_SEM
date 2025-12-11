import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int value) {
        data = value;
        next = null;
    }
}

public class SinglyLinkedList {

    static Node head = null;

    // Insert at beginning
    public static void insertStart(int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
    }

    // Insert at end
    public static void insertEnd(int value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null)
            temp = temp.next;

        temp.next = newNode;
    }

    // Insert at a specific position
    public static void insertAtPos(int value, int pos) {

        if (pos == 1) {
            insertStart(value);
            return;
        }

        Node newNode = new Node(value);
        Node temp = head;

        for (int i = 1; i < pos - 1 && temp != null; i++)
            temp = temp.next;

        if (temp == null) {
            System.out.println("Invalid Position!");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Delete at start
    public static void deleteStart() {
        if (head == null) return;
        head = head.next;
    }

    // Delete at end
    public static void deleteEnd() {

        if (head == null) return;

        if (head.next == null) {
            head = null;
            return;
        }

        Node temp = head;

        while (temp.next.next != null)
            temp = temp.next;

        temp.next = null;
    }

    // Delete at specific position
    public static void deleteAtPos(int pos) {

        if (pos == 1) {
            deleteStart();
            return;
        }

        Node temp = head;

        for (int i = 1; i < pos - 1 && temp != null; i++)
            temp = temp.next;

        if (temp == null || temp.next == null) {
            System.out.println("Invalid Position!");
            return;
        }

        temp.next = temp.next.next;
    }

    // Search in list
    public static void search(int key) {
        Node temp = head;
        int pos = 1;

        while (temp != null) {
            if (temp.data == key) {
                System.out.println("Found at position: " + pos);
                return;
            }
            temp = temp.next;
            pos++;
        }

        System.out.println("Element not found!");
    }

    // Display list
    public static void display() {
        Node temp = head;
        System.out.print("List: ");

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("NULL");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice, value, pos;

        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Insert at Start");
            System.out.println("2. Insert at End");
            System.out.println("3. Insert at Position");
            System.out.println("4. Delete Start");
            System.out.println("5. Delete End");
            System.out.println("6. Delete at Position");
            System.out.println("7. Search");
            System.out.println("8. Display");
            System.out.println("9. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter value: ");
                    value = sc.nextInt();
                    insertStart(value);
                    break;

                case 2:
                    System.out.print("Enter value: ");
                    value = sc.nextInt();
                    insertEnd(value);
                    break;

                case 3:
                    System.out.print("Enter value: ");
                    value = sc.nextInt();
                    System.out.print("Enter position: ");
                    pos = sc.nextInt();
                    insertAtPos(value, pos);
                    break;

                case 4:
                    deleteStart();
                    break;

                case 5:
                    deleteEnd();
                    break;

                case 6:
                    System.out.print("Enter position to delete: ");
                    pos = sc.nextInt();
                    deleteAtPos(pos);
                    break;

                case 7:
                    System.out.print("Enter value to search: ");
                    value = sc.nextInt();
                    search(value);
                    break;

                case 8:
                    display();
                    break;

                case 9:
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}
