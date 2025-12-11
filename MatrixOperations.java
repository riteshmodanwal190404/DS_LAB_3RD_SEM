import java.util.Scanner;

public class MatrixOperations {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows of matrix: ");
        int r = sc.nextInt();

        System.out.print("Enter columns of matrix: ");
        int c = sc.nextInt();

        int[][] A = new int[r][c];
        int[][] B = new int[r][c];

        System.out.println("Enter Matrix A:");
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                A[i][j] = sc.nextInt();

        System.out.println("Enter Matrix B:");
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                B[i][j] = sc.nextInt();

        // Matrix Addition
        int[][] add = new int[r][c];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                add[i][j] = A[i][j] + B[i][j];

        // Matrix Multiplication (Only valid if r == c)
        int[][] mul = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                mul[i][j] = 0;
                for (int k = 0; k < c; k++) {
                    mul[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        System.out.println("\nMatrix Addition:");
        for (int[] row : add) {
            for (int val : row)
                System.out.print(val + " ");
            System.out.println();
        }

        System.out.println("\nMatrix Multiplication:");
        for (int[] row : mul) {
            for (int val : row)
                System.out.print(val + " ");
            System.out.println();
        }
    }
}
