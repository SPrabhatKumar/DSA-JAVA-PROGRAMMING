import java.util.Arrays;

public class SelectionSort2 {
    public static void main(String[] args) {
        int arr[]={4,6,2,7,34,1,-43,3,0,3,5,4};
        for (int start = 0; start < arr.length; start++) {
            int end=arr.length-start-1;
            int maxindex=maxElement(arr,0,end);
            swapElement(arr, maxindex, end);

        }
        System.out.println(Arrays.toString(arr));
    }
    public static int maxElement(int arr[],int start,int end){
        int max=start;
        for (int i = start; i <= end; i++) {
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        // System.out.println(max);
        return max;
    }
    public static void swapElement(int arr[],int maxele,int end){
        int temp=arr[maxele];
        arr[maxele]=arr[end];
        arr[end]=temp;
    }
    
}
