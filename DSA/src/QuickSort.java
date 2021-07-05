public class QuickSort {
    // Udemy course implementation of QuickSort is bad, the one on gog is good, I have just taken the pivot to be the
    // 1st element arr[0] rather than last.
    public static void quick_sort_me(int arr[],int lower,int upper) {
        // lower - lowest index, upper - highest index
        if (lower < upper) {
            int pivotIndex = partition_quick_sort(arr, lower, upper);
            quick_sort_me(arr, lower, pivotIndex-1);
            quick_sort_me(arr, pivotIndex + 1, upper);
        }
    }
    public static int partition_quick_sort(int arr[],int lower,int upper){
        // This implementation takes 1st index of array/subarray as pivot.
        int i=lower,j=lower+1;
        while(j<=upper){
            if(arr[j]<arr[lower]){
                swap(arr,++i,j);
            }
            j++;
        }
        swap(arr,i,lower);
        return i;
    }
    public static void swap(int arr[],int index1,int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public static void main(String[] args) {
        int temp_arr[] = {2,5,1,-62,0,123,2,3,1,-2,-1};
        quick_sort_me(temp_arr,0, temp_arr.length-1);
        for(int i:temp_arr){
            System.out.print(i+" ");
        }
    }
}
