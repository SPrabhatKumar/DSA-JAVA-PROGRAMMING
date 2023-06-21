import java.util.Arrays;

public class SearchingIn2DArray {
    public static void main(String[] args) {
        int arr[][]={{1,2,3,4},{5,6,7,8},{34,54},{4,54,12,76,85},{1,2,3}};
        int target=85;
        int ans[]=search(arr, target);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] search(int [][]arr,int target){
        for(int row=0;row<arr.length;row++){
            for(int column=0;column<arr[row].length;column++){
                if(arr[row][column]==target){
                    return new int[]{row,column};
                }

            }
        }
        return new int[]{-1,-1};
    }
}
