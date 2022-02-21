package LCS;

public class PrintLCS {
    static String printLCS(String X, int n, String Y, int m) {
        int t[][] = getLCSMatrix(X, n, Y, m);

        // trivial case
        // ek bhi char ni he longest common subsequence mai to obv. LCS is empty string.
        if (t[n][m] == 0) return "";

        int i = n, j = m;
        String ans = "";
        while (i != 0 && j != 0) {
            if (X.charAt(i - 1) == Y.charAt(j - 1)) {
                ans = "" + X.charAt(i - 1) + ans;
                i--;
                j--;
            } else {
                if (t[i][j - 1] > t[i - 1][j]) {
                    j--;
                } else {
                    i--;
                }
            }
        }

        return ans;
    }

    static int[][] getLCSMatrix(String X, int n, String Y, int m) {
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

        return t;
    }

    public static void main(String[] args) {
        int n = 6;
        String X = "abcdrh";
        int m = 7;
        String Y = "abedfhr";
        System.out.println(printLCS(X, n, Y, m));

        n = 4;
        X = "abcd";
        m = 4;
        Y = "wxyz";
        System.out.println(printLCS(X, n, Y, m));

        n = 5;
        X = "abcdz";
        m = 4;
        Y = "wxyz";
        System.out.println(printLCS(X, n, Y, m));
    }
}
