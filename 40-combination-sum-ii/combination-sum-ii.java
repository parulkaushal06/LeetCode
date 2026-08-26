class Solution {
    public List<List<Integer>> Sum2(int[] candidates, int target, int sum , int i , List<List<Integer>> list, List<Integer> li) {
        if(i==candidates.length){
            if(sum == target){
                list.add(new ArrayList<>(li));
                
            }
            return list;
        }
        if(sum > target){
            return list ;
        }
        li.add(candidates[i]);
        sum += candidates[i];
        Sum2(candidates, target, sum ,i+1, list, li);
        li.remove(li.size()-1);
        sum -= candidates[i];
        
        // IMPORTANT: Skip all duplicate values
        while (i + 1 < candidates.length &&
               candidates[i] == candidates[i + 1]) {

            i++;
        }
        Sum2(candidates, target, sum, i+1, list, li);
        return list ;
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> list = new ArrayList<>();
        return Sum2(candidates, target, 0 , 0, list, new ArrayList<>());
        
        }
}