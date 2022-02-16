package Knapsack_Unbounded;

public class CoinChange2 {
    // Need to return the minimum number of coins that can make the given sum
    // If it’s not possible to make a sum, print -1.
    static int coinChange2(int coins[], int sum) { // DP based soln
        int n = coins.length;

        int t[] = new int[sum+1];

        // Init - IMP
        t[0]=0; // 0 sum ke corresponding min num. of coins = 0.
        for(int j=1;j<sum+1;j++) t[j]=Integer.MAX_VALUE-1;
        // MAX_VALUE-1 isliye kiya he kyoki badme is value mai +1 hoga to overflow na kare.

        // Processing
        // Will follow similar approach to what we did in coinChange1, diff. is that I will calc. min.
        // num. of coins req. to make the sum.
        int countIfUsed;
        for(int i=0;i<n;i++){  // ek coin uthaya
            for(int j=coins[i];j<sum+1;j++){ // uss coin aur uske pehle processed sare coins se sari
                // solvable subprobs solve ki, aur min num of coins rakhe sari subprobs mai.

                countIfUsed = 1 + t[j-coins[i]];
                // Agr maine current coin, current subproblem mai use kar liya to kitne min num of coins ayenge.

                if(countIfUsed<t[j]){
                    t[j] = countIfUsed;
                }
            }
        }

        if(t[sum]==Integer.MAX_VALUE-1){
            return -1;
        }
        // final ans
        return t[sum];
    }

    public static void main(String[] args) {
        System.out.println("TC 1: "+coinChange2(new int[]{25, 10, 5}, 30));
        System.out.println("TC 2: "+coinChange2(new int[]{9, 6, 5, 1}, 11));
        System.out.println("TC 3: "+coinChange2(new int[]{9, 6, 5, 2}, 1));
    }
}
