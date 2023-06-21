import java.util.Arrays;

/**
 * InsertionSortMax
 */
public class InsertionSortMax {

    public static void main(String[] args) {
        int arr[]={5,3,4,1,2,2};
        selection(arr);
        System.out.println(Arrays.toString(arr));        
    }
    public static void selection(int arr[]){
        for(int i=0;i<arr.length;i++){
            int lastIdx=arr.length-i-1;
            int maxidx=getMaxIdx(arr,0,lastIdx);
            swapEle(arr,maxidx,lastIdx);
        }
    }
    private static void swapEle(int[] arr, int maxidx, int lastIdx) {
        int temp=arr[maxidx];
        arr[maxidx]=arr[lastIdx];
        arr[lastIdx]=temp;

    }
    public static int getMaxIdx(int arr[],int start,int last){
        int max=start;
        for(int i=start;i<last;i++){
            if(arr[i]>=arr[max]){
                max=i;
            }
        }
        return max;
    }
}