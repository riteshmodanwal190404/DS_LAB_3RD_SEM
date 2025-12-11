import java.util.Scanner;

public class LinearSearch2D {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int r = sc.nextInt();

        System.out.print("Enter columns: ");
        int c = sc.nextInt();

        int[][] arr = new int[r][c];

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                arr[i][j] = sc.nextInt();

        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {

                if (arr[i][j] == key) {
                    System.out.println("Element found at (" + i + ", " + j + ")");
                    found = true;
                    break;
                }

            }
            if (found) break; // stop outer loop also
        }

        if (!found)
            System.out.println("Element not found!");
    }
}
