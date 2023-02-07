package Striver;

public class MaxSumOfSubSeqNoAdjEle_Tab_Opti {
    public static void main(String[] args) {
        int mainSeq[] = { 2, 1, 4, 9 };
        int n = mainSeq.length;

        int secPrev = 0, prev = mainSeq[0];

        // assume elements in the array are non-neg integers
        for (int i = 1; i < n; i++) {
            int pickSum = mainSeq[i] + secPrev;
            int notPickSum = prev;

            secPrev = prev;
            prev = Math.max(pickSum, notPickSum);
        }

        System.out.println(prev);
    }
}
