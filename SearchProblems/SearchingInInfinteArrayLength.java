public class SearchingInInfinteArrayLength {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,6,7,8,9,10,11,23,54,6768,77978,656454};
        int target=6;
        System.out.println(ans(arr, target));
        
    }
    public static int ans(int arr[],int target){
        int start=0;
        int end=1;
        while(target>arr[end]){
            int temp=end+1;  //it will the new start 
            end=end+(end-start+1)*2;
            start=temp;   
        }
        return BinarySearch(arr, start, end, target);
    }
    public static int BinarySearch(int arr[],int start ,int end,int target){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target>arr[mid]){
                start=mid+1;
            }
            else if(target<arr[mid]){
                end=mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
