class Solution {
    public List<List<Integer>> subsetsDup(List<List<Integer>>list,int i, List<Integer> li,int[] nums) {
        if(i>=nums.length){
            list.add(new ArrayList<>(li));
            return list ;
        }
        li.add(nums[i]);
        subsetsDup(list, i+1, li, nums);
        li.remove(li.size()-1);
        subsetsDup(list, i+1, li, nums);
        return list;
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        subsetsDup(list, 0, new ArrayList<>(), nums);
        Set<List<Integer>> result = new LinkedHashSet<>(list);
        return new ArrayList<>(result);
    }
}