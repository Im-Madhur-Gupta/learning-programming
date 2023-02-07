package Striver;

// HOUSE ROBBER 2 -> Now the array is not linear, rather its connected in circle
// 0th house is neighbor of n-1th house
// https://leetcode.com/problems/house-robber-ii/
public class HouseRobber2_Memo {
    public static void main(String[] args) {
        int nums[] = { 1, 2, 3 };
        int n = nums.length;

        int dp[] = new int[n];
        for (int i = 0; i < n; i++) {
            dp[i] = -1;
        }

        int maxSumWithFirst = houseRobber2(nums, 0, n - 2, dp);

        for (int i = 0; i < n; i++) {
            dp[i] = -1;
        }

        int maxSumWithoutFirst = houseRobber2(nums, 1, n - 1, dp);

        System.out.println(Math.max(maxSumWithFirst, maxSumWithoutFirst));
    }

    // assume elements in the array are non-neg integers
    static int houseRobber2(int nums[], int minIndx, int i, int[] dp) {
        if (i == minIndx)
            return nums[minIndx];
        if (i < minIndx)
            return 0;

        if (dp[i] != -1)
            return dp[i];

        int pickSum = nums[i]
                + houseRobber2(nums, minIndx, i - 2, dp);
        int notPickSum = houseRobber2(nums, minIndx, i - 1, dp);

        return dp[i] = Math.max(pickSum, notPickSum);
    }
}
