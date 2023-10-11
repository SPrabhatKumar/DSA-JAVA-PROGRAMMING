import java.util.Arrays;

public class MergeSortKunal {
    public static void main(String[] args) {
        int arr[]={4,32,5,2,2,1};
        arr=mergeDivide(arr);
        double b=(double)(20)/3;
        System.out.println(b);
        System.out.println(Arrays.toString(arr));
        
    }
    public static int[] mergeDivide(int arr[]){
        if(arr.length==1){
            return arr;
        }
        int mid=arr.length/2;
        int first[]=mergeDivide(Arrays.copyOfRange(arr, 0, mid));
        int second[]=mergeDivide(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(first,second);
    }
    private static int[] merge(int[] first,int []second) {
        int arr[]=new int[first.length+second.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<first.length && j<second.length){
            if(first[i]<second[j]){
                arr[k]=first[i];
                i++;
            }else{
                arr[k]=second[j];
                j++;
            }
            k++;
        }
        while(i<first.length){
            arr[k]=first[i];
            i++;
            k++;
        }
        while(j<second.length){
            arr[k]=second[j];
            j++;
            k++;
        }
        return arr;
    }
}
