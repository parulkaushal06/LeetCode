class Solution {
    public List<List<Integer>> printsubsets(List<List<Integer>>list, List<Integer>li,int i,int[] nums) {
        if(i>=nums.length){
            list.add(new ArrayList<>(li));
            return list;
        }
        li.add(nums[i]);
        printsubsets(list,li,i+1,nums);
        li.remove(li.size()-1);
        printsubsets(list,li,i+1,nums);
        return list;
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>list = new ArrayList<>();
        return printsubsets(list, new ArrayList<>(), 0, nums);
    }
}