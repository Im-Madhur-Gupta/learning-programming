package Knapsack_Unbounded;

public class CoinChange1 {
    // Find number of ways in which you can make the given sum using an unlimited supply of given coins.
    static int coinChange1(int coins[], int sum){
        int n=coins.length;

        int t[] = new int[sum+1];

        // init
        t[0]=1;
        for(int j=1;j<sum+1;j++) t[j]=0;

        // processing
        for(int i=0;i<n;i++){ // ek coin uthao

            // IMPORTANT
            // -> Ab kya karo ki jo coin pick kiya he uski value ke barabar aur badi values of sum
            // wali subproblems ke solns add kardo.
            // -> Ye soln sirf wo wale honge jo ki banae ja sakte he using the current picked coin and
            // coins which where processed before the current coin.
            for(int j=coins[i];j<sum+1;j++){
                t[j] += t[j-coins[i]];
            }
        }

        return t[sum];
    }

//    static int coinChange1UNOPTIMIZED(int arr[], int sum){
//        int n=arr.length;
//        int t[][] = new int[n+1][sum+1];
//
//        // init
//        for(int i=0;i<n+1;i++) t[i][0]=1;
//        for(int j=1;j<sum+1;j++) t[0][j]=0;
//
//        // processing
//        for(int i=1;i<n+1;i++){
//            for(int j=1;j<sum+1;j++){
//                if(arr[i-1]<=j){
//                    t[i][j] = t[i][j-arr[i-1]] + t[i-1][j];
//                }
//                else{
//                    t[i][j]=t[i-1][j];
//                }
//            }
//        }
//
//        // final ans
//        return t[n][sum];
//    }

    public static void main(String[] args) {
        System.out.println("TC 1: "+coinChange1(new int[]{1,3}, 4));
        System.out.println("TC 2: "+coinChange1(new int[]{1,2,3}, 5));
    }
}
