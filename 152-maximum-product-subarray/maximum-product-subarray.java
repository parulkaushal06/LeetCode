class Solution {
    public int maxProduct(int[] nums) {
        int currmin = nums[0];
        int currmax = nums[0];
        int maxProduct = nums[0];
        for(int i=1; i<nums.length; i++){
            int oldmin = currmin ;
            int oldmax = currmax ;
            currmax = Math.max(nums[i], Math.max(nums[i]*oldmin, nums[i]*oldmax));
            currmin = Math.min(nums[i], Math.min(nums[i]*oldmin, nums[i]*oldmax));
            maxProduct = Math.max(maxProduct, currmax);
        }
        return maxProduct;
    }
}