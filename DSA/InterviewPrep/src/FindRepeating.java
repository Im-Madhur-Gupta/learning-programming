public class FindRepeating {
    public static void main(String[] args) {
        // nums is sorted
        int nums[] = {1, 2, 3, 4, 5, 5, 6};
        int n = 7;

        System.out.println(findRepeatingElement(nums, n));
    }

    // approach - Finding the first occurence of the repeated element
    // T - O(logn), S - O(1).
    static int findRepeatingElement(int nums[], int n) {
        int low = 0, high = n - 1, mid = 0;
        while (low <= high) {
            mid = low + (high - low) / 2;

            if (nums[mid] == mid + 1) {
                if (mid + 1 < n && nums[mid] == nums[mid + 1]) {
                    // found the element which repeats
                    return nums[mid];
                }
                low = mid + 1;
            } else {
                // nums[mid]==mid
                high = mid - 1;
            }
        }

        return 0; // when n is invalid ie n<=1
    }
}
