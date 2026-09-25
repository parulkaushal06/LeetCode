class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length ; 
        Stack<Integer> st = new Stack<>();
        int[] answers = new int[n];
        for(int i=0; i<n; i++){
            answers[i] = -1;
        }
        for(int i=0; i<2*n; i++){
            int idx = i%n;
            while(!st.isEmpty() && nums[idx]>nums[st.peek()]){
                int prev = st.pop();
                answers[prev] = nums[idx]; 
            }
            if(i<n){
                st.push(idx);
            }
        }
        return answers ;
    }
}