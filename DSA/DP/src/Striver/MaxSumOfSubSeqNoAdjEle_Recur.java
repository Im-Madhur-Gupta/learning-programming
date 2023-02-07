package Striver;

// HOUSE ROBBER 1

public class MaxSumOfSubSeqNoAdjEle_Recur {
    public static void main(String[] args) {
        int mainSeq[] = { 2, 1, 4, 9 };
        System.out.println(maxSumOfSubSeqNoAdjEle(mainSeq, mainSeq.length, 0));
    }

    // assume elements in the array are non-neg integers
    static int maxSumOfSubSeqNoAdjEle(int mainSeq[], int size, int i) {
        if (i >= size)
            return 0;
        if (i == size - 1)
            return mainSeq[size - 1];

        // pick the current element in the sub sequence
        int pickSum = mainSeq[i] + maxSumOfSubSeqNoAdjEle(mainSeq, size, i + 2);
        // not pick the current element in the sub sequence
        int notPickSum = maxSumOfSubSeqNoAdjEle(mainSeq, size, i + 1);

        return Math.max(pickSum, notPickSum);
    }
}
