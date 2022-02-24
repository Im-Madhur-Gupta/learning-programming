package LCS;

public class SequencePatternMatching {
    static int lenLCS(String X, int n, String Y, int m) {
        int t[][] = new int[n + 1][m + 1];

        for (int i = 0; i < n + 1; i++) t[i][0] = 0;
        for (int j = 1; j < m + 1; j++) t[0][j] = 0;

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

    static boolean sequencePatternMaching(String X, int n, String Y, int m) {
        // Is str X a subsequence in str Y or not?
        // agr mai X,Y ke beech LCS ki length nikal lu aur ye length X ki length (here, n)
        // ke barabar aa jae to matlab ye ki X occurs as a subsequence in Y.
        return n == lenLCS(X, n, Y, m);
    }

    public static void main(String[] args) {
        System.out.println(sequencePatternMaching("AXY", 3, "ADXCPY", 6));
        System.out.println(sequencePatternMaching("AYX", 3, "ADXCPY", 6));
    }
}
