package Knapsack_0_1;

public class MInSubsetSumDiff {
    public static void main(String[] args) {
        System.out.println(minSubsetSumDiff(new int[]{2,3,7,11}));
    }

    static boolean[] modifiedSubsetSum(int arr[], int sum) {
        int n = arr.length;
        boolean t[][] = new boolean[n + 1][sum + 1];

        for (int j = 1; j < sum + 1; j++) t[0][j] = false;
        for (int i = 0; i < n + 1; i++) t[i][0] = true;

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < sum + 1; j++) {
                if (arr[i - 1] <= j) {
                    t[i][j] = t[i - 1][j - arr[i - 1]] || t[i - 1][j];
                } else {
                    t[i][j] = t[i - 1][j];
                }
            }
        }

        // MODIFICATION - Now I want the entire last row.
        return t[n];
    }

    static int minSubsetSumDiff(int arr[]) {
        int sum=0;
        for(int i:arr){
            sum+=i;
        }

        int n = arr.length;
        boolean lastRow[] = modifiedSubsetSum(arr, sum/2);

        int diff=0;
        for(int i=sum/2;i>=0;i--){
            // Right se iteration karke aao lastRow mai aur jo 1st true block milega
            // ussi ke corresponding subset diff mera answer hoga.
            if(lastRow[i]){
                diff = sum - 2*i;
                break;
            }
        }

        return diff;
    }
}
