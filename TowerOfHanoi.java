import java.util.Scanner;

public class TowerOfHanoi {

    static void tower(int n, char source, char helper, char destination) {

        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }

        // Move n-1 disks from source → helper
        tower(n - 1, source, destination, helper);

        // Move nth disk from source → destination
        System.out.println("Move disk " + n + " from " + source + " to " + destination);

        // Move n-1 disks from helper → destination
        tower(n - 1, helper, source, destination);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of disks: ");
        int n = sc.nextInt();

        tower(n, 'A', 'B', 'C'); // A = Source, B = Helper, C = Destination
    }
}
