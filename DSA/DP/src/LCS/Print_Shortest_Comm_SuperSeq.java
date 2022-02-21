package LCS;

public class Print_Shortest_Comm_SuperSeq {
    static int[][] getSCSMatrix(String X, int n, String Y, int m) {
        // dp matrix
        int t[][] = new int[n + 1][m + 1];

        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < m + 1; j++) {
                // init
                // agr ek string ki length 0 he to shortest comm superseq ki length dusri str
                // ki len ke barabar ho jaegi.
                if (i == 0) t[i][j] = j;
                else if (j == 0) t[i][j] = i;

                    // processing
                else if (X.charAt(i - 1) == Y.charAt(j - 1)) {
                    t[i][j] = 1 + t[i - 1][j - 1];
                } else {
                    t[i][j] = 1 + Math.min(t[i - 1][j], t[i][j - 1]);
                }
            }
        }

        return t;
    }

    static String getSCSString(String X, int n, String Y, int m) {
        int t[][] = getSCSMatrix(X, n, Y, m);
        String ans = "";
        int i = n, j = m;
        while (i != 0 && j != 0) {
            if (X.charAt(i - 1) == Y.charAt(j - 1)) {
                ans = "" + X.charAt(i - 1) + ans;
                i--;
                j--;
            } else {
                // min ki dierction mai jao
                // aur jo string se ek char hataya tha us hate hue char ko include karlena ans mai.
                if (t[i - 1][j] < t[i][j - 1]) {
                    ans = "" + X.charAt(i - 1) + ans;
                    i--;
                } else {
                    ans = "" + Y.charAt(j - 1) + ans;
                    j--;
                }
            }
        }

        // Ab ho sakta he ki i=0 ho and j!=0, vice-versa and i=0 and j=0.
        while (j != 0) { // Y string ke bache hue chars copy kardo
            ans = "" + Y.charAt(j - 1) + ans;
            j--;
        }
        while (i != 0) { // X ke bache hue chars copy kardo
            ans = "" + X.charAt(i - 1) + ans;
            i--;
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(getSCSString("AGGTAB", 6, "GXTXAYB", 7));
        System.out.println(getSCSString("pear", 4, "peach", 5));
    }
}
