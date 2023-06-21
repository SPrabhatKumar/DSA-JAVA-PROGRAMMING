import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int []arr={5,3,2,1,4};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
        
    }
    public static void cyclicSort(int arr[]){
        int i=0;
        while(i<arr.length){
            int correctidx=arr[i]-1;
            if(i!=correctidx){
                int temp=arr[i];
                arr[i]=arr[correctidx];
                arr[correctidx]=temp;
            }
            else{
                i++;
            }
        }
    }
}
