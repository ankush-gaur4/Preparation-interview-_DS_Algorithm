class Solution {
    public String stoneGameIII(int[] stoneValue) {
        int n = stoneValue.length;

        // dp[i] = Maximum score difference (Alice - Bob) starting from index i
        int[] dp = new int[n + 1];

        for (int i = n - 1; i >= 0; i--) {

            // Take 1 stone
            dp[i] = stoneValue[i] - dp[i + 1];

            // Take 2 stones
            if (i + 2 <= n) {
                dp[i] = Math.max(dp[i],
                        stoneValue[i] + stoneValue[i + 1] - dp[i + 2]);
            }

            // Take 3 stones
            if (i + 3 <= n) {
                dp[i] = Math.max(dp[i],
                        stoneValue[i] + stoneValue[i + 1] + stoneValue[i + 2] - dp[i + 3]);
            }
        }

        int diff = dp[0];

        if (diff > 0) {
            return "Alice";
        } else if (diff < 0) {
            return "Bob";
        } else {
            return "Tie";
        }
    }
}