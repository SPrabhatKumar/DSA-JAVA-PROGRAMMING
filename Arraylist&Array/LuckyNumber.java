import java.util.ArrayList;
import java.util.List;

public class LuckyNumber {
    public static void main(String[] args) {
        // [[1,10,4,2],[9,3,8,7],[15,16,17,12]]
        // [[3,7,8],[9,11,13],[15,16,17]]
        int arr[][]={{3,7,8},{9,11,13},{15,16,17}};
        List<Integer> list=new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int minimum=Integer.MAX_VALUE;
            int temp=0;
            for (int j = 0; j < arr[0].length; j++) {
                 if(arr[i][j]<minimum){
                    minimum=arr[i][j];
                    temp=j;
                 }
            }
            if(isGreater(arr,temp,minimum)){
                list.add(minimum);
            }
        }
        System.out.println(list);

    }
    private static boolean isGreater(int arr[][],int col,int minimum){
        boolean res=true;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i][col]>minimum){
                res=false;
            }
        }
        return res;
    }
}
