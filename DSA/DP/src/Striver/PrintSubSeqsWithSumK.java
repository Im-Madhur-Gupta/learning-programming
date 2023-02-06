package Striver;

import java.util.ArrayList;

public class PrintSubSeqsWithSumK {
    public static void main(String[] args) {
        int mainSeq[] = { 1, 2, 1 };
        int n = mainSeq.length;
        int reqSum = 2;

        ArrayList<Integer> subSeq = new ArrayList<>(n); // non-primitive -> passed by ref

        // int countOfSuchSubSeq = 0; // primitive -> passed by value
        // Integer countOfSuchSubSeq = 0; // non-primitive -> passed by ref
        // FYI - Integer objs are immutable

        printSubSeqWithSumK(mainSeq, n, reqSum, subSeq, 0, 0);
    }

    static void printSubSeqWithSumK(int mainSeq[], int n, int reqSum, ArrayList<Integer> subSeq, int sum, int i) {
        if (sum == reqSum) {
            for (int j : subSeq) {
                System.out.print(j);
            }
            System.out.println();
            return;
        }

        if (i >= n) {
            return;
        }

        // pick curr element in the subseq & go through all such subseqs
        subSeq.add(mainSeq[i]);
        printSubSeqWithSumK(mainSeq, n, reqSum, subSeq, sum + mainSeq[i], i + 1);

        // not pick curr element in the subseq & go through all such subseqs
        subSeq.remove(subSeq.size() - 1);
        printSubSeqWithSumK(mainSeq, n, reqSum, subSeq, sum, i + 1);
    }
}
