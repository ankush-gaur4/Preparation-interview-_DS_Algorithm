//Approach (Linear Scan - find max and min)
//T.C : O(n)
//S.C : O(1)

class Solution {
    public long maxTotalValue(int[] nums, int k) {
        int n = nums.length;

        int maxEl = Integer.MIN_VALUE;
        int minEl = Integer.MAX_VALUE;

        for(int num : nums){
            maxEl = Math.max(maxEl, num);
            minEl = Math.min(minEl, num);
        }
        return (long)(maxEl - minEl)*k;
    }
}