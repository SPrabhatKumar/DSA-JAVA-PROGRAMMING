public class SortedArray {
    public static void main(String[] args) {
        int arr[]={1,2,2,3,4,5,6};
        System.out.println(sorted(arr));
    }
    public static boolean sorted(int arr[]){
        return helper(arr,1);
    }
    private static boolean helper(int[] arr, int i) {
        if(i==arr.length){
            return true;
        }
        return arr[i]>=arr[i-1] && helper(arr, i+1);
    }
}
