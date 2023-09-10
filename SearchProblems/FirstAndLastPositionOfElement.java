public class FirstAndLastPositionOfElement {
    public static void main(String[] args) {
        int arr[]={5,7,7,8,8,10};
        int startind=binarySearchStartIdx(arr , 8);
        int endind=binarySearchEndIdx(arr,8);
        System.out.println(startind);
        System.out.println(endind);
        
    }
    public static int binarySearchStartIdx(int arr[],int target){
        int start=0;
        int end=arr.length-1;
        int res=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                res=mid;
                end=mid-1;
                continue;
            }
            if(arr[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
            // System.out.println(start);
            // System.out.println(end);
            // System.out.println(mid);
        }
        return res;
    }
    public static int binarySearchEndIdx(int arr[],int target){
        int start=0;
        int end=arr.length-1;
        int res=-1;
        while(start<=end){
            int middle=start+(end-start)/2;
            if(arr[middle]==target){
                res=middle;
                start=middle+1;
            }
            if(arr[middle]>target){
                end=middle-1;
            }
            else{
                start=middle+1;
            }
        }
        return res;
    }
}

