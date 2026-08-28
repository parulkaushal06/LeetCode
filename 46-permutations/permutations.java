class Solution {
    public List<List<Integer>> answer(int[] nums,List<List<Integer>> list, List<Integer> li) {
        if(li.size()==nums.length){
            list.add(new ArrayList<>(li));
            return list ;
        }
        for(int i=0; i<nums.length; i++){
            if(li.contains(nums[i])){
                continue;
            }
            li.add(nums[i]);
            answer(nums,list, li);
            li.remove(li.size()-1);
        }
        return list;
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        return answer(nums, list, new ArrayList<>());
    }
}