class Solution {
    public int maxProduct(int[] nums) {
        int currMax = nums[0];
        int currMin = nums[0];
        int maxProduct = nums[0];
        for(int i=1; i<nums.length; i++){
            int oldMin = currMin ;
            int oldMax = currMax ;
            currMax = Math.max(nums[i], Math.max(nums[i]*oldMin, nums[i]*oldMax));
            currMin = Math.min(nums[i], Math.min(nums[i]*oldMin, nums[i]*oldMax));
            maxProduct = Math.max(maxProduct, currMax);
        }
        return maxProduct ;
    }
}