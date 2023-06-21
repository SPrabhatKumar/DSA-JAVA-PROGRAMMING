import java.util.Scanner;

public class StrictlySortlyIncreasing {
    public static boolean br = false;

    public static void Sorted(int arr[], int index) {
        if (index < arr.length-1) {
            if (arr[index] < arr[index + 1]) {
                br = true;
                Sorted(arr, index + 1);
            } else {
                br = false;
                return;
            }
        }
        

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Array Size:");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        Sorted(arr, 0);
        if(br==true){
            System.out.println("Array is Strictly Sorted ");
        }
        else{
            System.out.println("Array is not Strictly Sorted ");
        }
    }
}
