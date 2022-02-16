package Knapsack_Unbounded;

public class RodCuttingProblem {
    static int rodCuttingProblem(int len[], int price[], int L) {
        int n = len.length;

        int t[] = new int[L + 1];

        // init
        for (int i = 0; i < L + 1; i++) t[i] = 0;

        for (int i = 0; i < L + 1; i++) { // picked a subproblem
            for (int j = 0; j < n; j++) { // iterating through ALL the elements
                if (len[j] <= i) { // checking whether we can place that element or not
                    t[i] = Math.max(t[i], price[j] + t[i - len[j]]); // placing the max
                }
            }
        }

        return t[L]; // final ans.
    }


//    static int rodCuttingProblemUNOPTIMIZED(int len[], int price[], int L) {
//        int n = len.length;
//        int t[][] = new int[n + 1][L + 1];
//
//        for (int i = 0; i < n + 1; i++) t[i][0] = 0;
//        for (int j = 0; j < L + 1; j++) t[0][j] = 0;
//
//        for (int i = 1; i < n + 1; i++) {
//            for (int j = 1; j < L + 1; j++) {
//                if (len[i - 1] <= j) {
//                    t[i][j] = Math.max(price[i - 1] + t[i][j - len[i - 1]], t[i - 1][j]);
//                } else {
//                    t[i][j] = t[i - 1][j];
//                }
//            }
//        }
//
//        return t[n][L];
//    }

    public static void main(String[] args) {
        int len[] = {1,2,3,4,5,6,7,8};
        int price[] = {3,5,8,9,10,17,17,20};
        int L = 8;
        System.out.println(rodCuttingProblem(len, price, L));
    }
}
