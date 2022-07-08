/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // nums is sorted
 		int nums[] = {1, 2, 2, 4, 4, 4, 4, 5, 7};
 		int n = 9;
        int x = 1;

        System.out.println(countOccur(nums, n, x));
    }

    // Time - O(logn), Space - O(1)
    static int countOccur(int nums[], int n, int x){
        // trivial cases
        if(n==0) return -1;
        if(nums[0]>x || nums[n-1]<x) return 0;

        int low = 0, high = n-1, mid, savedHigh=-1;
        // finding the left end
        int leftEnd = -1;
        while(low<=high){
            mid = low + (high-low)/2;

            if(nums[mid]<x) low = mid+1;
            else if(nums[mid]>x) high = mid-1;
            else{
                if(savedHigh==-1){
                    savedHigh = high;
                }
                leftEnd = mid;
                high = mid-1;
            }
        }

        // x wasnt not found in the array
        if(leftEnd==-1) return 0;

        // finding the right end
        low = leftEnd; high = savedHigh;
        int rightEnd = -1;
        while(low<=high){
            mid = low + (high-low)/2;

            if(nums[mid]<x) low = mid+1;
            else if(nums[mid]>x) high = mid-1;
            else{
                rightEnd = mid;
                low = mid+1;
            }
        }

        return rightEnd-leftEnd+1;
    }
}
