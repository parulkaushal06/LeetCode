class Solution {
    public List<List<Integer>> printSubsets(int i, int[]nums, List<Integer>li, List<List<Integer>> list){
        if(i==nums.length){
            list.add(new ArrayList<>(li));
            return list;
        }
        li.add(nums[i]);
        printSubsets(i+1, nums, li, list);
        li.remove(li.size()-1);
        printSubsets(i+1, nums, li, list);
        return list ;
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>list = new ArrayList<>();
        printSubsets(0, nums, new ArrayList<>(), list);
        return list ;
    }
}