class Solution {
    public boolean hasDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            int k=nums[i];
            if(k==nums[i+1]){
                return true;
            }
        }
        return false;
    }
}