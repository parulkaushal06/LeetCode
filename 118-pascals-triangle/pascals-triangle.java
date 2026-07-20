class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0; i<numRows; i++){
            List<Integer> row = new ArrayList<>();
            int size = i+1;
            for(int j=0; j<size; j++){
                if(j==0 || j==size-1){
                    row.add(1);
                }
                else {
                    int val = ans.get(i-1).get(j-1) + ans.get(i-1).get(j);
                    row.add(val);
                }
            }
            ans.add(row);
        }
        return ans ;
    }
}