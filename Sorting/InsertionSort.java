import java.util.Arrays;
import java.util.Scanner;
// Insertion Sort Time Complexoty is O(n^2) for worst Case and for sort Arrays it is o(n)
// it is a stable Algorithm and used for lesser value for n 

public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = { 65, 4, 32, 4, 2, 1, 10 };
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else {
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}
