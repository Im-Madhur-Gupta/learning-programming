package LCS;

public class TDLCS {
    static int topDownLCS(String X, int n, String Y, int m) {
        // dp matrix
        int t[][] = new int[n + 1][m + 1];

        // init
        for (int i = 0; i < n + 1; i++) t[i][0] = 0;
        for (int j = 1; j < m + 1; j++) t[0][j] = 0;

        // processing
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                // X str ki i len aur Y str ki j len wali sub problem utha li
                if (X.charAt(i - 1) == Y.charAt(j - 1)) {
                    t[i][j] = 1 + t[i - 1][j - 1];
                } else {
                    t[i][j] = Math.max(t[i - 1][j], t[i][j - 1]);
                }
            }
        }

        // final ans
        return t[n][m];
    }

    public static void main(String[] args) {
        int n=6;
        String X="abcdrh";
        int m=7;
        String Y="abedfhr";
        System.out.println(topDownLCS(X,n,Y,m));
    }
}
