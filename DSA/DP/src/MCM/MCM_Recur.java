package MCM;

public class MCM_Recur {
    static int mcmRecur(int arr[], int i, int j){
        // Note - i should start from 1st index not the 0th index
        // kyoki Ai matrix ki dimensions -> arr[i-1] x arr[i]
        // j should start from the last index of array

        // base condition
        if(i>=j) return 0;
        // in cases mai cost 0 aa rahi he

        int ans = Integer.MAX_VALUE;

        // VERY IMP -
        // k<=j karenge to infinite recursion ho jaega.
        for(int k=i;k<j;k++){
            int tempAns = mcmRecur(arr,i,k) + mcmRecur(arr,k+1,j) + (arr[i-1]*arr[k]*arr[j]);
            ans = Math.min(ans, tempAns);
        }

        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {40, 20, 30, 10, 30};
        System.out.println(mcmRecur(arr, 1, arr.length-1));
    }
}
