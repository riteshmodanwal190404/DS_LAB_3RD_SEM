import java.util.Scanner;

public class ArrayInsertDelete {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = {10, 20, 30, 40, 50};
        int n = arr.length;

        System.out.println("Original Array:");
        for (int x : arr)
            System.out.print(x + " ");

        // INSERTION
        System.out.print("\n\nEnter element to insert: ");
        int ele = sc.nextInt();

        System.out.print("Enter position (0 to " + n + "): ");
        int pos = sc.nextInt();

        int[] newArr = new int[n + 1];

        for (int i = 0; i < pos; i++)
            newArr[i] = arr[i];

        newArr[pos] = ele;

        for (int i = pos; i < n; i++)
            newArr[i + 1] = arr[i];

        System.out.println("\nArray After Insertion:");
        for (int x : newArr)
            System.out.print(x + " ");

        // DELETION
        System.out.print("\n\nEnter position to delete (0 to " + n + "): ");
        int delPos = sc.nextInt();

        int[] delArr = new int[newArr.length - 1];

        for (int i = 0, j = 0; i < newArr.length; i++) {
            if (i != delPos) {
                delArr[j++] = newArr[i];
            }
        }

        System.out.println("\nArray After Deletion:");
        for (int x : delArr)
            System.out.print(x + " ");
    }
}
