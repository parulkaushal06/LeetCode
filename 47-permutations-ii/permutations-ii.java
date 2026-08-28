class Solution {
    public List<List<Integer>> answer(int[] nums, List<List<Integer>> list, List<Integer> li, boolean[] used){
        if(li.size()==nums.length){
            list.add(new ArrayList<>(li));
            return list ;
        }
        for(int i=0; i<nums.length; i++){
            if(used[i]){
                continue;
            }
            if(i > 0 && nums[i] == nums[i-1] && !used[i-1]){
                continue ;
            }
            li.add(nums[i]);
            used[i] = true ;
            answer(nums, list, li, used);
            li.remove(li.size()-1);
            used[i] = false ;
        }
        return list;
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        boolean [] used = new boolean[nums.length];
        return answer(nums, result, new ArrayList<>(), used);
    }
}