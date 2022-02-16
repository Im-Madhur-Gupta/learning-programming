package Knapsack_Unbounded;

public class UnboundedKnapsackTD {
    static int unboundedKnapsack(int wt[], int val[], int W) {
        int n = wt.length;

        // UNBOUNDED KNAPSACK mai 1D DP MATRIX will work as the number of items available to put
        // in my knapsack doesnt change for changing values of capacity in subproblems.
        int t[] = new int[W + 1]; // dp matrix

        // init
        for (int i = 0; i < W + 1; i++) t[i] = 0; // sari entries 0 se bhardi

        // processing
        for (int i = 0; i < W + 1; i++) { // select a smaller subproblem, then move to bigger ones
            // a knapsack of capacity i, consider ALL the elements (inifinite supply) get max profit

            for (int j = 0; j < n; j++) { // picking an element from all the elements one by one
                if (wt[j] <= i) { // whether we can place our element in knapsack of capacity i or not
                    // if we can then we want the max profit
                    t[i] = Math.max(t[i], val[j] + t[i - wt[j]]);
                    // get the max from the cases where you haven't included this element,
                    // where you have included this element.
                }
                // else matlab I can't keep that element in my knapsack
                // so, simply I have to move to the next element.
                // else clause ka matlab ni he yaha pe so I can omit it.
                // else{
                //     t[i] = t[i]
                // }
            }
        }

        // final answer will be t[W]
        // the subproblem in which you are given a knapsack of capacity W and you are considering all the items
        // given to you, such that element has an infinite supply.
        return t[W];
    }

//    UNBOUNDED KNAPSACK mai 2d dp matrix is NOT req.
//    A 1d dp matrix will work.
//    static int unboundedKnapsackUNOPTIMIZED(int wt[], int val[], int W) {
//        int n = wt.length;
//        int t[][] = new int[n + 1][W + 1];
//
//        // Init
//        for (int i = 0; i < n + 1; i++) t[i][0] = 0;
//        for (int j = 0; j < W + 1; j++) t[0][j] = 0;
//
//        // Processing
//        // 0th row, 0th col ki processing ho chuki he pehle hi
//        for (int i = 1; i < n + 1; i++) {
//            for (int j = 1; j < W + 1; j++) {
//                if (wt[i - 1] <= j) {
//                    // Agr element include kar liya to usko choices se mat hatao
//                    // ho sakta he ki bad mai firse include karle
//                    // Agr reject kiya he to choices mai se hata sakte he
//                    t[i][j] = Math.max(val[i - 1] + t[i][j - wt[i - 1]], t[i - 1][j]);
//                } else {
//                    t[i][j] = t[i - 1][j];
//                }
//            }
//        }
//
//        // Final ans will be t[n][W]
//        return t[n][W];
//    }

    public static void main(String[] args) {
        System.out.println(unboundedKnapsack(new int[]{1, 3, 2}, new int[]{2, 1, 3}, 5));
    }
}
