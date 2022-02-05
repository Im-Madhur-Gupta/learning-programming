package BinarySearchQues;

import java.util.*;
        import java.lang.*;
        import java.io.*;

class Bin_Search_In_Rotated_Array {
    public static int search(int[] nums, int target) {
        int n = nums.length;
        int low = 0, high = n-1;
        while(low<=high){
            int mid = (low+high)/2;
            // check if the current element is target
            if(nums[mid] == target)
                return mid;
                // if the starting index of the search space has smaller element than current element
            else if(nums[low]<=nums[mid]){
                // if target lies in non-rotated search space (or subarray)
                if(target >= nums[low] && target < nums[mid])
                    high = mid - 1;
                else
                    low = mid + 1;
            } else {
                // if target lies in non-rotated subarray
                if(target>nums[mid] && target<=nums[high])
                    low = mid + 1;
                else
                    high = mid - 1;
            }
        }
        // if you couldn't find the target element until now then it does not exists
        return -1;
    }

    public static void main(String[] args){
        int nums[] = {4,5,6,7,0,1,2};
        System.out.println(search(nums, 4));
    }
}
