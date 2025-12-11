import java.util.Scanner;

public class FibonacciProgram {

    // Recursive method to print Fibonacci
    static int fibRec(int n) {
        if (n <= 1)
            return n;
        return fibRec(n - 1) + fibRec(n - 2);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many terms: ");
        int n = sc.nextInt();

        // Iterative Fibonacci
        System.out.println("Fibonacci using Iteration:");
        int a = 0, b = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }

        // Recursive Fibonacci
        System.out.println("\n\nFibonacci using Recursion:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibRec(i) + " ");
        }
    }
}
