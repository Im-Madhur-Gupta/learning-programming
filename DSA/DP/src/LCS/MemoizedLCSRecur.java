package LCS;

public class MemoizedLCSRecur {
    static int t[][];
    static int memoizedLCS(String X, int n, String Y, int m){
        if(n==0||m==0) return 0;

        // The value is already calculated
        if(t[n][m]!=-1) return t[n][m];

        if(X.charAt(n-1)==Y.charAt(m-1)){
            t[n][m] = 1+memoizedLCS(X,n-1,Y,m-1);
        }
        else{
            t[n][m] = Math.max(memoizedLCS(X,n-1,Y,m), memoizedLCS(X,n,Y,m-1));
        }
        return t[n][m];
    }
    public static void main(String[] args) {
//        int n=6;
//        String X="abcdgh";
//        int m=5;
//        String Y="abedh";

        int n=6;
        String X="abcdrh";
        int m=7;
        String Y="abedfhr";

        t = new int[n+1][m+1];

        // Initializing the dp matrix with -1s
        for(int i=0;i<n+1;i++){
            for(int j=0;j<m+1;j++){
                t[i][j]=-1;
            }
        }

        System.out.println(memoizedLCS(X,n,Y,m));
    }

}
