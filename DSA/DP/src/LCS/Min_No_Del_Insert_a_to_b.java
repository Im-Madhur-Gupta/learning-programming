package LCS;

public class Min_No_Del_Insert_a_to_b {
    static int lenLCS(String X, int n, String Y, int m) {
        int t[][] = new int[n + 1][m + 1];

        // init
        for (int i = 0; i < n + 1; i++) t[i][0] = 0;
        for (int j = 1; j < m + 1; j++) t[0][j] = 0;

        // processing
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                if (X.charAt(i - 1) == Y.charAt(j - 1)) {
                    t[i][j] = 1 + t[i - 1][j - 1];
                } else {
                    t[i][j] = Math.max(t[i - 1][j], t[i][j - 1]);
                }
            }
        }

        return t[n][m];
    }

    static void min_No_Del_Insert_a_to_b(String a, int n, String b, int m) {
        int lenLCS = lenLCS(a, n, b, m);

        // IMP
        // Consider the conversion of a --> LCS --> b.
        // Number of deletions is equal to the number of chars that are present in "a" but NOT in LCS.
        int noOfDeletions = n - lenLCS;
        // Number of inertions is equal to the number of chars that are present in "b" but NOT in LCS.
        int noOfInsertions = m - lenLCS;

        System.out.println("noOfDeletions - "+noOfDeletions);
        System.out.println("noOfInsertions - "+noOfInsertions);
    }

    public static void main(String[] args) {
        min_No_Del_Insert_a_to_b("heap",4,"pea",3);
    }
}
