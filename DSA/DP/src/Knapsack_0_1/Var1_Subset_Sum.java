package Knapsack_0_1;

import java.util.Arrays;

public class Var1_Subset_Sum {
    public static void main(String[] args) {
        int n = 5;
        int sum = 7;
        int arr[] = {1, 2, 3, 4, 5};
        boolean t[][] = new boolean[n + 1][sum + 1];

        // Initialization
        for (int i = 0; i < n + 1; i++) {
            if (i == 0) {
                Arrays.fill(t[0], false);
            }
            t[i][0] = true;
        }

        // Processing the rest of the dp matrix to get ans
        for(int i=1;i<n+1;i++){
            for(int j = 1; j< sum +1; j++){
                if(arr[i-1]<=j){
                    t[i][j] = t[i-1][j-arr[i-1]] || t[i-1][j];
                }
                else {
                    t[i][j] = t[i-1][j];
                }
            }
        }

        // Printing the result
        System.out.println(t[n][sum]);
    }
}
