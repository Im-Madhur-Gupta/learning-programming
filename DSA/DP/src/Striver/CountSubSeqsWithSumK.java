package Striver;

public class CountSubSeqsWithSumK {
    public static void main(String[] args) {
        int mainSeq[] = { 1, 2, 1 };
        int n = mainSeq.length;
        int reqSum = 2;

        System.out.println("Count of such sub sequences - " + printSubSeqWithSumK(mainSeq, n, reqSum, 0, 0));
        ;
    }

    static int printSubSeqWithSumK(int mainSeq[], int n, int reqSum, int sum, int i) {
        if (sum == reqSum) {
            return 1;
        }

        if (sum > reqSum || i >= n) {
            return 0;
        }

        // pick curr element in the subseq & go through all such subseqs
        int countIncl = printSubSeqWithSumK(mainSeq, n, reqSum, sum + mainSeq[i], i + 1);

        // not pick curr element in the subseq & go through all such subseqs
        int countExcl = printSubSeqWithSumK(mainSeq, n, reqSum, sum, i + 1);

        return countExcl + countIncl;
    }
}
