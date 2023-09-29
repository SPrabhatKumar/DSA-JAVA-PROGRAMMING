public class BinarySearchRecursion {
    public static void main(String[] args) {
        int arr[]={2,5,8,9,10,20,30};
        int res=bs(arr, 2, 0, arr.length-1);
        System.out.println(res);
    }
    public static int bs(int arr[],int target,int start,int end){
        int mid=start+(end-start)/2;
        if(start>end){
            return -1;
        }
        if(arr[mid]==target){
            return  mid;
        }
        if(arr[mid]>target){
            return bs(arr, target, start, mid-1);
        }   
        return bs(arr, target, mid+1, end);
    }
}
