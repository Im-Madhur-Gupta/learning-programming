class SearchRotatedSortedArray
{
    public static void main(String[] args) {
        int nums[] = {5, 6, 7, 8, 9, 10, 1, 2, 3};
        int n = 9;
        int k = 2;
        System.out.println(searchRotatedArray(nums, n, k));
    }

    static int searchRotatedArray(int nums[], int n, int key){
        // trivial cases
        if(n==0) return -1;

        int low=0, high=n-1, mid;
        while(low<=high){
            mid = low + (high-low)/2;

            if(nums[mid]==key) return mid;
            else if(nums[low]<=nums[mid-1]){
                // [low,mid-1] is sorted
                if(nums[low]>key || nums[mid-1]<key) low = mid+1;
                else high = mid-1;
            }
            else{
                // [mid+1,high] is sorted
                if(nums[mid+1]>key || nums[high]<key) high = mid-1;
                else low = mid+1;
            }
        }

        // if the loop exits after complete execution that means the element k is not present in the array
        return -1;
    }
}
