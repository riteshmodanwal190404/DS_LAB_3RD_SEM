import java.util.Scanner;

public class PrintNto1 {

    static void printRec(int n) {
        if (n == 0)
            return;

        System.out.println(n);
        printRec(n - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        printRec(n);
    }
}
