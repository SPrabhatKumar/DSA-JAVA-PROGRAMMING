import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CyclicSort448LeetCodeGoogleProblem {
    public static void main(String[] args) {
        int arr[]={4,3,2,7,8,2,3,1};
        cyclicSort(arr);
        List<Integer> list=new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=i+1){
                list.add(i+1);
            }
        }
        System.out.println(list);
        System.out.println(Arrays.toString(arr));
    }
    public static void cyclicSort(int nums[]){
        // int i=0;
        // while(i<arr.length){
        //     // int corridx=arr[i]-1;
        //     // if(arr[i]==corridx){
        //     //     i++;
        //     // }
        //     // else{
        //     //     int temp=arr[corridx];
        //     //     arr[corridx]=arr[i];
        //     //     arr[i]=temp;
        //     // }
        // }
        int i=0;
        while(i<nums.length){
            int correctidx=nums[i]-1;
            if(nums[correctidx]==nums[i]){
                i++;
            }else{
                int temp=nums[correctidx];
                nums[correctidx]=nums[i];
                nums[i]=temp;
            }
        }
    }
    
}
