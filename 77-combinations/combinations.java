class Solution {
    public void combination(int n, int k, int start,List<List<Integer>> list, List<Integer> li) {
        if(li.size() == k){
            list.add(new ArrayList<>(li));
            return ;
        }
        for(int i=start; i<=n; i++){
            li.add(i);
            combination(n, k, i+1,list, li);
            li.remove(li.size()-1);
        }
    }
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> list = new ArrayList<>();
        combination(n,k,1,list, new ArrayList<>());
        return list ;
    }
}