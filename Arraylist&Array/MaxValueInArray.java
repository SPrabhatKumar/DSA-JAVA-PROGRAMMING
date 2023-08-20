public class MaxValueInArray {
    public static void main(String[] args) {
        int[] arr={104,54,6,32,54,32};
        System.out.println(maxElement(arr));
        //Finding Max Value in a Range
        System.out.println(maxInRange(arr,1,4));
    }
    public static int maxElement(int[] array){
        // int maxValue=Integer.MIN_VALUE;  if array is Empty than it will useful
        int maxValue=array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i]>maxValue){
                maxValue=array[i];
            }
        }
        return maxValue;
    }
    public static int maxInRange(int arr[],int start,int end){
        int maxValue=arr[ start];
        // There may be end Cases like 
        // start>end =>return -1 or arr==null =>return -1 etc
        for (int i = start; i <= end; i++) {
            if(arr[i]>maxValue){
                maxValue=arr[i];
            }
        }
        return maxValue;
    }
}
