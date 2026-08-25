class Solution {
    public List<List<Integer>> Sum(int[] nums, int target, int sum, List<List<Integer>>list, List<Integer>li, int i) {
        if(i==nums.length){
            if(sum == target){
                list.add(new ArrayList<>(li)); 
            }
            return list ;
        }
        if(sum > target){
            return list;
        }
            li.add(nums[i]);
            sum += nums[i];
            Sum(nums,target, sum,list,li, i);
            li.remove(li.size()-1);
            sum -= nums[i];
            Sum(nums,target, sum,list,li, i+1);
            return list ;
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>list = new ArrayList<>();
        return Sum(candidates, target, 0,list, new ArrayList<>(),0);
    }
}