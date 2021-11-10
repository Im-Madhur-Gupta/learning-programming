class Solution {
    public void duplicateZeros(int[] arr) {
        int num0s = 0;
        for (int k : arr) {
            if (k == 0) num0s++;
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == 0) {
                num0s--;
            }
            if(i+num0s<arr.length){
                arr[i+num0s] = arr[i];
                if(arr[i]==0 && i+num0s+1<arr.length){
                    arr[i+num0s+1] = 0;
                }
            }
        }
    }
}