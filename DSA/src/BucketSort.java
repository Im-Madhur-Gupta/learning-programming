import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class BucketSort {
    public static void bucket_sort_me(int arr[]){
        // This implementation works only for 2,1 digit numbers. (assumption)
        // I will use an array of Arraylists.
        List<Integer> buckets[] = new List[10]; // yaha se sirf array instantiate ho raha he naki indivisual buckets.
        for(int i=0;i<10;i++){
            buckets[i] = new ArrayList<Integer>(); // Instantiating indivisual buckets.
            // Yaha pe ArrayList ki jagah LinkedList ka use bhi kar sakte the sirf above line me change karna padega.
        }
        for(int j=0;j<arr.length;j++){
            buckets[arr[j]/10].add(arr[j]);
        }
        for(List bucket:buckets){
            Collections.sort(bucket); // Here, Merge sort is used to sort values in a bucket.
        }
        int k=0;
        for(int l=0;l<10;l++){
            // Dont get confused on seeing nested loops, time complexity remians O(n) because the total number of times
            // arr[k++] step runs is for n times only.
            for(int val:buckets[l]){
                arr[k++]=val;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {70,2,32,12,89,22,39,40,1,9};
        bucket_sort_me(arr);
        for(int i:arr){
            System.out.print(i+", ");
        }
    }
}