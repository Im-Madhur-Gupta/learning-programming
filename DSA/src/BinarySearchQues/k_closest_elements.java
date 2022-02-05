package BinarySearchQues;

import java.util.ArrayList;
import java.util.List;
import java.lang.Math;

class Solution {
//    public static List<Integer> findClosestElements(int[] arr, int k, int x) {
//        int low=0,high=arr.length-1,mid,closestIndex=0,diff=Math.abs(arr[high]-x);
//        while(low<=high){
//            mid=low+(high-low)/2;
//            if(diff>=Math.abs(arr[mid]-x)){
//                diff=Math.abs(arr[mid]-x);
//                closestIndex=mid;
//            }
//            if(arr[mid]<x){
//                low=mid+1;
//            }
//            else{
//                high=mid-1;
//            }
//        }
//        System.out.println("closest Index "+closestIndex);
//        List<Integer> ans = new ArrayList<>(k);
//        int nums=0,left=1,right=0;
//        boolean marker[] = new boolean[arr.length];
//        while(nums<k){
//            if(closestIndex-left>=0 && closestIndex+right<=arr.length-1){
//                if(Math.abs(arr[closestIndex-left]-x)>Math.abs(arr[closestIndex+right]-x)){
//                    marker[closestIndex+right++]=true;
//                }
//                else{
//                    marker[closestIndex-left++]=true;
//                }
//            }
//            else if(closestIndex-left<0 && closestIndex+right<=arr.length-1){
//                marker[closestIndex+right++]=true;
//            }
//            else{
//                marker[closestIndex-left++]=true;
//            }
//            nums++;
//        }
//        for(int i=0;i<arr.length;i++){
//            if(marker[i]){
//                ans.add(arr[i]);
//            }
//        }
//        return ans;
//    }

    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        // find the left bound of k elements using binary search
        int left = 0;
        int right = arr.length - k; // the biggest index of left bound
        while(left < right){
            int mid = left + (right - left)/2;
            // if mid is to the right of x, then move right will push elements away, so do not move right => right = mid;
            if(x <= arr[mid]) right = mid;

                // if mid + k is on the left side of x, then mid + k is closer than mid for sure, so mid + 1 is a better left bound which can remove futher
                // element: mid, and introduce a closer element: mid + k
            else if(x >= arr[mid + k]) left = mid + 1;

                // if mid and mid + k are on both sides of x, then we are choose between mid and mid + k
                // mid is closer than mid + k, move right will lose a closer one element: mid, and a futher one element: mid + k, so
                // do not move right => right = mid
            else if(x - arr[mid] <= arr[mid + k] - x) right = mid;

                // mid + k is closer one than mid, so mid + 1 is a better left bound, move 1 step right,
                // remove a futher element: mid, and introduce a new closer element: mid + k
            else left = mid + 1;
        }

        // add k elements from left to result
        List<Integer> res = new ArrayList<>();
        for(int i = left; i < left + k; i++){
            res.add(arr[i]);
        }

        return res;
    }

//    public static void main(String[] args) {
//        int arr[] = {1,3};
//        int k=1;
//        int x=2;
//        List<Integer> ans = findClosestElements(arr,k,x);
//        for(int i=0;i<k;i++){
//            System.out.print(ans.get(i)+" ");
//        }
//    }
}
