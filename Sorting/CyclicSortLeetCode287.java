// https://leetcode.com/problems/find-the-duplicate-number/description/

import java.util.Arrays;

public class CyclicSortLeetCode287 {
    public static void main(String[] args) {
        int arr[]={3,1,3,4,2};
        cyclicSort(arr);
        // Reapeated Number will be at arr[arr.length-1] after sorting remaining Elements 
        System.out.println(Arrays.toString(arr));
    }
    public static void cyclicSort(int arr[]){
        int i=0;
        while (i<arr.length) {
            int coridx=arr[i]-1;
            if(arr[coridx]==arr[i]){
                i++;
            }
            else{
                int temp=arr[coridx];
                arr[coridx]=arr[i];
                arr[i]=temp;
            }
        }
    }
    
}