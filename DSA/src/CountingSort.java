public class CountingSort {
    public static void counting_sort_me(int arr[],int lower,int upper){
        // Time - O(n) without nested loops (can take -ive and is stable)
        if(upper<lower){
            throw new IllegalArgumentException("Incorrect Range");
        }
        if(upper==lower){
            return;
        }

        int countingArr[] = new int[upper-lower+1];
        for(int i=0;i<arr.length;i++){
            countingArr[arr[i]-lower]++;
        }

        for(int j=1;j<countingArr.length;j++){ // Cumulative sums, taki ye pata chal jae ki each dicrete element se barabar/chote
            // kitne element he (including itself).
            countingArr[j] += countingArr[j-1];
        }
        int outarr[] = new int[arr.length];
        // reverse ja raha hu taki stability rahe
        for(int k=arr.length-1;k>=0;k--){ // Ab maine ye dekha ki arr[k] ke corresponding cumulative sum kya he
            // jitna cumulative sum hoga usme se -1 karke index mill jaegi.
            // say arr[i] = 3 and its cumulative sum = 4 matlab total 4 aise elements he arr me jo 3 ke = ya chote he.
            // ab agr in 4 elements me mujhe 3 ki position/index chahiye to 4-1 karna padega as this 3 will occupy the
            // right-most index (aur mai arr ke R->L traverse kar raha hu to ye 3 actually baki 3s in the total 4 elements
            // me rightmost hoga to aise stable ho ajegi algo)
            outarr[countingArr[arr[k]-lower]-1] = arr[k];
            countingArr[arr[k]-lower]--;
        }

        for(int l=0;l<arr.length;l++){
            arr[l]=outarr[l];
        }
    }
    public static void main(String[] args) {
        int temparr[] = {1,-1,-3,4,-5,6,-7,3,5,4,1,2,8,10};
        counting_sort_me(temparr,-7,10);

        for(int i:temparr){
            System.out.print(i+" ");
        }
    }
}
