package Striver;

// HOUSE ROBBER 2 -> Now the array is not linear, rather its connected in circle
// 0th house is neighbor of n-1th house
// https://leetcode.com/problems/house-robber-ii/
public class HouseRobber2_Recur {
    public static void main(String[] args) {
        int mainSeq[] = { 1, 2, 3 };
        int n = mainSeq.length;

        System.out.println(Math.max(houseRobber2(mainSeq, 0, n - 2), houseRobber2(mainSeq, 1, n - 1)));
    }

    // assume elements in the array are non-neg integers
    static int houseRobber2(int mainSeq[], int minIndx, int i) {
        if (i == minIndx)
            return mainSeq[minIndx];
        if (i < minIndx)
            return 0;

        int pickSum = mainSeq[i]
                + houseRobber2(mainSeq, minIndx, i - 2);
        int notPickSum = houseRobber2(mainSeq, minIndx, i - 1);

        return Math.max(pickSum, notPickSum);
    }
}
