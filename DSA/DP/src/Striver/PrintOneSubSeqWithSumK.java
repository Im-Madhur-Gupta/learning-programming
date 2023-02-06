package Striver;

import java.util.ArrayList;

public class PrintOneSubSeqWithSumK {
    public static void main(String[] args) {
        int mainSeq[] = { 1, 2, 1 };
        int n = mainSeq.length;
        int reqSum = 2;

        ArrayList<Integer> subSeq = new ArrayList<>(n); // non-primitive -> passed by ref

        printSubSeqWithSumK(mainSeq, n, reqSum, subSeq, 0, 0);
    }

    static boolean printSubSeqWithSumK(int mainSeq[], int n, int reqSum, ArrayList<Integer> subSeq, int sum, int i) {
        // base case
        if (sum == reqSum) {
            for (int j : subSeq) {
                System.out.print(j);
            }
            System.out.println();
            return true;
        }
        if (i >= n) {
            return false;
        }

        // pick curr element in the subseq & go through all such subseqs
        subSeq.add(mainSeq[i]);
        if (printSubSeqWithSumK(mainSeq, n, reqSum, subSeq, sum + mainSeq[i], i + 1))
            return true;

        // not pick curr element in the subseq & go through all such subseqs
        subSeq.remove(subSeq.size() - 1);
        if (printSubSeqWithSumK(mainSeq, n, reqSum, subSeq, sum, i + 1))
            return true;

        return false;
    }
}
