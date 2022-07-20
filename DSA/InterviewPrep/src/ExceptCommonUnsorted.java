import java.util.*;

class Main1
{
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4};
        int arr2[] = {5,4,2,7};
        ArrayList<Integer> result = getArrMergeRes(arr1, arr2);
        for(int i:result){
            System.out.print(i+" ");
        }
    }
    // Assumes both the arrays are unsorted.
    // T - O(len1+len2), S - O(min(len1, len2)).
    static ArrayList<Integer> getArrMergeRes(int arr1[], int arr2[]){
        int len1 = arr1.length, len2 = arr2.length;

        ArrayList<Integer> result = new ArrayList(len1+len2);

        // trivial cases
        if(len1==0 && len2==0) return result;
        if(len1==0){
            addAllElements(result, arr2);
            return result;
        }
        if(len2==0){
            addAllElements(result, arr1);
            return result;
        }

        // create a hashset to store all the common elements of the arrays
        int minLen = len1, maxLen = len2;
        int[] minLenArr = arr1, maxLenArr = arr2;
        if(len2<len1){
            minLen = len2;
            maxLen = len1;
            minLenArr = arr2;
            maxLenArr = arr1;
        }

        HashSet<Integer> numsMinLen = new HashSet<>();
        for(int i:minLenArr){
            numsMinLen.add(i);
        }
        HashSet<Integer> commonNums = new HashSet<>();
        for(int i:maxLenArr){
            if(numsMinLen.contains(i)){
                // found a common element
                commonNums.add(i);
            }
        }

        // iterating over arr1 and arr2 one by one and adding all elements except the common ones
        for(int i:arr1){
            if(!commonNums.contains(i)){
                result.add(i);
            }
        }
        for(int i:arr2){
            if(!commonNums.contains(i)){
                result.add(i);
            }
        }

        return result;
    }

    static void addAllElements(ArrayList<Integer> result, int arr[]){
        for(int i: arr){
            result.add(i);
        }
    }
}
