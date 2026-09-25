class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st = new Stack<>();
        int n = nums1.length;
        int[] answers = new int[n];
        for(int i=0; i<n; i++){
            answers[i] = -1;
        }
        for(int i=0; i<nums2.length; i++){
            while(!st.isEmpty() && nums2[i]>nums2[st.peek()]){
                int prev = st.pop();
                for(int j=0; j<n; j++){
                    if(nums1[j]==nums2[prev]){
                        answers[j] = nums2[i];
                        break;
                    }
                }
            }
            st.push(i);
        }
        return answers ;
    }
}