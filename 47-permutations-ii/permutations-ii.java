class Solution {

    public void answer(
            int[] nums,
            List<List<Integer>> list,
            List<Integer> li,
            boolean[] used) {

        // Base case
        if (li.size() == nums.length) {
            list.add(new ArrayList<>(li));
            return;
        }

        // Try every index
        for (int i = 0; i < nums.length; i++) {

            // This INDEX is already used
            if (used[i]) {
                continue;
            }

            // Duplicate skip
            if (i > 0 &&
                nums[i] == nums[i - 1] &&
                !used[i - 1]) {
                continue;
            }

            // TAKE
            li.add(nums[i]);
            used[i] = true;

            // RECURSION
            answer(nums, list, li, used);

            // BACKTRACK
            li.remove(li.size() - 1);
            used[i] = false;
        }
    }

    public List<List<Integer>> permuteUnique(int[] nums) {

        Arrays.sort(nums);

        List<List<Integer>> list = new ArrayList<>();

        boolean[] used = new boolean[nums.length];

        answer(nums, list, new ArrayList<>(), used);

        return list;
    }
}