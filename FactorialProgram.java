import java.util.Scanner;

public class FactorialProgram {

    // Recursive method
    static long factorialRec(int n) {
        if (n == 0 || n == 1)
            return 1;
        return n * factorialRec(n - 1);
    }

    // Iterative method
    static long factorialIter(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Factorial using Iteration: " + factorialIter(n));
        System.out.println("Factorial using Recursion: " + factorialRec(n));
    }
}
