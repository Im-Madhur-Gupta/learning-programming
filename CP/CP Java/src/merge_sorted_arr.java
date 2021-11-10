class Solution1 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int arr_temp[] = new int[m + n];
        int i = 0, j = 0, k = 0;
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                arr_temp[k++] = nums1[i++];
            } else {
                arr_temp[k++] = nums2[j++];
            }
        }
        while (i < m) {
            arr_temp[k++] = nums1[i++];
        }
        while (j < n) {
            arr_temp[k++] = nums2[j++];
        }
        System.arraycopy(arr_temp, 0, nums1, 0, m + n);
    }
}