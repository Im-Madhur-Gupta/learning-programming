package Striver;

import java.util.*;

public class PrintAllSubSequence {
    public static void main(String[] args) {
        int mainSeq[] = { 3, 1, 2 };
        int n = 3;
        printAllSubSeq(mainSeq, new ArrayList<Integer>(n), 0);
    }

    // tc - O(n*(2^n)), sc - O(n)
    static void printAllSubSeq(int mainSeq[], List<Integer> subSeq, int i) {
        if (i >= mainSeq.length) {
            for (int j : subSeq) {
                System.out.print(j);
            }
            System.out.println();
            return;
        }

        // TAKE the nth element and get all such sub seqs in which nth element is picked
        subSeq.add(mainSeq[i]);
        printAllSubSeq(mainSeq, subSeq, i + 1);

        // NOT TAKE the nth element and get all such sub seqs in which nth element is
        // not picked
        // subSeq.remove(Integer.valueOf(mainSeq[n])); // Instead of doing this
        // we can do this as the element was appended to the list
        subSeq.remove(subSeq.size() - 1);
        printAllSubSeq(mainSeq, subSeq, i + 1);
    }
}
