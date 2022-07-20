import java.util.*;

class Main2
{
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4};
        int arr2[] = {2,4,5,7};
        ArrayList<Integer> result = getArrMergeRes(arr1, arr2);
        for(int i:result){
            System.out.print(i+" ");
        }
    }
    // Assumes both the input arrays are sorted & we want the result array to be sorted as well, just without the
    // common elements.
    // T - O(len1+len2), S - O(1).
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

        // Modified merge 2 sorted arrays, just ignore the common element, once you arrive at it.
        int index1 = 0, index2 = 0;
        while(index1<len1 && index2<len2){
            if(arr1[index1]<arr2[index2]){
                result.add(arr1[index1++]);
            }
            else if(arr1[index1]>arr2[index2]){
                result.add(arr2[index2++]);
            }
            // MODIFICATION IN MERGE 2 SORTED ARRAYS
            else{ // case when both the elements are equal in value
                index1++;
                index2++;
            }
        }

        // add remaining elements of arr1 if any
        while(index1<len1){
            result.add(arr1[index1++]);
        }

        // add remaining elements of arr2 if any
        while(index2<len2){
            result.add(arr2[index2++]);
        }

        return result;
    }

    static void addAllElements(ArrayList<Integer> result, int arr[]){
        for(int i: arr){
            result.add(i);
        }
    }
}
