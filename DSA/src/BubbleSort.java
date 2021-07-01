// This is an Optimized Bubble Sort Implementation.
public class BubbleSort {
    public static void bubble_sort_me(int arr[]){
        int num_of_swaps;
        int lastIndex = arr.length-1;
        do{
            num_of_swaps = 0;
            for(int i=0;i!=lastIndex;i++){
                if(arr[i]>arr[i+1]){
                    arr[i] = arr[i] + arr[i+1];
                    arr[i+1] = arr[i] - arr[i+1];
                    arr[i] = arr[i] - arr[i+1];
                    num_of_swaps++;
                }
            }
            lastIndex--;
        }while(num_of_swaps!=0);
    }

    public static void main(String[] args) {
        int temp_arr[] = {2,5,1,-62,0,123,2,3,1,-2,-1};
        bubble_sort_me(temp_arr);
        for(int i:temp_arr){
            System.out.print(i+" ");
        }
    }
}

// Primitive datatypes like int when passed to a function, their copy is sent and not the address, so modifying the
// original variable isn't possible, Non-Primitives like arrays, Objects me reference jata he to original value bhi
// change ho jaega.
