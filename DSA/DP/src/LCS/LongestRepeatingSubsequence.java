package LCS;

public class LongestRepeatingSubsequence {
    static int longestRepeatingSubsequence(String X, int n){
        // Idea ye he ki X,X mai LCS lagao but slight modification ke sath.
        // Basically, jab last element match ho raha tha to mai char ko include kar raha tha LCS mai
        // lekin ab ek check aur lagana padega include karne se pehle wo ye ki the index shoudnt be the
        // same, meaning agr koi chars match ho raha he to I want them to be of different indices

        // dp matrix
        int t[][] = new int[n+1][n+1];

        // init
        for(int i=0;i<n+1;i++) t[i][0]=0;
        for(int j=1;j<n+1;j++) t[0][j]=0;

        // processing
        for(int i=1;i<n+1;i++){
            for(int j=1;j<n+1;j++){
                // modification is done here
                if(X.charAt(i-1)==X.charAt(j-1) && i!=j){
                    t[i][j] = 1 + t[i-1][j-1];
                }
                else{
                    t[i][j] = Math.max(t[i-1][j],t[i][j-1]);
                }
            }
        }

        return t[n][n];

    }
    public static void main(String[] args) {
        System.out.println(longestRepeatingSubsequence("AABEBCDD",8)); // ABD
        System.out.println(longestRepeatingSubsequence("AABEBCDDKK",10)); // ABDK
        System.out.println(longestRepeatingSubsequence("AAABBEBCDDD",11)); // AABBDD
    }
}
