class Solution {
    public int longestOnes(int[] nums, int k) {

        int left = 0;
        int zeros = 0;
        int maxLen = 0;

        for(int right = 0; right < nums.length; right++) {

            // 1. ADD
            if(nums[right] == 0) {
                zeros++;
            }

            // 2. WINDOW INVALID?
            while(zeros > k) {

                // 3. REMOVE
                if(nums[left] == 0) {
                    zeros--;
                }

                left++;
            }

            // 4. WINDOW IS VALID
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}