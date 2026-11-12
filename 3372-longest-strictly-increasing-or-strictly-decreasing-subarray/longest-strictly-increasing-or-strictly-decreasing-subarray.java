class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int n = nums.length;
        int result = 0;

        for (int i = 0; i < n; i++) {
            int increasing = 1;
            int j = i + 1;
            while (j < n && nums[j] > nums[j - 1]) {
                increasing++;
                j++;
            }

            int decreasing = 1;
            j = i + 1;
            while (j < n && nums[j] < nums[j - 1]) {
                decreasing++;
                j++;
            }

            result = Math.max(result, Math.max(increasing, decreasing));
        }

        return result;
    }
}