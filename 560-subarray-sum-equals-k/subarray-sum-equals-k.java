class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0 ;
        int count = 0 ;
        map.put(0,1);
        for(int i=0; i<nums.length;i++){
            sum += nums[i];
            int needed = sum - k;
            if(map.containsKey(needed)){
                count+= map.get(needed);
            }
            if(map.containsKey(sum)){
                map.put(sum, map.get(sum)+1);
            }
            else{
                map.put(sum,1);
            }
        }
        return count ;
    }
}