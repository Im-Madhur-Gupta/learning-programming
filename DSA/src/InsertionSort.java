public class InsertionSort {
    public static void insertion_sort_me(int input[]){
        int toBeInserted,m;
        for(int i=1;i<input.length;i++){
            toBeInserted = input[i];
            // after below while loops completes execution, this variable will contain the index ahead of which we
            // have to insert an element.
            for(m=i-1;m>=0 && input[m]>toBeInserted;m--){
                input[m+1] = input[m];
            }
            input[m+1] = toBeInserted;
        }
    }

    public static void main(String[] args) {
        int temp_arr[] = {2,5,1,-62,0,123,2,3,1,-2,-1};
        insertion_sort_me(temp_arr);
        for(int i:temp_arr){
            System.out.print(i+" ");
        }
    }
}