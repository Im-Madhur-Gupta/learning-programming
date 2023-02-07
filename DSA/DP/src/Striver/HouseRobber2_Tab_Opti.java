package Striver;

// HOUSE ROBBER 2 -> Now the array is not linear, rather its connected in circle
// 0th house is neighbor of n-1th house
// https://leetcode.com/problems/house-robber-ii/
public class HouseRobber2_Tab_Opti {
    public static void main(String[] args) {
        int nums[] = { 1, 2, 3 };
        int n = nums.length;

        if(n==1) System.out.println(nums[0]);

        int maxSumWithFirst = houseRobber2(nums, 0, n - 2);

        int maxSumWithoutFirst = houseRobber2(nums, 1, n - 1);

        System.out.println(Math.max(maxSumWithFirst, maxSumWithoutFirst));
    }

    // assume elements in the array are non-neg integers
    static int houseRobber2(int nums[], int minIndx, int maxIndx) {
        int secPrev = 0, prev = nums[minIndx];

        for (int i = minIndx + 1; i <= maxIndx; i++) {
            int pickSum = nums[i] + secPrev;
            int notPickSum = prev;

            secPrev = prev;
            prev = Math.max(pickSum, notPickSum);
        }

        return prev;
    }
}
