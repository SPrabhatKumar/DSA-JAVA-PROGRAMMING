public class LinearSearchRecursion {
    public static void main(String[] args) {
        int arr[]={2,4,6,32,1,3,43};
        System.out.println(linearSearcharr(arr, 5, 0));
        System.out.println(findIndex(arr, 43, 0));
    }
    public static boolean linearSearcharr(int arr[],int target,int index){
        if(index==arr.length){
            return false;
        }
        return arr[index]==target || linearSearcharr(arr, target, index+1);
    }
    public static int findIndex(int arr[],int target,int index){
        if(index==arr.length){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        else{
            return findIndex(arr, target, index+1);
        }
    }
}
