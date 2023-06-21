import java.util.Scanner;
// Insertion Sort Time Complexoty 

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Array Size :");
        int size = sc.nextByte();
        int arr[] = new int[size];
        System.out.print("\n Enter The Array Element :");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 & current < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;

        }
        for (int i = 0; i < size; i++) {
            System.out.print(" " + arr[i]);
        }

    }
}
