package BinarySearchQues;

import java.lang.Math;

public class Median_of_2_Sorted_Arrays {
    // Indices here can be -1, 0, 1, ... arr.length. So, we have to handle the invalid indices cases.
    // Remember - Pivot actually imaginary he.
    public static int getVal(int arr[],int i){
        if(i==-1) return Integer.MIN_VALUE;
        if(i==arr.length) return Integer.MAX_VALUE;
        return arr[i];
    }

    // ASSUMPTION - rShort, rLong ke thik peche pivot he OR lShort, lLong ke thik agge pivot he.
    // Isliye yato rShort parameter mai lelo ya lShort parameter mai lelo.
    // Dono se mai lLong, rLong nikal sakta hu.
    public static int[] getIndices(int rShort, int[] aShort, int[] aLong){
        // midIndex yani kitne elements pivot ke left mai honge, utne hi elements right mai honge.
        // refer the img.
        int midIndex = (aShort.length + aLong.length)/2;
        int rLong = midIndex - rShort;
        // left wali indices will be simply right wali - 1.
        return new int[] {rShort-1,rShort,rLong-1,rLong};
    }

    public static int getDirection(int aShort[], int aLong[], int lShort, int rShort, int lLong, int rLong){
        if(getVal(aLong,lLong)>getVal(aShort,rShort)) return 1;
        else if(getVal(aShort,lShort)>getVal(aLong,rLong)) return -1;
        else return 0;
    }

    public static double getResult(int aShort[], int aLong[], int lShort, int rShort, int lLong, int rLong){
        boolean isEven = (aShort.length+aLong.length) % 2 == 0;
        if(isEven){
            return (Math.max(getVal(aShort,lShort), getVal(aLong, lLong)) + Math.min(getVal(aShort,rShort), getVal(aLong, rLong))) / 2.0;
        }
        else{ // Odd case - Imp
            // kyoki maine rShort ko as mid pass kiya he,
            // to current algo ke hisab he 1 extra element hoga final pivot ke right mai.
            // So, odd case mai to pivot is just the smallest of [rShort] and [rLong].
            return Math.min(getVal(aShort,rShort), getVal(aLong, rLong));
        }
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] aShort = nums1, aLong = nums2;
        if(nums1.length>nums2.length) {
            aShort = nums2;
            aLong = nums1;
        }

        // Performing a binary search on the smaller array to find the correct pivot point
        int low=0, high= aShort.length-1, mid;
        int lShort, rShort, lLong, rLong;
        int direction;
        do{
            mid = low + (high-low)/2;

            // mid ko as rShort use kar raha hu
            // mid ko as lShort bhi use kar sakte he, aur uske hisab se getIndices ko modify karde.
            int indices[] = getIndices(mid,aShort,aLong);
            lShort = indices[0];
            rShort = indices[1];
            lLong = indices[2];
            rLong = indices[3];

            direction = getDirection(aShort, aLong, lShort,rShort,lLong,rLong);
            if(direction>0) low=mid+1;
            else if(direction<0) high=mid-1;
        }while(direction!=0);

        return getResult(aShort, aLong, lShort,rShort,lLong,rLong);
    }
}
