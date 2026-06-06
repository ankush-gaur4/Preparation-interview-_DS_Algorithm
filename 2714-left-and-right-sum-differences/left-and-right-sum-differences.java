class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;

        int sum = 0;
        for (int num : nums) sum += num;

        int[] result = new int[n];
        int leftSum = 0;

        for (int i = 0; i < n; i++) {
            sum -= nums[i];

            result[i] = Math.abs(leftSum - sum);

            leftSum += nums[i];
        }

        return result;
    }
}