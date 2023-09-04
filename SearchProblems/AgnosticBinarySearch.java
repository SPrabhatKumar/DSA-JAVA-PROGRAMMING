public class AgnosticBinarySearch{
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        System.out.println("Increasing Order Agnostic Binary Search Index:"+AgnosticBS(arr, 3));
        int arr2[]={10,9,8,7,6,5,4,3,2,1};
        System.out.println("Agnostic Decreasing Binary Search Index: "+AgnosticBS(arr2, 1));
        
    }
    public static int AgnosticBS(int arr[],int target){
        int start=0;
        int end=arr.length-1;
        boolean isIncrease=arr[start]<arr[end];
        while(start<=end){
            int middle=start+(end-start)/2;
            if(arr[middle]==target){
                return middle;
            }
            if(isIncrease){
                if(arr[middle]<target){
                    start=middle+1;
                }
                else{
                    end=middle-1;
                }
            }
            else{
                if(arr[middle]<target){
                    end=middle-1;
                }
                else{
                    start=middle+1;
                }
            }
        }
        return -1;

    }
}