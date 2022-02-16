public class EqualSumPartition {
    public static void main(String args[]) {
        // Equal Sum Partition
        System.out.println(equalSumPartition(new int[]{1,5,5,11}, 4));
    }
    public static boolean equalSumPartition(int arr[], int n){
        int sum=0;
        for(int i:arr){
            sum+=i;
        }
        
        if(sum%2!=0) return false;
        
        return subsetSum(arr, sum/2, arr.length);
    }
    public static boolean subsetSum(int arr[], int sum, int n){
        boolean t[][] = new boolean[n+1][sum+1];
        
        // Initialization
        for(int j=1;j<sum+1;j++) t[0][j] = false;
        for(int i=0;i<n+1;i++) t[i][0] = true;
        
        // Processing
        for(int i=1;i<n+1;i++){
            for(int j=1;j<sum+1;j++){
                if(arr[i-1]<=j){
                    t[i][j] = t[i-1][j-arr[i-1]] || t[i-1][j];
                }
                else{
                    t[i][j] = t[i-1][j];
                }
            }
        }
        
        // Final ans is the prob in which I have considered n elements from arr and
        // want to make a subset whose sum is "sum"
        return t[n][sum];
    }
}