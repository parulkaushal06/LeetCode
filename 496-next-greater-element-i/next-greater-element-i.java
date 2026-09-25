import java.util.*;

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        int[] answer = new int[nums1.length];

        // Initially all answers are -1
        Arrays.fill(answer, -1);

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < nums2.length; i++) {

            while (!st.isEmpty() && nums2[i] > nums2[st.peek()]) {

                int index = st.pop();

                // Find this value in nums1
                for (int j = 0; j < nums1.length; j++) {
                    if (nums1[j] == nums2[index]) {
                        answer[j] = nums2[i];
                        break;
                    }
                }
            }

            st.push(i);
        }

        return answer;
    }
}