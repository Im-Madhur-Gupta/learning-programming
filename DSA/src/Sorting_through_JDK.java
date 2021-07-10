import java.util.Arrays;
public class Sorting_through_JDK {
    public static void main(String[] args) {
        int arr[] = {20,1,5,-3,6,44,0,1,2,33};
        Arrays.sort(arr); // the sort algo used is - Dual-Pivot Quicksort
        for(int i:arr){
            System.out.print(i+" ");
        }

        System.out.println();
        int arr1[] = {5,1,2,9,5,1};
        Arrays.sort(arr1,0,4); // fromIndex is included, toIndex is excluded.
        for(int i:arr1){
            System.out.print(i+" ");
        }

//        sort() method is not for multithreaded use, it only uses 1 thread/core.

//        parallelsort() method is optimized to use multiple threads it divides the array into smaller arrays then
//        sorts them later merges them. Will be faster for large datasets.
        int arr2[] = {5,1,2,9,5,1};
        Arrays.parallelSort(arr2);
        for(int i:arr1){
            System.out.print(i+" ");
        }
    }
}
