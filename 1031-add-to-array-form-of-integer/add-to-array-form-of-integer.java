class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> ans = new ArrayList<>();

        int i = num.length - 1;
        int carry = 0;

        while (i >= 0 || k > 0 || carry > 0) {

            int digitK = k % 10;
            k = k / 10;

            int digitNum = 0;
            if (i >= 0) {
                digitNum = num[i];
                i--;
            }

            int sum = digitNum + digitK + carry;

            ans.add(sum % 10);
            carry = sum / 10;
        }

        Collections.reverse(ans);

        return ans;
    }
}