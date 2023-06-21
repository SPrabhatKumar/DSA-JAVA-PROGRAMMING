public class QuickSort {
    public static int partition(int arr[],int low,int high){
        int pivotele=arr[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<=pivotele){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;
        int temp=arr[i];
        arr[i]=pivotele;
        pivotele=temp;
        return i;
    }
    public static void quickSort(int arr[],int low,int high){
        if(low<high){
            int pidx=partition(arr,low,high);
            quickSort(arr, low, pidx-1);
            quickSort(arr, pidx+1, high);

        }
    }
    public static void main(String[] args) {
        int arr[]={3,5,7,43,32,12};
        int n=arr.length-1;
        quickSort(arr, 0,n);
        for(int i=0;i<=n;i++){
            System.out.print(arr[i]+" ");
        }


    }
}
