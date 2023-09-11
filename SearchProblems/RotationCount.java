public class RotationCount {
    public static void main(String[] args) {
        int arr[] = { 5, 7, 9, 1, 2, 3, 4 };
        System.out.println(rotationCount(arr));

    }

    public static int rotationCount(int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (end < arr.length - 1 && arr[mid] > arr[mid + 1]) {
                return mid + 1;
            }
            if (start > 0 && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[mid] > arr[start] && arr[mid]>arr[end]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
