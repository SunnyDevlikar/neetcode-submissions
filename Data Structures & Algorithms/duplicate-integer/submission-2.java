class Solution {
    public boolean hasDuplicate(int[] nums) {
        int count =0;
        for(int i=0; i<nums.length; i++){
           for(int j=nums.length-1; j>i; j--){
            if(nums[j] == nums[i]){
                count++;
            }
           }
        }
        if(count !=0){
            return true;
        }
        return false;



    }
}