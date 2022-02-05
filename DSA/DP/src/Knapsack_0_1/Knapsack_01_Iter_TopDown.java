package Knapsack_0_1;

import java.util.Arrays;

public class Knapsack_01_Iter_TopDown {
    public static void main(String[] args) {
        int n=3, w=6;
        int wt[] = {1,3,5};
        int val[] = {2,1,4};
        int t[][] = new int[n+1][w+1];

        // Initialization from Base condition of recursion
        // making 0th row and 0th column = 0 of t[][]
        for(int i=0;i<n+1;i++){
            if(i==0){
                Arrays.fill(t[0],0);
            }
            else{
                t[i][0] = 0;
            }
        }

        // Processing for ans by filling t[][]
        for(int i=1;i<n+1;i++){
            for(int j=1;j<w+1;j++){
                // 0th row aur column ko process karne ki zaroorat ni he.
                if(wt[i-1]<=j){
                    t[i][j] = Math.max(val[i-1]+t[i-1][j-wt[i-1]], t[i-1][j]);
                }
                else{
                    t[i][j] = t[i-1][j];
                }
            }
        }

        // Our result will be t[n][w]
        System.out.println(t[n][w]);
    }
}
