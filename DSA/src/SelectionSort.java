public class SelectionSort {
    public static void selection_sort_me(int arr[]){
        int minIndex;
        for(int i=0;i<arr.length;i++){
            minIndex=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minIndex]>arr[j]){
                    minIndex = j;
                }
            }
            if(minIndex==i){continue;}
            else{
                arr[i] = arr[i] + arr[minIndex];
                arr[minIndex] = arr[i] - arr[minIndex];
                arr[i] = arr[i] - arr[minIndex];
            }
        }
    }

    public static void main(String[] args) {
        int temp_arr[] = {2,5,1,-62,0,123,2,3,1,-2,-1};
        selection_sort_me(temp_arr);
        for(int i:temp_arr){
            System.out.print(i+" ");
        }
    }
}