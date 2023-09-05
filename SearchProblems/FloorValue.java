public class FloorValue {
    public static void main(String[] args) {
        int arr[]={2,4,5,7,8,9,13,15,17,19,20};
        int res=findFloorVal(arr,14);
        System.out.println("The Floor Value is:"+res);
    }
    public static int findFloorVal(int arr[],int target){
        int start=0;
        int end=arr.length-1;
        while (start<=end) {
            int middle=start+(end-start)/2;
            if(arr[middle]>target){
                end=middle-1;
            }
            else{
                start=middle+1;
            }
        }
        return arr[end];
    }
}
