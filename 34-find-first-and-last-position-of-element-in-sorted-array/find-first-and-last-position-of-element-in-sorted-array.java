class Solution {
    public int[] searchRange(int[] nums, int target) {
        int [] ans = {-1, -1};
        int n = nums.length;
        int s = 0;
        int e = n-1;
        while(s<=e){
            int m = s+((e-s)/2);
            if(target<nums[m]){
                e = m-1;
            }
            else if(target>nums[m]){
                s = m+1;
            }
            else if(target==nums[m]){
                ans[0] = m;
                e = m-1;    
            }    
        }
        s = 0;
        e = n-1;
        while(s<=e){
            int m = s+((e-s)/2);
            if(target<nums[m]){
                e = m-1;
            }
            else if(target>nums[m]){
                s = m+1;
            }
            else if(target==nums[m]){
                ans[1] = m;
                s = m+1;
            }    
        }
        return ans ;
    }
}