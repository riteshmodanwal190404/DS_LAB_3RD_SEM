import java.util.Scanner;

public class FirstLastOccurrence {

    static int firstOccurrence(int[] arr, int key) {
        int start = 0, end = arr.length - 1, ans = -1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == key) {
                ans = mid;
                end = mid - 1; // search left side
            } 
            else if (arr[mid] < key) {
                start = mid + 1;
            } 
            else {
                end = mid - 1;
            }
        }
        return ans;
    }

    static int lastOccurrence(int[] arr, int key) {
        int start = 0, end = arr.length - 1, ans = -1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == key) {
                ans = mid;
                start = mid + 1; // search right side
            } 
            else if (arr[mid] < key) {
                start = mid + 1;
            } 
            else {
                end = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter sorted array elements:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.print("Enter element x: ");
        int x = sc.nextInt();

        int first = firstOccurrence(arr, x);
        int last = lastOccurrence(arr, x);

        System.out.println("First Occurrence: " + first);
        System.out.println("Last Occurrence: " + last);
    }
}
