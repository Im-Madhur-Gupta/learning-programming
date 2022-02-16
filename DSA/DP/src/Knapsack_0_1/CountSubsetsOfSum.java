public class CountSubsetsOfSum {
    public static void main(String args[]) {
        // Count Subsets Of Sum
        System.out.println(countSubsetsOfSum(new int[]{1,2,1,2}, 3));
    }
    public static int countSubsetsOfSum(int arr[], int sum){
        int n = arr.length;
        int t[][] = new int[n+1][sum+1];
        
        // Initialization
        for(int j=1;j<sum+1;j++) t[0][j] = 0;
        for(int i=0;i<n+1;i++) t[i][0] = 1;
        
        // Processing
        for(int i=1;i<n+1;i++){
            for(int j=1;j<sum+1;j++){
                if(arr[i-1]<=j){
                    t[i][j] = t[i-1][j-arr[i-1]] + t[i-1][j];
                }
                else{
                    t[i][j] = t[i-1][j];
                }
            }
        }
        
        // Final ans is the prob in which I have considered n elements from arr and I
        // want to count the subsets whose sum is "sum".
        return t[n][sum];
    }
}