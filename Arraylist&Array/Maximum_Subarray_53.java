/**
 * Maximum_Subarray_53
 */
// https://leetcode.com/problems/maximum-subarray/
public class Maximum_Subarray_53 {
    public static void main(String[] args) {
        int arr[]={-2,1,-3,4,-1,2,1,-5,4};
        int max=Integer.MIN_VALUE;
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
            max=Math.max(sum,max);
            if(sum<0){
                sum=0;
            }
        }
       
       System.out.println(max);
    }
            
}
// class Solution {
//     public int maxSubArray(int[] nums) {
//         int n = nums.length;
//         int max = Integer.MIN_VALUE, sum = 0;
        
//         for(int i=0;i<n;i++){
//             sum += nums[i];
//             max = Math.max(sum,max);
            
//             if(sum<0) sum = 0;
//         }
        
//         return max;
//     }
// }