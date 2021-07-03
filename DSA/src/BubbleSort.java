// This is an Optimized Bubble Sort Implementation.
public class BubbleSort {
    public static void bubble_sort_me(int arr[]){
        int num_of_swaps;
        int lastIndex = arr.length-1;
        do{
            num_of_swaps = 0;
            for(int i=0;i!=lastIndex;i++){
                if(arr[i]>arr[i+1]){
                    swap(arr,i,1);
                    num_of_swaps++;
                }
            }
            lastIndex--;
        }while(num_of_swaps!=0);
    }

    public static void improved_bubble_sort_me(int arr[]){
        // Only a minute difference is seen in time taken.
        // jump - kitni jumps aage wale element se compare karna he.
        int swaps;
        for (int jump=arr.length/2;jump>0;jump/=2)
        {
            if(jump==1){
                bubble_sort_me(arr);
                return;
            }
            do{
                swaps=0;
                for(int i=0;i+jump<arr.length;i++) {
                    if(arr[i]>arr[i+jump]) {
                        swap(arr,i,jump);
                        swaps++;
                    }
                }
            }while(swaps!=0);
        }
    }

    public static void swap(int arr[],int i,int jump){
        arr[i] = arr[i] + arr[i+jump];
        arr[i+jump] = arr[i] - arr[i+jump];
        arr[i] = arr[i] - arr[i+jump];
    }

    public static void main(String[] args) {
        int temp_arr[] = {2,5,1,-62,0,123,2,3,1,-2,-1};
        int temp_arr1[] = {2,5,1,-62,0,123,2,3,1,-2,-1};

        long start = System.nanoTime();
        bubble_sort_me(temp_arr);
        long end = System.nanoTime();
        System.out.println((end-start)/1000000.0);

        start = System.nanoTime();
        improved_bubble_sort_me(temp_arr1);
        end = System.nanoTime();
        System.out.println((end-start)/1000000.0);

//        for(int i:temp_arr){
//            System.out.print(i+" ");
//        }
    }
}

// Primitive datatypes like int when passed to a function, their copy is sent and not the address, so modifying the
// original variable isn't possible, Non-Primitives like arrays, Objects me reference jata he to original value bhi
// change ho jaega.
