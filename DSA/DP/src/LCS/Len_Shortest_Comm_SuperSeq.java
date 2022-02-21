package LCS;

public class Len_Shortest_Comm_SuperSeq {
    static int len_LCS(String X, int n, String Y, int m) {
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

    static int len_Shortest_Comm_SuperSeq(String X, int n, String Y, int m) {
        // Note - Maximum Length of Shortest Common Supersequence is m+n.

        // Simply, jab n+m hoga to LCS wale chars double count ho gae honge
        // To unko ek baar (-) kardo
        // Then we will get the length of Shortest Common Supersequence.
        return n + m - len_LCS(X, n, Y, m);

        // Note - Agr Shortest Common Supersequence print karwani he to logic add karna padega
        // sirf itne se nahi chalega.
    }

    public static void main(String[] args) {
        System.out.println(len_Shortest_Comm_SuperSeq("AGGTAB", 6, "GXTXAYB", 7));
        System.out.println(len_Shortest_Comm_SuperSeq("pear", 4, "peach", 5));
    }
}
