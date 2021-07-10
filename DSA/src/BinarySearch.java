import java.util.Arrays;
public class BinarySearch {
    public static int BinarySearchRecursive(int arr[],int value){ // simple method overloading
        return BinarySearchRecursive(arr,value,0,arr.length-1);
    }
    public static int BinarySearchRecursive(int arr[],int value,int start,int end){
        if(start==end && value!=arr[start]){
            return -1;
        }
        // start - start index, end - end index.
        int midpoint = (start+end)/2;
        if(value==arr[midpoint]){ return midpoint; }
        else if(value<arr[midpoint]){
            end = midpoint-1;
        }
        else{
            start=midpoint+1;
        }
        return BinarySearchRecursive(arr,value,start,end);
    }

    public static int BinarySearchIterative(int arr[],int value){
        int start=0,end=arr.length-1,midpoint=(end+start)/2;
        while(arr[midpoint]!=value){
            if (start == end) {
                return -1;
            }

            if(arr[midpoint]>value){
                end=midpoint-1;
            }
            else{
                start=midpoint+1;
            }
            midpoint=(end+start)/2;
        }
        return midpoint;
    }

    public static void main(String[] args) {
        int arr[] = {-22,-4,0,1,3,5};
        Arrays.sort(arr);
        System.out.println(BinarySearchRecursive(arr,5));
        System.out.println(BinarySearchRecursive(arr,1));
        System.out.println(BinarySearchRecursive(arr,2));

        System.out.println();
        System.out.println(BinarySearchIterative(arr,5));
        System.out.println(BinarySearchIterative(arr,1));
        System.out.println(BinarySearchIterative(arr,2));
    }
}
