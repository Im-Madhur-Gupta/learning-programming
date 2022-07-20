import java.util.*;

class Main
{
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4};
        int arr2[] = {5,6,3,1};
        int arr3[] = {4,2,9,4};
        getTriplets(arr1, arr2, arr3, 10);
    }
    // Using Binary Search -> T - O((n^2)logn), S - O(1).
    // Using a HashMap -> T - O(n^2), S - O(n).
    static void getTriplets(int arr1[], int arr2[], int arr3[], int target){
        int n = arr1.length;

        // trivial case
        if(n==0){
            System.out.println("not found.");
            return;
        }

        // create and populate the hashset to store the nums in arr1
        HashSet<Integer> arr1Nums = new HashSet<Integer>();
        for(int i:arr1){
            arr1Nums.add(i);
        }

        // pick 1 element each from arr2 and arr3, check whether the required 3rd element is in hashset or not
        for(int i=0;i<n;i++){
            int num1 = arr2[i];
            for(int j=0;j<n;j++){
                int num2 = arr3[j];
                int num3 = target - num1 - num2;
                if(arr1Nums.contains(num3)){
                    // found a triplet
                    System.out.println(num1+" "+num2+" "+num3);
                    return;
                }
            }
        }

        // triplet not found
        System.out.println("not found.");
    }
}
