public class MergeSort {
    public static void conquer(int arr[],int st,int mid,int end){
        int mergarr[]=new int[end-st+1];
        int idx1=st;
        int idx2=mid+1;
        int x=0;
        while(idx1<=mid &&idx2<=end){
            if (arr[idx1]<=arr[idx2]) {
                mergarr[x++]=arr[idx1++];
            }
            else{
                mergarr[x++]=arr[idx2++];
            }
        }
        while(idx1<=mid){
            mergarr[x++]=arr[idx1++];
        }
        while(idx2<=end){
            mergarr[x++]=arr[idx2++];
        }
        for(int i=0,j=st;i<mergarr.length;i++,j++){
            arr[j]=mergarr[i];
        }


    }
    public static void divide(int []arr,int st,int end){
        if(st>=end){
            return;
        }
        int mid=st+(end-st)/2;
        divide(arr, st, mid);
        divide(arr, mid+1, end);
        conquer(arr,st,mid,end);
    }
    public static void main(String[] args) {
        int arr[]=new int[]{2,33,44,8,65,6};
        divide(arr, 0, arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
