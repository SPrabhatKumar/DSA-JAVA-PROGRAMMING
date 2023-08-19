class Solution {
    public int arraySign(int[] nums) {
        int countnegative=0;
        boolean zeropresent=false;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                countnegative++;
            }
            if(nums[i]==0){
                zeropresent=true;
                break;
            }
        }
        if(countnegative%2==0 && zeropresent==false){
            return 1;
        }
        else if(countnegative%2==1 && zeropresent==false){
            return 1;
        }
        else{
            return 0;
        }
    }
}